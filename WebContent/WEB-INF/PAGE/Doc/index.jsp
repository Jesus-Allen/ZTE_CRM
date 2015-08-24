<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/bootstrap-responsive.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admincss/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admincss/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admincss/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/adminjs/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/adminjs/jquery.sorted.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/adminjs/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/adminjs/ckform.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-2.1.3.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.uploadify.min.js"></script>
    <link href="${pageContext.request.contextPath}/css/uploadify.css" rel="stylesheet" />
    <script src="${pageContext.request.contextPath}/admin-js/docIndex.js"></script>

<title>doc</title>

</head> 
<body>
<br/><br/>
<div class="container">
<input type="file" name="uploadify" id="uploadify" multiple="true"/>
    <p>
        <a href="javascript:$('#uploadify').uploadify('upload')">开始上传</a>&nbsp;
        <a href="javascript:$('#uploadify').uploadify('cancel')">取消所有上传</a>
         <div id="result"></div><!--显示结果-->
    </p> 
</div>   
     
     <!-- 表格展示开始 -->
     <div id="neirong">
<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
        <th>文档编号</th>
        <th>文档名称</th>
        <th>文档分类</th>
        <th>操作</th>
        
        
    </tr>
    </thead>
	    
	      <c:forEach items="${requestScope.doc}" var="entry" varStatus="status" >  
					  <tr id="docList">
						 
            <td>${entry.docId}</td>
            <td>${entry.docName}</td>
            <td>
              <c:if test="${entry.docKind==null || empty entry.docKind || entry.docKind=='请分类' }"> 
                <p>  选择分类</p>
                <select onchange="func('${entry.docId}')" id="mcc">
             
                   <option></option>
                   <option value="产品手册">产品手册</option>
                   <option value="维护经验">维护经验</option>
                   <option value="宣传资料">宣传资料</option>
                </select>
              </c:if>
              <c:if test="${entry.docKind=='产品手册' }"> 
                <select onchange="func('${entry.docId}')" id="mcc">
                   <option value="产品手册">产品手册</option>
                   <option value="维护经验">维护经验</option>
                   <option value="宣传资料">宣传资料</option>
                </select>
              </c:if>
              <c:if test="${entry.docKind=='维护经验' }" > 
                <select onchange="func('${entry.docId}')" id="mcc">
                   <option value="维护经验">维护经验</option>
                   <option value="产品手册">产品手册</option>
                   <option value="宣传资料">宣传资料</option>
                </select>
              </c:if>
              <c:if test="${entry.docKind=='宣传资料' }"> 
                <select onchange="func('${entry.docId}')" id="mcc">
                   <option value="宣传资料">宣传资料</option>
                   <option value="维护经验">维护经验</option>
                   <option value="产品手册">产品手册</option>
                </select>
              </c:if>
              
            </td>
            
            <td>
               
                <a href="#" onclick="deleteDocByDocId('${entry.docId}')">删除</a>               
            </td>
				</tr>		
					 
	   </c:forEach>
           
        	
</table>
<center>
  <ul class="pagination">
	<c:forEach items="${requestScope.pageList}" var="pageList">
		 ${pageList}
	</c:forEach>
  </ul>
 </center>
 </div>
</body>
</html>
