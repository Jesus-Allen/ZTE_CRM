<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="NaveBar.jsp"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 		
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>帮助</title>
</head>
<body>
 
<div class="container" style="background-color:white;height:800px">
	<div class="row" style="height:70px"></div>
	<div class="row">
		<div class="col-md-offset-1 col-md-10">
			<ul id="myTab" class="nav nav-tabs">
			   <li class="active">
				  <a href="#question" data-toggle="tab">
					 网站常见问题FAQ
				  </a>
			   </li>
			   <li>
				  <a href="#manager" data-toggle="tab">
					 网站后台管理FAQ
				  </a>
			   </li>
			</ul>
			<div id="myTabContent" class="tab-content">
			   <div class="tab-pane fade in active" id="question">
				  <table class="table table-striped">
					<caption><b>帮助信息列表</b></caption>
					<thead>
					  <tr>
						 <th>标题</th>
						 <th>点击次数</th>
						 <th>发布时间</th>
					  </tr>
					</thead>
					<tbody>
					  <c:forEach items="${requestScope.question}" var="entry" varStatus="status" >  
					  <tr>
						 <td class="col-md-6"><a href="questioncontent.html?qid=${entry.id}" target="_blank">${entry.title}</a> </td>
						 <td class="col-md-2">${entry.times}</td>
						 <td class="col-md-2">${entry.publishTime}</td>
					  </tr>
					 
					  </c:forEach>
				   </tbody>
				  </table>
				  <center>
				  <ul class="pagination">
				       <c:forEach items="${requestScope.pageList}" var="pageList">
				         ${pageList}
				       </c:forEach>
				 </ul>
				 </center>
			   </div>
			   <div class="tab-pane fade" id="manager">
				  <table class="table table-striped">
					<caption><b>帮助信息列表</b></caption>
					<thead>
					  <tr>
						 <th>标题</th>
						 <th>点击次数</th>
						 <th>发布时间</th>
					  </tr>
					</thead>
					<tbody>
					  <tr>
						 <td class="col-md-6">暂无信息</td>
						 <td class="col-md-2">暂无信息</td>
						 <td class="col-md-2">暂无信息</td>
					  </tr>
					 
				   </tbody>
				  </table>
			   </div>
			</div>
		</div>
	</div>
</div>

</body>
</html>
<jsp:include page="Footer.jsp"/>