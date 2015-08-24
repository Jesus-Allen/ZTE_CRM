<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="NaveBar.jsp"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人空间</title>
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
                      <center><b>我的空间</b></center>
                  </h4>
                </div>
                  <div class="panel-body">
                    <form class="form-horizontal" action="#" method="post">
                       <div class="form-group">
						  <label for="userName" class="col-md-2 control-label">
							<img src="${pageContext.request.contextPath}/img/head/${sessionScope.users.head }" height="100px" width="100px">
						  </label>
						  <div class="col-md-7 col-md-offset-1">
							  <div class="row">
								<div class="col-md-4" style="padding-top:8px;padding-bottom:8px">
									用户名：${sessionScope.users.userName }
								</div>
								<div class="col-md-4" style="padding-top:8px;padding-bottom:8px">
									姓名：${sessionScope.users.name}
								</div>
								<div class="col-md-4" style="padding-top:8px;padding-bottom:8px">
									性别：${sessionScope.users.userSex}
								</div>
							  </div>
							  <div class="row">
								<div class="col-md-4" style="padding-top:8px;padding-bottom:8px">
									邮箱：${sessionScope.users.userEmail}
								</div>
								<div class="col-md-4" style="padding-top:8px;padding-bottom:8px">
									号码：${sessionScope.users.userTel}
								</div>
								<div class="col-md-4" style="padding-top:8px;padding-bottom:8px">
									地区：${sessionScope.users.userProvince}
								</div>
							  </div>
							  <div class="row">
								<div class="col-md-8" style="padding-top:8px;padding-bottom:8px">
									公司：${sessionScope.users.userUnit}
								</div>
								<div class="col-md-4">
									<a href="spacechange.html"><button type="button" class="btn btn-warning">编辑资料</button></a>
								</div>
							  </div>
                          </div>
                       </div>
						
						<div class="panel panel-danger">
						   <div class="panel-heading">我的帖子</div>
						   <table class="table table-hover">
							  <th>发布内容</th><th>发布时间</th>
							  <tr><td class="col-md-10"><a href="todo.html">免费域名注册</a></td><td class="col-md-2">15-01-04</td></tr>
							  <tr><td class="col-md-10"><a href="todo.html">免费 Window 空间托管</a></td><td class="col-md-2">15-03-01</td></tr>
							  <tr><td class="col-md-10"><a href="todo.html">图像的数量</a></td><td class="col-md-2">15-03-01</td></tr>
							  <tr><td class="col-md-10"><a href="todo.html">24*7 支持</a></td><td class="col-md-2">15-03-01</td></tr>
							  <tr><td class="col-md-10"><a href="todo.html">每年更新成本</a></td><td class="col-md-2">15-03-01</td></tr>
						   </table>
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
 

</body>
</html>
<jsp:include page="Footer.jsp"/>