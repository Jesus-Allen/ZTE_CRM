 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>即将跳转</title>
<script language=javascript>
function out(obj){
var i = obj ;
if(i==0)
document.location.href="space.html";
document.body.innerHTML = "修改成功，即将自动跳转至个人空间......"+i;
i--;
setTimeout("out("+i+")",1000);
}
</script>
</head>
<body onload="out(3)">


</body>
</html>