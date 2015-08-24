<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <jsp:include page="NaveBar.jsp"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>资料下载</title>
<script src="${pageContext.request.contextPath}/js/service.js"></script>
<style type="text/css">
    /* Custom Styles */
    ul.nav-tabs{
        width: 140px;
        margin-top: 20px;
        border-radius: 4px;
        border: 1px solid #ddd;
        box-shadow: 0 1px 4px rgba(0, 0, 0, 0.067);
    }
    ul.nav-tabs li{
        margin: 0;
        border-top: 1px solid #ddd;
    }
    ul.nav-tabs li:first-child{
        border-top: none;
    }
    ul.nav-tabs li a{
        margin: 0;
        padding: 8px 16px;
        border-radius: 0;
    }
    ul.nav-tabs li.active a, ul.nav-tabs li.active a:hover{
        color: #fff;
        background: #0088cc;
        border: 1px solid #0088cc;
    }
    ul.nav-tabs li:first-child a{
        border-radius: 4px 4px 0 0;
    }
    ul.nav-tabs li:last-child a{
        border-radius: 0 0 4px 4px;
    }
    ul.nav-tabs.affix{
        top: 30px; /* Set the top position of pinned element */
    }
</style>
<script type="text/javascript">
$(document).ready(function(){
    $("#myNav").affix({
        offset: { 
            top: 125 
     	}
    });
});
</script>
</head>

<body data-spy="scroll" data-target="#myScrollspy">
<div class="container">
  
	<div class="jumbotron">
        <h1>服务</h1>
    </div>
    <div class="row">
        <div class="col-xs-3" id="myScrollspy">
            <ul class="nav nav-tabs nav-stacked" id="myNav">
                <li class="active"><a href="#section-1">登记备件服务请求</a></li>
                <li><a href="#section-2">提交服务请求 </a></li>
                <li><a href="#section-3">服务请求查询</a></li>
                <li><a href="#section-4">订阅版本发布信息 </a></li>
            </ul>
        </div>
        <div class="col-xs-9">
            <h2 id="section-1">登记备件服务请求</h2>
            <font color="red">申请备件服务（请填入产品编号）：</font>
            <input type="text" id="doubleService"><button onClick="apply()">申请</button>
            <div class="table-responsive">
         <font color="red">您的申请记录如下：</font>   
   <table class="table">
      
      <thead>
         <tr>
            <th>备件服务编号</th>
            <th>产品编号</th>
            <th>是否通过</th>
         </tr>
      </thead>
      <tbody>
      <c:forEach items="${requestScope.doubleServiceRequestList}" var="entry" varStatus="status" >
         <tr class="active">
         
            
              <td>${entry.id}</td>
              <td>${entry.kind}</td>
              <td>${entry.solve}</td>
           
          
         </tr>
      </c:forEach>
      </tbody>
   </table>

</div>  	
<br>
            <hr>
            <h2 id="section-2">提交服务请求</h2>
            
            <font color="red">申请备件服务（请填入产品编号）：</font>
            <input type="text" id="service"><button onClick="applyb()">申请</button>
            <div class="table-responsive">
             <font color="red">您的申请记录如下：</font> 
   <table class="table">
      
      <thead>
         <tr>
            <th>服务编号</th>
            <th>产品编号</th>
            <th>是否通过</th>
         </tr>
      </thead>
      <tbody>
     
        <c:forEach items="${requestScope.serviceRequestList}" var="entry" varStatus="status" >
         <tr class="active">
         
            
              <td>${entry.id}</td>
              <td>${entry.kind}</td>
              <td>${entry.solve}</td>
           
          
         </tr>
      </c:forEach>
      </tbody>
   </table>

</div>  	
            <br/>
            <hr>
           <h2 id="section-3">服务请求查询</h2>
            <div class="table-responsive">

   <table class="table">
      
      <thead>
         <tr>
            <th>文档编号</th>
            <th>文档名称</th>
            <th>下载</th>
         </tr>
      </thead>
      <tbody>
     
         <tr>
         
            
              <td>xx</td>
              <td>xx</td>
              <td>xx</td>
           
          
         </tr>
      
      </tbody>
   </table>

</div>  	
<hr>

<h2 id="section-4">订阅版本发布信息</h2>
            <div class="table-responsive">

   <table class="table">
      
      <thead>
         <tr>
            <th>文档编号</th>
            <th>文档名称</th>
            <th>下载</th>
         </tr>
      </thead>
      <tbody>
     
         <tr>
         
            
              <td>xx</td>
              <td>xx</td>
              <td>xx</td>
           
          
         </tr>
      
      </tbody>
   </table>

</div>  	
         </div>   
    </div>

</div>
</body>
</html>
<jsp:include page="Footer.jsp"/>