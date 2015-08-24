<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="NaveBar.jsp"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据通信</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/application.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.raty.min.js"></script>
<style>
body{background-color:white;}
.tdstyle{background-color:skyblue;text-align:right};
.table .table-bordered .tdstylea{background-color:skyblue;text-align:center};
</style>
</head>
<body>
<div class="col-md-12" style="height:70px"></div>
<div class="col-md-12">
	<table class="table table-bordered">
	      <tr>
	         <td class="tdstyle">标题</td>
	         <td>ZXSDR BS8912（HV2.0）TDD LTE一体化微基站 成套用户手册  </td>
	         <td class="tdstyle">产品</td>
	         <td>TDD(TDD)/TD-LTE无线子系统/TD-LTE无线基站（eNodeB）/ZXSDR BS8912 T2600TDD(TDD)/TD-LTE无线子系统/TD-LTE无线基站（eNodeB）/ZXSDR BS8912 T2300</td>
	      </tr>
	      <tr>
	         <td class="tdstyle">资料编号</td>
	         <td>SJ-20150506173153 </td>
	         <td class="tdstyle">阅读次数</td>
	         <td>133</td>
	      </tr>
	      <tr>
	         <td class="tdstyle">资料类型</td>
	         <td>随机资料</td>
	         <td class="tdstyle">文件大小</td>
	         <td>-</td>
	      </tr>
	      <tr>
	         <td class="tdstyle">更新日期</td>
	         <td>2015-5-15 17:24:16</td>
	         <td class="tdstyle">关键字</td>
	         <td>ZXSDR BS8912（HV2.0）TDD LTE </td>
	      </tr>
	</table>
	<table class="table table-bordered">
	      <tr>
	         <td style="background-color:skyblue;text-align:center">序号</td>
	         <td style="background-color:skyblue;text-align:center">标题</td>
	         <td style="background-color:skyblue;text-align:center">操作</td>
	      </tr>
	      <tr>
	         <td>1</td>
	         <td>  SJ-20150506173153-015-ZXR10 5950-H系列（V3.00.11）全千兆智能路由交换机 告警处理.pdf  </td>
	         <td><a href="#">下载</a></td>
	      </tr>
	      <tr>
	         <td>2</td>
	         <td> SJ-20150506173153-014-ZXR10 5950-H系列（V3.00.11）全千兆智能路由交换机 例行维护.pdf  </td>
	         <td><a href="#">下载</a></td>
	      </tr>
	      <tr>
	         <td>3</td>
	         <td> SJ-20150506173153-013-ZXR10 5950-H系列（V3.00.11）全千兆智能路由交换机 故障处理.pdf  </td>
	         <td><a href="#">下载</a></td>
	      </tr>
	</table>
</div>
<div class="col-md-12">
<div class="panel panel-info">
   <div class="panel-heading">
      <h3 class="panel-title">感谢您对我们的资料提出宝贵意见 </h3>
   </div>
   <div class="panel-body">
   <div class="col-md-2">请您为该文档评分</div>
   <div class="col-md-10">
     <div class="demo">
	    <div id="function-demo1" class="target-demo"></div>
	    <div id="function-hint1" class="hint"></div>
	  </div>
     <script type="text/javascript">
     $('#function-demo1').raty({
 	  	number: 5,//多少个星星设置
 		score: 3,//初始值是设置
 		targetType: 'number',//类型选择，number是数字值，hint，是设置的数组值
         path      : '${pageContext.request.contextPath}/img',
         cancelOff : 'cancel-off-big.png',
         cancelOn  : 'cancel-on-big.png',
         size      : 24,
         starHalf  : 'star-half-big.png',
         starOff   : 'star-off-big.png',
         starOn    : 'star-on-big.png',
         target    : '#function-hint1',
         cancel    : false,
         targetKeep: true,
         precision : false,//是否包含小数
       }); 
     </script>
     </div>
   </div>
   <table class="table">
      <tr><td class="col-md-2" style="text-align:center"><font color="red">*</font>意见</td>
      <td class="col-md-10">
		<div class="input-group col-md-12">
		  <input type="text" class="form-control" aria-describedby="basic-addon1"  style="height:100px">
		</div>
	  </td>
	  </tr>
      <tr><td colspan="3"><button type="button" class="btn btn-primary">提&nbsp;&nbsp;&nbsp;&nbsp;交</button></td></tr>
   </table>
</div>
</div>
</body>
</html>