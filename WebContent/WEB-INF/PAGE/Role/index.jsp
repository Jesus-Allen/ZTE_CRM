<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>


     <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admincss/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admincss/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admincss/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/adminjs/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/adminjs/jquery.sorted.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/adminjs/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/adminjs/ckform.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/adminjs/common.js"></script>
    

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
    角色名称：
    <input type="text" name="rolename" id="rolename"class="abc input-default" placeholder="" value="">&nbsp;&nbsp;  
    <button type="submit" class="btn btn-primary">查询</button>&nbsp;&nbsp; <button type="button" class="btn btn-success" id="addnew">新增角色</button>
</form>
<table class="table table-bordered table-hover definewidth m10" >
    <thead>
    <tr>
        <th>角色id</th>
        <th>角色名称</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    </thead>
	     <tr>
            <td>5</td>
            <td>管理员</td>
            <td>1</td>
            <td>
                  <a href="admin_user_edit.html">编辑</a>
                  
            </td>
        </tr></table>
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
		
			var url = "index.html";
			
			window.location.href=url;		
		
		}
	
	
	
	
	}
</script>