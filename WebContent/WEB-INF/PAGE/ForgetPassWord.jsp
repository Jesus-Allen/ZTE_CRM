<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>忘记密码</title>
    
<script src="${pageContext.request.contextPath}/js/jquery-2.1.3.js"></script>
<script src="${pageContext.request.contextPath}/js/forgetPass.js"></script>
<link href="${pageContext.request.contextPath}/css/main.css" type="text/css" rel="stylesheet">
 <style type="text/css">
.tb_input{
background-color:#c6d5f5;
border:0;
width:100%;
margin-bottom:5px;
}
.tb_input td {
padding:2px 0 2px 4px;
background-color:#fff;
height:20px;
line-height:20px;
vertical-align:middle;
}

.tb_input .tips {
border-left:0;
}

.tb_input .td_title {
background-color:#eaf0fb;
border-top:1px solid #fff;
border-left:1px solid #fff;
}

.tb_input .note{
background:#fff url(../images/icons/note.gif) 3px 3px no-repeat;
padding-left:20px;
padding-top:3px;
}

input.button {
font-family: "Lucida Grande", Verdana, Lucida, Arial, Helvetica, "宋体",sans-serif;
font-size:12px;
border-top:#c4cccc 1px solid;
border-right:#acb5b5 1px solid; 
border-bottom:#6f7777 1px solid; 
border-left:#acb5b5 1px solid;  
background: url(../images/icons/button_bg.gif) #fefefe repeat-x; 
cursor:pointer; 
color:#222; 
height: 20px;
line-height:15px;
padding: 0 3px 1px 5px;
*padding-top:2px; 
margin-left: 4px;
}
</style>





</head>
<body>
关闭浏览器和超过30分钟校验码都会失效，您可以重新发送 <button id="send"  onclick="send()"  >发送校验码到邮箱</button>
 <div id="content">
        <form name="form1" method="post" action="ForgetPassWord.aspx" id="form1">


<div>


</div>
            <table class="tb_input" cellpadding="0" cellspacing="1">
                <tbody><tr>
                    <td class="td_title">
                        用户名：
                    </td>
                    <td>
                        <input name="txt_Name" id="txt_Name" style="width:200px;" type="text">
                        
                    </td>
                </tr>
                <tr>
                    <td class="td_title" width="343">
                        校验码：
                    </td>
                    <td width="638">
                        <input name="txt_chkCode" id="txt_chkCode" style="width:200px;" type="text">
                     </td>
                </tr>
                 <td class="td_title" width="343">
                         修改的密码值：
                    </td>
                    <td width="638">
                        <input name="txt_Pass" id="txt_Pass" style="width:200px;" type="text">
                     </td>
                </tr>
            </tbody></table>
            <div class="tab_operate" style="text-align: right;">
                <label>
                </label>
                
                <input type="button" id="intbt" value="修改" onclick="chk()"  >
               
                
            </div>
        </form>
    </div>
</body>
</html>