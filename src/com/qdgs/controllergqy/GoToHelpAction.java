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
	//处理用户请求
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
				 * 使用hql语句进行分页查询
				 * @param hql 需要查询的hql语句
				 * @param offset 第一条记录索引
				 * @param pageSize 每页需要显示的记录数
				 * @return 当前页的所有记录
				 */
				//pageNo取奇数,pageSize偶数
				int totalRecord=questionServiceImpl.getSize();
				int lastCurrentPage=0;//最后一页也码数
				int pageNo=5;
				int index=0;//第一条记录索引
				int firstPage=0;
				int pageSize=10;//每页显示数量
				int currentPage=1;
				List pageList=new ArrayList();//页码列表
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
			    pageList.add("<li><a href="+"help.html?currentPage="+1+">"+"首页"+"</a><li>");
				for(int i=firstPage+1;i<=firstPage+pageNo;i++){
					if(i==currentPage)
				    pageList.add("<li class='active'><a href="+"help.html?currentPage="+i+">"+i+"</a><li>");
					else
					pageList.add("<li><a href="+"help.html?currentPage="+i+">"+i+"</a><li>");
				}
				pageList.add("<li><a href="+"help.html?currentPage="+lastCurrentPage+">"+"尾页"+"</a><li>");System.out.println("size:"+questionServiceImpl.getSize());
				request.setAttribute("question", questionServiceImpl.findByPage("from Question", index, pageSize));
				request.setAttribute("pageList", pageList);
				return "success";
			}
}
