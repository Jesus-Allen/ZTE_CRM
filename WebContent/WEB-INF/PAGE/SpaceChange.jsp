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
<title>编辑资料</title>
</head>
<body>
<!-- 折叠 -->
<div class="container">
	<div class="row">
    	<div class="col-md-offset-1 col-md-10">
        <div class="row" style="margin-top:50px"></div>
            <div class="panel-group" id="accordion" style="margin-top:10px">
			  
              <div class="panel panel-info">
                <div class="panel-heading">
                  <h4 class="panel-title">
                      <center><b>个人空间</b></center>
                  </h4>
                </div>
                
                  <div class="panel-body">
                    <form class="form-horizontal" role="form" action="updateaction.html" method="post" id="user">
                       <div class="form-group">
                          <label for="userName" class="col-md-2 control-label">
							用户账号
						  </label>
                          <div class="col-md-8">
                             <!-- 取数据 -->
                                 <input type="text" value="${sessionScope.users.userName } "  readonly="true"  class="form-control" name="userName" id="userName">
                          </div>
                       </div>
                       <div class="form-group">
                          <label for="name" class="col-md-2 control-label">
							姓名
						  </label>
                          <div class="col-md-8">
                             <!-- 取数据 -->
                               <input type="text" value="${sessionScope.users.name }"  class="form-control" name="name" id="name">
                          </div>
                       </div>
                       <div class="form-group">
                          <label for="userSex" class="col-md-2 control-label">
							性别
						  </label>
                          <div  class="col-md-3">
                             <!-- 取数据 --> 
                             <c:if test="${sessionScope.users.userSex==null || empty sessionScope.users.userSex}"> 
                                <div  class="col-md-3">
                                   <label class="checkbox-inline">
                                       <input type="radio" name="sex" id="userSex" value="male" checked>&nbsp;&nbsp;男
                                   </label>
                                </div>
                                <div  class="col-md-3">
                                   <label class="checkbox-inline">
                                       <input type="radio" name="sex" id="userSex" value="female">&nbsp;&nbsp;女
                                   </label>
                                </div>
                            </c:if>
                            <c:if test="${sessionScope.users.userSex=='male'}"> 
                               <div  class="col-md-3">
                                   <label class="checkbox-inline">
                                       <input type="radio" name="sex" id="userSex" value="male" checked>&nbsp;&nbsp;男
                                   </label>
                                </div>
                                <div  class="col-md-3">
                                   <label class="checkbox-inline">
                                       <input type="radio" name="sex" id="userSex" value="female">&nbsp;&nbsp;女
                                   </label>
                                </div>
                            </c:if>
                            <c:if test="${sessionScope.users.userSex=='female'}"> 
                            <div  class="col-md-3">
                                   <label class="checkbox-inline">
                                       <input type="radio" name="sex" id="userSex" value="male" >&nbsp;&nbsp;男
                                   </label>
                                </div>
                                <div  class="col-md-3">
                                   <label class="checkbox-inline">
                                       <input type="radio" name="sex" id="userSex" value="female" checked>&nbsp;&nbsp;女
                                   </label>
                                </div>
                            </c:if>
                              
                            
                          </div>
                       </div>
                       <div class="form-group">
                          <label for="userEmail" class="col-md-2 control-label">
							邮箱
						  </label>
                          <div class="col-md-8">
                             <!-- 取数据 -->
                             <input type="text" readonly="true"  value="${sessionScope.users.userEmail }" class="form-control" name="userEmail" id="userEmail">
                          </div>
                       </div>
                       <div class="form-group">
                          <label for="userTel" class="col-md-2 control-label">
							联系电话
						  </label>
                          <div class="col-md-8">
                             <!-- 取数据 -->
                               <input type="text" readonly="true"  value="${sessionScope.users.userTel }" class="form-control" name="userTel" id="userTel">
                          </div>
                       </div>
                       <div class="form-group">
                          <label for="userUnit" class="col-md-2 control-label">
							客户单位
						  </label>
                          <div class="col-md-8">
                             <!-- 取数据 -->
                             <input type="text" value="${sessionScope.users.userUnit }" class="form-control" name="userUnit" id="userUnit">
                          </div>
                       </div>
					   <div class="form-group">
                          <label for="userUrl" class="col-md-2 control-label">公司网址</label>
                          <div class="col-md-8">
                             <!-- 取数据 -->
                             <input type="text" value="${sessionScope.users.userUrl }" class="form-control" name="userUrl" id="userUrl">
                          </div>
                       </div>
					   <div class="form-group">
                          <label for="userCity" class="col-md-2 control-label">
							城市
						  </label>
						  <div class="col-md-8">
							 <!-- 取数据 -->
							 <input type="text" value="${sessionScope.users.userCity }" class="form-control" name="userCity" id="userCity">
						  </div>							
                       </div>
					   <div class="form-group">
                          <label for="userPost" class="col-md-2 control-label">邮编</label>
                          <div class="col-md-8">
                             <!-- 取数据 -->
                             <input type="text" value="${sessionScope.users.userPost}" class="form-control" name="userPost" id="userPost">
                          </div>
                       </div>
					   <div class="form-group">
                          <label for="userAddress" class="col-md-2 control-label">联系地址</label>
                          <div class="col-md-8">
                             <!-- 取数据 -->
                             <input type="text" value="${sessionScope.users.userAddress }" class="form-control" name="userAddress" id="userAddress">
                          </div>
                       </div>
                         <div class="form-group">
                          <label for="head" class="col-md-2 control-label">头像</label>
                          <div class="col-md-8">
                             <!-- 取数据 -->
                             <div  class="col-md-3">
                                   <label class="checkbox-inline">
                                       <input type="radio" name="head" id="head" value="1.gif" checked><img src="${pageContext.request.contextPath}/img/head/1.gif">
                                   </label>
                                </div>
                                <div  class="col-md-3">
                                   <label class="checkbox-inline">
                                       <input type="radio" name="head" id="head" value="2.gif"><img src="${pageContext.request.contextPath}/img/head/2.gif">
                                   </label>
                                </div>
                                 <div  class="col-md-3">
                                   <label class="checkbox-inline">
                                       <input type="radio" name="head" id="head" value="3.gif"><img src="${pageContext.request.contextPath}/img/head/3.gif">
                                   </label>
                                </div>
                              
                          </div>
                       </div>
                         <div class="form-group">
                          <label for="head" class="col-md-2 control-label"></label>
                          <div class="col-md-8">
                             <!-- 取数据 -->
                             <div  class="col-md-3">
                                   <label class="checkbox-inline">
                                       <input type="radio" name="head" id="head" value="4.gif" ><img src="${pageContext.request.contextPath}/img/head/4.gif">
                                   </label>
                                </div>
                                <div  class="col-md-3">
                                   <label class="checkbox-inline">
                                       <input type="radio" name="head" id="head" value="5.gif"><img src="${pageContext.request.contextPath}/img/head/5.gif">
                                   </label>
                                </div>
                                 <div  class="col-md-3">
                                   <label class="checkbox-inline">
                                       <input type="radio" name="head" id="head" value="6.gif"><img src="${pageContext.request.contextPath}/img/head/6.gif">
                                   </label>
                                </div>
                              
                          </div>
                       </div>
                       <div class="form-group">
                          <label for="head" class="col-md-2 control-label"></label>
                          <div class="col-md-8">
                             <!-- 取数据 -->
                             <div  class="col-md-3">
                                   <label class="checkbox-inline">
                                       <input type="radio" name="head" id="head" value="7.gif" ><img src="${pageContext.request.contextPath}/img/head/7.gif">
                                   </label>
                                </div>
                                <div  class="col-md-3">
                                   <label class="checkbox-inline">
                                       <input type="radio" name="head" id="head" value="8.gif"><img src="${pageContext.request.contextPath}/img/head/8.gif">
                                   </label>
                                </div>
                                 <div  class="col-md-3">
                                   <label class="checkbox-inline">
                                       <input type="radio" name="head" id="head" value="9.gif"><img src="${pageContext.request.contextPath}/img/head/9.gif">
                                   </label>
                                </div>
                              
                          </div>
                       </div>
					   <div class="form-group">
                          <div class="col-md-offset-3 col-md-4">
                             <button type="submit" class="btn btn-info">确认修改</button>
                          </div>
                          <div class="col-md-4">
                             <button type="reset" class="btn btn-info">重&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;置</button>
                          </div>
                       </div>
                       
                     
                       
                    </form>
                  </div>
              </div>
			  <!-- 系统设备用户 -->
            </div>
        </div>
	</div>
</div>
<!-- 折叠结束 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/cascade1.js" charset="UTF-8"></script> 
<script src="${pageContext.request.contextPath}/js/bootstrapValidator.js"></script>
<script src="${pageContext.request.contextPath}/js/userinfoupdate.js"></script>
</body>
</html>
<jsp:include page="Footer.jsp"/>