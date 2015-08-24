<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/bootstrap-responsive.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admincss/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admincss/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admincss/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/adminjs/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/adminjs/jquery.sorted.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/adminjs/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/adminjs/ckform.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/adminjs/common.js"></script>
    <script src="${pageContext.request.contextPath}/js/manage.js"></script>
 

    <style type="text/css">
        body {
            padding-bottom: 40px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
</head> 
<body>
<form class="form-inline definewidth m20" action="index.html" method="get">    

   
     <button type="button" class="btn btn-success" id="addnew">新增用户</button>
</form>
<div id="neirong">
<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
        <th>用户权限</th>
        <th>用户名称</th>
        <th>真实姓名</th>
        <th>手机号码</th>
        <th>邮箱</th>
        <th>单位</th>
        <th>产品ID</th>
        <th>注册时间</th>
        <th>操作</th>
        
    </tr>
    </thead>
	    
	      <c:forEach items="${requestScope.userInfo}" var="entry" varStatus="status" >  
					  <tr id="userList">
						 
            <td>${entry.id}</td>
            <td>${entry.userName}</td>
            <td>${entry.name}</td>
            <td>${entry.userTel}</td>
            <td>${entry.userEmail}</td>
            <td>${entry.userUnit}</td>
            <td>${entry.userProductId}</td>
            <td>${entry.regTime}</td>
            <td>
                <a href="admin_user_edit.html?userId=${entry.userId}">编辑</a>  
                <a href="#" onclick="deleteUserInfoByUserId('${entry.userId}')">删除</a>               
            </td>
				</tr>		
					 
					  </c:forEach>
           
        	
</table>
<center>
  <ul class="pagination">
	<c:forEach items="${requestScope.pageList}" var="pageList">
		 ${pageList}
	</c:forEach>
  </ul>
 </center>
 </div>
</body>
</html>
<script>
    $(function () {
        

		$('#addnew').click(function(){

				window.location.href="admin_user_add.html";
		 });


    });

	function del(id)
	{
		
		
		if(confirm("确定要删除吗？"))
		{
		
			var url = "admin_user_index.html";
			
			window.location.href=url;		
		
		}
	
	
	
	
	}
</script>