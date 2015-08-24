<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title></title>
 
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/css/bootstrap-responsive.css" rel="stylesheet">

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
<br/>
<br/>
 <form class="form-horizontal" role="form" action="admin_user_add_action.html" method="post" id="user3">
                      <div class="form-group">
                          <label for="id" class="col-md-2 control-label"><font color="red">*</font>权限</label>
                           <div class="col-md-8">
								 <select id="id" class="form-control" name="id" >
									 <option>1</option>
									 <option>2</option>
									 <option>3</option>
									 <option>4</option>
									 <option>5</option>
									 <option>8</option>
									
								 </select>
							  </div>
                          
                       </div>
                       <div class="form-group">
                          <label for="userName" class="col-md-2 control-label"><font color="red">*</font>用户账号</label>
                          <div class="col-md-8">
                             <input type="text" class="form-control" name="userName" placeholder="用户帐号由3-20位的英文字母、数字或下划线组成，必须以字母开头">
                          </div>
                       </div>
                       <div class="form-group">
                          <label for="userSex" class="col-md-2 control-label">
							<font color="red">*</font>性别
						  </label>
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
                       </div>
                       <div class="form-group">
                          <label for="userPwd" class="col-md-2 control-label"><font color="red">*</font>密码</label>
                          <div class="col-md-8">
                             <input type="password" class="form-control" name="userPwd" placeholder="密码请保持在6-40位字符长度 ">
                          </div>
                       </div>
                       <div class="form-group">
                          <label for="affirmPwd" class="col-md-2 control-label"><font color="red">*</font>重复密码</label>
                          <div class="col-md-8">
                             <input type="password" class="form-control" name="affirmPwd" placeholder="再次输入你的密码，两次密码需一致">
                          </div>
                       </div>
					   <div class="form-group">
                          <label for="userProvince" class="col-md-2 control-label"><font color="red">*</font>您所在的省份</label>
							  <div class="col-md-8">
								 <select id="userProvince" class="form-control" name="userProvince" required>
									 <option>请选择</option>
									 <option>北京市</option>
									 <option>上海市</option>
									 <option>天津市</option>
									 <option>重庆市</option>
									 <option>内蒙古自治区</option>
									 <option>维吾尔自治区</option>
									 <option>西藏自治区</option>
									 <option>宁夏回族自治区</option>
									 <option>广西壮族自治区</option>
									 <option>香港特别行政区</option>
									 <option>澳门特别行政区</option>
									 <option>黑龙江省</option>
									 <option>吉林省</option>
									 <option>辽宁省</option>
									 <option>河北省</option>
									 <option>山西省</option>
									 <option>青海省</option>
									 <option>山东省</option>
									 <option>河南省</option>
									 <option>江苏省</option>
									 <option>安徽省</option>
									 <option>浙江省</option>
									 <option>福建省</option>
									 <option>江西省</option>
									 <option>湖南省</option>
									 <option>湖北省</option>
									 <option>广东省</option>
									 <option>台湾省</option>
									 <option>海南省</option>
									 <option>甘肃省</option>
									 <option>陕西省</option>
									 <option>四川省</option>
									 <option>贵州省</option>
									 <option>云南省</option>
								 </select>
							  </div>
                       </div>
                       <div class="form-group">
                          <label for="name" class="col-md-2 control-label"><font color="red">*</font>姓名</label>
                          <div class="col-md-8">
                             <input type="text" class="form-control" name="name" placeholder="完善您个人基本信息有助于提高我们的服务质量">
                          </div>
                       </div>
                       <div class="form-group">
                          <label for="userEmail" class="col-md-2 control-label"><font color="red">*</font>邮箱</label>
                          <div class="col-md-8">
                             <input type="email" class="form-control" name="userEmail">
                          </div>
                       </div>
                       <div class="form-group">
                          <label for="userTel" class="col-md-2 control-label"><font color="red">*</font>联系电话</label>
                          <div class="col-md-8">
                             <input type="tel" class="form-control" name="userTel">
                          </div>
                       </div>
                       <div class="form-group">
                          <label for="userUnit" class="col-md-2 control-label"><font color="red">*</font>客户单位</label>
                          <div class="col-md-8">
                             <input type="text" class="form-control" name="userUnit" placeholder="请填写单位全称">
                          </div>
                       </div>
					   <div class="form-group">
                          <label for="userUrl" class="col-md-2 control-label">公司网址</label>
                          <div class="col-md-8">
                             <input type="url" class="form-control" name="userUrl" placeholder="http://">
                          </div>
                       </div>
                       <div class="form-group">
                          
                          <div class="form-group">
                          <label for="state" class="col-md-2 control-label">
							<font color="red">*</font>是否启用
						  </label>
                          <div  class="col-md-3">
                             <label class="checkbox-inline">
                                <input type="radio" name="state" id="state" value="yes" checked>&nbsp;&nbsp;启用                             </label>
                          </div>
                          <div  class="col-md-3">
                             <label class="checkbox-inline">
                                <input type="radio" name="state" id="state" value="no">&nbsp;&nbsp;禁用
                             </label>
                          </div>
                       </div>
                       </div>
					
					   <div class="col-md-10" style="height:10px"></div>
                       <div class="form-group">
                          <div class="col-md-offset-3 col-md-4">
                             <button type="submit" class="btn btn-info">添加</button>
                          </div>
                          <div class="col-md-4">
                             <button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
                          </div>
                       </div>
                    </form>
<script src="${pageContext.request.contextPath}/js/bootstrapValidator.js"></script>
 <script src="${pageContext.request.contextPath}/admin-js/userInfoAdd.js"></script>

</body>
</html>
<script>
    $(function () {       
		$('#backid').click(function(){
				window.location.href="admin_user_index.html";
		 });

    });
</script>