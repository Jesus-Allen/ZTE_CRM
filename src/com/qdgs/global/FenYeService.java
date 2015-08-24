package com.qdgs.global;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FenYeService {
	public static Map pageList(int totalRecord, int lastCurrentPage, int pageNo,
			int index, int firstPage, int pageSize, int currentPage, String html,String requestCurrentPage) {
		// TODO Auto-generated method stub
        Map map=new HashMap();
		ArrayList pageList=new ArrayList();//Ò³ÂëÁÐ±í  
		if(requestCurrentPage!=null){
			currentPage=Integer.parseInt(requestCurrentPage);
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
	    pageList.add("<li><a href="+html+"?currentPage="+1+">"+"Ê×Ò³"+"</a><li>");
		for(int i=firstPage+1;i<=firstPage+pageNo;i++){
			if(i==currentPage)
		    pageList.add("<li class='active'><a href="+html+"?currentPage="+i+">"+i+"</a><li>");
			else
			pageList.add("<li><a href="+html+"?currentPage="+i+">"+i+"</a><li>");
		}
		pageList.add("<li><a href="+html+"?currentPage="+lastCurrentPage+">"+"Î²Ò³"+"</a><li>");
		map.put("pageList", pageList);
		map.put("index", index);
		return map;
	}
}
