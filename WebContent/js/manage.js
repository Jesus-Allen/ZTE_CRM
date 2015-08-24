function deleteUserInfoByUserId(obj){

		var ret = window.confirm("确定删除?");
		//当点击确定时 返回 true 
		if(ret){
		    //do something 点确定
			 $.ajax({
		    	   url:'deleteUserInfoByUserId.html',
		    	   dataType: "html",
		    	   data:{
		    		     'userId':obj,
		    		
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