package com.qdgs.controllergqy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.qdgs.bean.Doc;
import com.qdgs.dao.DocDao;


public class UploadAction extends ActionSupport implements ServletResponseAware,ServletRequestAware{
	private DocDao docDao;
	private File uploadify; 
	private String uploadifyFileName;
	private HttpServletResponse response;
	private HttpServletRequest request;
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
	 @SuppressWarnings("deprecation")
	 public String uploadFile() throws Exception {
	  
	  String extName = "";//扩展名  
	  String newFileName= "";//新文件名
	  
	  String nowTime = new SimpleDateFormat("yyyymmddHHmmss").format(new Date());//当前时间
	  //String savePath="http://localhost:8083/ZteServiceProvider/File/";
	  String savePath="E:\\Java\\work3\\zteservice-master\\WebContent\\File\\";
	  //String savePath = ServletActionContext.getServletContext().getRealPath("");
	  
	 // savePath = savePath +"/File/";
	  System.out.print("路径"+savePath);
	  HttpServletResponse response = ServletActionContext.getResponse();
	  response.setCharacterEncoding("utf-8");
	  
	  //获取扩展名
	  if(uploadifyFileName.lastIndexOf(".")>=0){
	   extName = uploadifyFileName.substring(uploadifyFileName.lastIndexOf("."));
	   System.out.println("filename:"+uploadifyFileName);
	  }
	  //newFileName = nowTime+extName;//重新定名
	  newFileName=uploadifyFileName;//不重新定名
	  
	  uploadify.renameTo(new File(savePath+newFileName));
	  Doc doc=new Doc();
	  doc.setDocId(nowTime);
	  doc.setDocKind("请分类");
	  doc.setDocName(newFileName);
	  docDao.save(doc);
	  response.getWriter().print(uploadifyFileName+"上传成功");
	  
	       return null; //这里不需要页面转向，所以返回空就可以了
	 }

	 public File getUploadify() {
	  return uploadify;
	 }

	 public void setUploadify(File uploadify) {
	  this.uploadify = uploadify;
	 }

	 public String getUploadifyFileName() {
	  return uploadifyFileName;
	 }

	 public void setUploadifyFileName(String uploadifyFileName) {
	  this.uploadifyFileName = uploadifyFileName;
	 }
	
}