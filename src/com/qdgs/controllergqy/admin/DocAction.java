package com.qdgs.controllergqy.admin;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;
import com.qdgs.bean.Doc;
import com.qdgs.dao.DocDao;
import com.qdgs.global.FenYeService;

public class DocAction extends ActionSupport  implements ServletResponseAware,ServletRequestAware {
	private HttpServletResponse response;
	private HttpServletRequest request;
	private InputStream inputStream;
	private DocDao docDao;
	public DocDao getDocDao() {
		return docDao;
	}
	public void setDocDao(DocDao docDao) {
		this.docDao = docDao;
	}
	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response=response;
	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request=request;
	}
	public InputStream getResult(){
		return inputStream;
	}
	public String show()
			throws Exception{
		int totalRecord=docDao.getSize();
		int lastCurrentPage=0;//最后一页也码数
		int pageNo=5;
		int index=0;//第一条记录索引
		int firstPage=0;
		int pageSize=10;//每页显示数量
		int currentPage=1;
		String requestCurrentPage=request.getParameter("currentPage");
		String html="admin_doc_index.html";
		ArrayList pageList=(ArrayList) FenYeService.pageList(totalRecord, lastCurrentPage, pageNo, index, firstPage, pageSize, currentPage, html, requestCurrentPage).get("pageList");
		index=(int) FenYeService.pageList(totalRecord, lastCurrentPage, pageNo, index, firstPage, pageSize, currentPage, html, requestCurrentPage).get("index");
		request.setAttribute("doc",  docDao.findByPage("from Doc", index, pageSize));
		request.setAttribute("pageList", pageList);
		
		return "success";
	}
	public String delete() throws  Exception{
		String docId=request.getParameter("docId");
		docDao.delete(docId);
		inputStream=new ByteArrayInputStream("0".getBytes("UTF-8"));
		return "success";
	}
	public String change() throws  Exception{
		String vs=request.getParameter("vs");
		String docId=request.getParameter("docId");
		Doc doc=docDao.get(docId);
		if(vs==null || vs.equals("")){
			inputStream=new ByteArrayInputStream("0".getBytes("UTF-8"));	
		}
		else{
			doc.setDocKind(vs);
			docDao.update(doc);
			inputStream=new ByteArrayInputStream("1".getBytes("UTF-8"));	
		}
		
		
		return "success";
	}
	public String showfront() throws Exception{
		List list=docDao.findAll();
	    request.setAttribute("list",list);
		return "success";
	}
}
