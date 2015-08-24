<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="NaveBar.jsp"/>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>ZTE Corporation</title>

<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/bootstrap-responsive.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/elements.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>
</head>
<body>

	

<!-- 轮播 -->
<div id="carousel1" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
         <li data-target="#carousel1" data-slide-to="0" class="active"></li>
         <li data-target="#carousel1" data-slide-to="1"></li>
        </ol>
        <div class="carousel-inner">
            <div class="item active">
                <img src="${pageContext.request.contextPath}/images/banner01.jpg" alt="" id="pic1">
                <div class="carousel-caption">
                    
                </div>
            </div>
            <div class="item">
                <img src="${pageContext.request.contextPath}/images/banner02.jpg" alt="" id="pic2">

            </div>
        </div>
        <a href="#carousel1" data-slide="prev" class="left carousel-control">
            <span class="glyphicon glyphicon-chevron-left"></span>
        </a>
        <a href="#carousel1" data-slide="next" class="right carousel-control">
            <span class="glyphicon glyphicon-chevron-right"></span>
        </a>   
</div>
    <script>
     $(function(){
     $('.carousel').carousel();
     });
    </script>
<!--  轮播结束 -->
   <div class="container">
         <!--     公告区     -->   
        <div class="row" style="height:30px"></div> 
        <div class="row">
            <div class="col-md-4" style="height:340px">
				<div class="css-a">
					<div class="ldown"> 
					<div style="height:50px"></div>
						<table>
							<tr height="10px"></tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-a1.html">&nbsp;&nbsp;【重要】中兴通讯系统维护通知…</a></td>
								<td class="col-md-1">[2015-04-08]</td>
							</tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-a2.html">&nbsp;&nbsp;【重要】中兴通讯系统维护通知… </a></td>
								<td class="col-md-1">[2014-10-07]</td>
							</tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-a3.html">&nbsp;&nbsp;【重要】中兴通讯系统维护通知 …  </a></td>
								<td class="col-md-1">[2013-05-06]</td>
							</tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-a4.html">&nbsp;&nbsp;重要通知：中兴通讯系统维护通知… </a></td>
								<td class="col-md-1">[2013-01-16]</td>
							</tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-a5.html">&nbsp;&nbsp;关于中兴通讯终端服务热线 服务… </a></td>
								<td class="col-md-1">[2012-12-31]</td>
							</tr>
						</table>
					</div>   
					<div class="lup1a">  
						<img src="${pageContext.request.contextPath}/images/service-a.png">
					</div>
					<div class="lup2a">  
						<a href="todo.html"><img src="${pageContext.request.contextPath}/images/service-b.png"></a>
					</div>
				</div>
			</div>
			<div class="col-md-4" style="height:340px">
				<div class="css-b">
					<div class="ldown"> 
					<div style="height:50px"></div>
						<table>
							<tr height="10px"></tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-b1.html">&nbsp;&nbsp;发布信：中兴通讯ZXV10 H201L… </a></td>
								<td class="col-md-1">[2015-05-12]</td>
							</tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-b2.html">&nbsp;&nbsp;发布信：中兴通讯ZXHN H168NW… </a></td>
								<td class="col-md-1">[2015-04-20]</td>
							</tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-b3.html">&nbsp;&nbsp;发布信：中兴通讯E5532停止销售… </a></td>
								<td class="col-md-1">[2015-04-16]</td>
							</tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-b4.html">&nbsp;&nbsp;发布信：中兴通讯H560L停止销售… </a></td>
								<td class="col-md-1">[2015-04-16]</td>
							</tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-b5.html">&nbsp;&nbsp;发布信：中兴通讯H513B停止销… </a></td>
								<td class="col-md-1">[2015-04-16]</td>
							</tr>
						</table>
					</div>  
					<div class="lup1b">  
						<img src="${pageContext.request.contextPath}/images/product-a.png">
					</div>
					<div class="lup2b">  
						<a href="todo.html"><img src="${pageContext.request.contextPath}/images/product-b.png"></a>
					</div>
				</div>
			</div><div class="col-md-4" style="height:340px">
				<div class="css-c">
					<div class="ldown"> 
					<div style="height:50px"></div>
						<table>
							<tr height="10px"></tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-c1.html">&nbsp;&nbsp;ZXCLOUD E9000 刀片服务器 硬… </a></td>
								<td class="col-md-1">[2015-05-12]</td>
							</tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-c2.html">&nbsp;&nbsp;ZXCLOUD R8500 G3 机架服务器… </a></td>
								<td class="col-md-1">[2015-04-20]</td>
							</tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-c3.html">&nbsp;&nbsp;ZXCLOUD E9000 刀片服务器 快… </a></td>
								<td class="col-md-1">[2015-04-16]</td>
							</tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-c4.html">&nbsp;&nbsp;ZXCLOUD iRAI 云桌面 例行维护 </a></td>
								<td class="col-md-1">[2015-04-16]</td>
							</tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-c5.html">&nbsp;&nbsp;ZXCLOUD iROS 虚拟化调度故障</a></td>
								<td class="col-md-1">[2015-04-16]</td>
							</tr>
						</table>
					</div>  
					<div class="lup1c">  
						<img src="${pageContext.request.contextPath}/images/data-a.png">
					</div>
					<div class="lup2c">  
						<a href="todo.html"><img src="${pageContext.request.contextPath}/images/data-b.png"></a>
					</div>
				</div>
			</div>
			<div class="col-md-4" style="height:340px">
				<div class="css-d">
					<div class="ldown"> 
					<div style="height:50px"></div>
						<table>
							<tr height="10px"></tr>
							<tr>
								<td class="col-md-3"><span class="glyphicon glyphicon-send"></span><a href="index-d1.html">&nbsp;&nbsp;ZXCLOUD E9000 刀片服务器 硬件 </a></td>
								<td class="col-md-1">[2015-05-13]</td>
							</tr>
						</table>
					</div>  
					<div class="lup1d">  
						<img src="${pageContext.request.contextPath}/images/net-a.png">
					</div>
					<div class="lup2d">  
						<a href="todo.html"><img src="${pageContext.request.contextPath}/images/net-b.png"></a>
					</div>
				</div>
			</div>
			<div class="col-md-4" style="height:340px">
				<div class="css-e">
					<div class="ldown"> 
					<div style="height:50px"></div>
						<table>
							<tr height="10px"></tr>
							<tr></tr>
						</table>
					</div>  
					<div class="lup1e">  
						<img src="${pageContext.request.contextPath}/images/tech-a.png">
					</div>
					<div class="lup2e">  
						<a href="todo.html"><img src="${pageContext.request.contextPath}/images/tech-b.png"></a>
					</div>
				</div>
			</div>
			<div class="col-md-4" style="height:340px">
				<div class="css-f">
					<div class="ldown"> 
					<div style="height:50px"></div>
						<table>
							<tr height="10px"></tr>
							<tr></tr>
						</table>
					</div>  
					<div class="lup1f">  
						<img src="${pageContext.request.contextPath}/images/kown-a.png">
					</div>
					<div class="lup2f">  
						<a href="todo.html"><img src="${pageContext.request.contextPath}/images/kown-b.png"></a>
					</div>
				</div>
			</div>
			<div class="col-md-4" style="height:340px">
				<div class="css-g">
					<div class="ldown"> 
					<div style="height:50px"></div>
						<table>
							<tr>
								<td class="col-md-4"><span class="glyphicon glyphicon-send"></span>&nbsp;&nbsp;中兴e读&nbsp;软件<a href=""><font color="blue">&nbsp;&nbsp;&nbsp;&nbsp;下载</font></a></td>
							</tr>
							<tr>
								<td class="col-md-4"><p>中兴e读是中兴电子文档浏览器，主要用于浏览、搜索、升级和<br>管理中兴ZED文档包。ZED文档包是后缀名为 ".zed" 的文件，可<br>集成HTML、PDF、Flash、Excel等多种类型文档，文档形式更<br>丰富、内容更充实。 </p></td>
							</tr>
							<tr>
								<td class="col-md-4"><a href="help.html"><font color="blue">如何找到ZED文档包？</font></a></td>
							</tr>
						</table>
					</div>  
					<div class="lup1g">  
						<img src="${pageContext.request.contextPath}/images/e-a.png">
					</div>
					<div class="lup2g">  
						<a href="todo.html"><img src="${pageContext.request.contextPath}/images/e-b.png"></a>
					</div>
				</div>
			</div>
			<div class="col-md-4" style="height:340px">
				<div class="css-h">
					<div class="ldown"> 
					<div style="height:50px"></div>
						<table>
							<tr height="10px"></tr>
							<tr></tr>
						</table>
					</div>  
					<div class="lup1h">  
						<img src="${pageContext.request.contextPath}/images/version-a.png">
					</div>
					<div class="lup2h">  
						<a href="todo.html"><img src="${pageContext.request.contextPath}/images/version-b.png"></a>
					</div>
				</div>
			</div>
			<div class="col-md-4" style="margin-left:-10px">
				<div class="col-md-6" style="margin-bottom:19px"><button type="button" class="btn btn-success btn-lg btn-block">无线</button></div>
				<div class="col-md-6" style="margin-bottom:19px"><button type="button" class="btn btn-info btn-lg btn-block">核心网</button></div>	
				<div class="col-md-6" style="margin-bottom:19px"><button type="button" class="btn btn-danger btn-lg btn-block">承载网</button></div>
				<div class="col-md-6" style="margin-bottom:19px"><button type="button" class="btn btn-warning btn-lg btn-block">数据通信</button></div>
				<div class="col-md-6" style="margin-bottom:19px"><button type="button" class="btn btn-default btn-lg btn-block">接入网</button></div>
				<div class="col-md-6" style="margin-bottom:19px"><button type="button" class="btn btn-success btn-lg btn-block">云计算及IT</button></div>
				<div class="col-md-6" style="margin-bottom:19px"><button type="button" class="btn btn-warning btn-lg btn-block">多媒体</button></div>
				<div class="col-md-6" style="margin-bottom:19px"><button type="button" class="btn btn-info btn-lg btn-block">统一网管</button></div>
				<div class="col-md-6" style="margin-bottom:19px"><button type="button" class="btn btn-primary btn-lg btn-block">电源</button></div>
				<div class="col-md-6" style="margin-bottom:19px"><button type="button" class="btn btn-danger btn-lg btn-block">其他</button></div>
			</div>
		</div>
        <!-- 公告区结束 -->

</div>

</body>
</html>
<jsp:include page="Footer.jsp"/>