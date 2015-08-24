<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.Locale,java.util.ResourceBundle,com.opensymphony.xwork2.ActionContext;" %> 
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎访问ZTE技术支持</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/bootstrap-responsive.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/elements.css" rel="stylesheet">
  

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
 
    <!-- 导航 -->            
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">

      <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar">
              <span class="sr-only">切换导航</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
          </button>
         <a class="navbar-brand" href="index.html"><img src="${pageContext.request.contextPath}/image/zte.png" width="100px"></a>
      </div>
      <div class="collapse navbar-collapse" id="navbar">
        <ul class="nav navbar-nav">
            <li class="active"><a href="index.html"><s:text name="text.home"></s:text></a></li>
            <li><a href="space.html"><s:text name="text.myspace"></s:text></a></li>
            <li><a href="service.html"><s:text name="text.service"></s:text></a></li>
            <li><a href="knowledge.html"><s:text name="text.case"></s:text></a></li>
            <li><a href="doc.html"><s:text name="text.doc"></s:text></a></li>
            <li><a href="luntanindex.html"><s:text name="text.form"></s:text></a></li>
            <li><a href="notice.html"><s:text name="text.bulletion"></s:text></a></li>
        </ul>

        <ul class="nav navbar-nav navbar-right">
            <li>
        		<div class="dropdown" style="margin-top:8px">
				   <button type="button" class="btn dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown" style="background-color:captiontext">
				     	<font color="grey"><s:text name="text.language"></s:text><span class="caret"></span></font>
				   </button>
				   <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
				      <li role="presentation">
				         <a role="menuitem" tabindex="-1" href="lan.html?request_locale=zh_CN">中文</a>
				      </li>
				      <li role="presentation">
				         <a role="menuitem" tabindex="-1" href="lan.html?request_locale=en_US">English</a>
				      </li>
				   </ul>
				</div>
        	</li>

            <li>
               <c:if test="${users.userName==null || empty users.userName}">  
                  <a href="#login" data-toggle="modal"><s:text name="text.login"></s:text></a>
               </c:if>
               <c:if test="${not empty users.userName}">  
                  <a href="space.html">${users.userName} </a>
               </c:if>
             </li>

            <li>
               <c:if test="${users.userName==null || empty users.userName}">  
                  <a href="regist.html"><s:text name="text.regist"></s:text></a>
               </c:if>
               <c:if test="${not empty users.userName}">  
                  <a href="loginoutaction.html"><s:text name="text.exit"></s:text></a>
               </c:if>
            </li>

            <li><a href="help.html"><s:text name="text.helper"></s:text></a></li>
             <li><a href="#">&nbsp;&nbsp;&nbsp;&nbsp;</a></li>
        </ul>
      </div>

</nav>
<!-- 导航结束 -->

<!-- 弹窗开始 -->
  <form action="loginaction.html" name="loginForm" id="loginForm" class="form-signin" >
    <div class="modal fade" id="login">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">

        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title"><s:text name="text.login"></s:text></h4>
      </div>
      <div class="modal-body">
       
      <div id="show" class="alert alert-warning" style="display:none;"></div>
      <div id="loading" class="alert alert-success" style="display:none;"> </div>
      <label for="inputUsername"><s:text name="text.login.userName"></s:text></label>
      <input type="text" name="userInfo.userName" id="inputUsername" class="form-control" placeholder="Username" required autofocus>
      <label for="inputPassword" ><s:text name="text.login.pwd"></s:text></label>
      <input type="password" name="userInfo.userPwd" id="inputPassword" class="form-control" placeholder="Password" required>
     
      
    
      </div>
      <div class="modal-footer">
        
         <div class="col-sm-3">
              <div class="checkbox">
                  <label>   
                  <input type="checkbox" value="remember-me" name="re" id="re">
                 <s:text name="text.login.rememberPass"></s:text></label>
              </div>
         </div>
         <div class="col-sm-3">
            
         </div>
         
         <div class="col-sm-4 col-md-offset-2">
             <button class="btn  btn-primary " id="loginBtn" type="button"><s:text name="text.login.login"></s:text></button>
              <a href="forgetPass.html" target="_blank"><s:text name="text.login.forgetPass"></s:text>？</a>
         </div>
      
      
      </div>
    </div>
  </div>
</div>
     </form>
    
<script src="${pageContext.request.contextPath}/js/jquery-2.1.3.js"></script>
<script src="${pageContext.request.contextPath}/js/login.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrapValidator.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.cookie.js">
<script>$('.collapse').collapse("toggle")</script>

</body>
</html>