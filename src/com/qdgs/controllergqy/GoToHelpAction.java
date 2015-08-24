package com.qdgs.controllergqy;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;
import com.qdgs.dao.QuestionDao;
import com.qdgs.service.QuestionService;

public class GoToHelpAction extends ActionSupport  implements ServletResponseAware,ServletRequestAware{
	//�����û�����
	private QuestionService questionServiceImpl;
	private HttpServletResponse response;
	private HttpServletRequest request;
	public QuestionService getQuestionServiceImpl() {
		return questionServiceImpl;
	}
	public void setQuestionServiceImpl(QuestionService questionServiceImpl) {
		this.questionServiceImpl = questionServiceImpl;
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
	
   
			public String execute()
				throws Exception
			{   /**
				 * ʹ��hql�����з�ҳ��ѯ
				 * @param hql ��Ҫ��ѯ��hql���
				 * @param offset ��һ����¼����
				 * @param pageSize ÿҳ��Ҫ��ʾ�ļ�¼��
				 * @return ��ǰҳ�����м�¼
				 */
				//pageNoȡ����,pageSizeż��
				int totalRecord=questionServiceImpl.getSize();
				int lastCurrentPage=0;//���һҳҲ����
				int pageNo=5;
				int index=0;//��һ����¼����
				int firstPage=0;
				int pageSize=10;//ÿҳ��ʾ����
				int currentPage=1;
				List pageList=new ArrayList();//ҳ���б�
				if(request.getParameter("currentPage")!=null){
					currentPage=Integer.parseInt(request.getParameter("currentPage"));
				}
				if(totalRecord/pageSize<=pageNo){
					if(totalRecord%pageSize==0){
						lastCurrentPage=totalRecord/pageSize;
					  }else{
					    lastCurrentPage=totalRecord/pageSize+1;
					  }
				}else{
				    if(totalRecord%pageSize==0){
					    lastCurrentPage=totalRecord/pageSize+(pageNo-1)/2;
				      }else{
				        lastCurrentPage=totalRecord/pageSize+1+(pageNo-1)/2;
				      }
				}
				
				if(currentPage>=pageNo){
					firstPage=currentPage-(pageNo-1)/2;
					index=pageSize*firstPage;
				}
				
			    if(currentPage<pageNo){
			    	index=pageSize*(currentPage-1);
			    	
			    } 
			    pageList.add("<li><a href="+"help.html?currentPage="+1+">"+"��ҳ"+"</a><li>");
				for(int i=firstPage+1;i<=firstPage+pageNo;i++){
					if(i==currentPage)
				    pageList.add("<li class='active'><a href="+"help.html?currentPage="+i+">"+i+"</a><li>");
					else
					pageList.add("<li><a href="+"help.html?currentPage="+i+">"+i+"</a><li>");
				}
				pageList.add("<li><a href="+"help.html?currentPage="+lastCurrentPage+">"+"βҳ"+"</a><li>");System.out.println("size:"+questionServiceImpl.getSize());
				request.setAttribute("question", questionServiceImpl.findByPage("from Question", index, pageSize));
				request.setAttribute("pageList", pageList);
				return "success";
			}
}
