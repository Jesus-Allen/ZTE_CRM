
function func(docId){
      //获取被选中的option标签
     
      var vs = $('#mcc').val();
      
      $.ajax({
   	   url:'admin_doc_change.html',
   	   dataType: "html",
   	   data:{
   		     'vs':vs,
   		     'docId':docId
   	        },
   	 
   	   type:'post',
   	   
   	   success: function(data,textStatus){
   		 
   		  window.location.reload();
   		   }
         
   	   
      });
}
$(function () {  
    $('#uploadify').uploadify({  
    	
        'uploader': 'uploadaction.html',       // 服务器端处理地址  
        'successTimeout':99999,
        'swf': 'swf/uploadify.swf',    // 上传使用的 Flash  
        'width': 100,                          // 按钮的宽度  
        'height': 32,                         // 按钮的高度  
        'buttonText': "上传",                 // 按钮上的文字  
        'buttonCursor': 'hand',                // 按钮的鼠标图标  
        'fileObjName': 'uploadify',         // 上传参数名称 后台action里面的属性uploadify
        // 两个配套使用  
        'fileTypeExts': "*.doc;*.pdf",             // 扩展名  
        'fileTypeDesc': "请选择 doc pdf 文件",     // 文件说明  
        'auto': false,                // 选择之后，自动开始上传  
        'multi': true,               // 是否支持同时上传多个文件  
        'queueSizeLimit': 5  ,       // 允许多文件上传的时候，同时上传文件的个数  
        'fileTypeDesc':'支持的格式：',
        'fileSizeLimit':'100MB',
        'buttonText' : '选择文件',//浏览按钮
        'queueSizeLimit' : 25,
        //选择上传文件后调用
        'onSelect' : function(file) {
        },
        //返回一个错误，选择文件的时候触发
        'onSelectError':function(file, errorCode, errorMsg){
            switch(errorCode) {
                case -100:
                    alert("上传的文件数量已经超出系统限制的"+$('#uploadify').uploadify('settings','queueSizeLimit')+"个文件！");
                    break;
                case -110:
                    alert("文件 ["+file.name+"] 大小超出系统限制的"+$('#uploadify').uploadify('settings','fileSizeLimit')+"大小！");
                    break;
                case -120:
                    alert("文件 ["+file.name+"] 大小异常！");
                    break;
                case -130:
                    alert("文件 ["+file.name+"] 类型不正确！");
                    break;
            }
            alert(errorMsg);
        },
        //检测FLASH失败调用
        'onFallback':function(){
            alert("您未安装FLASH控件，无法上传图片！请安装FLASH控件后再试。");
        },
        //上传到服务器，服务器返回相应信息到data里
        'onUploadSuccess':function(file, data, response){
         $('#result').html(data);
         window.location.reload();
         //$('#uploadify').uploadify('upload');
       // alert(data);
        }
    });  
});  
function deleteDocByDocId(obj){

	var ret = window.confirm("确定删除?");
	//当点击确定时 返回 true 
	if(ret){
	    //do something 点确定
		 $.ajax({
	    	   url:'deleteDocByDocId.html',
	    	   dataType: "html",
	    	   data:{
	    		     'docId':obj,
	    		
	    	        },
	    	 
	    	   type:'post',
	    	   
	    	   success: function(data,textStatus){
	    		  
	    		    if(data=="0"){
	    		    	  window.location.reload();
	    		    }
	    		   },  
	          
	    	   
	       });
	  
	}else{
	    //do otherthing 点取消
	} 

}