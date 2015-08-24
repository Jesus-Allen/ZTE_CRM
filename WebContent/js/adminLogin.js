$(document).ready(function() {



   $("#adminlogin").click(function(){
	  
	   var userName = $("#inputUsernamex").val();
	   var passWord = $("#inputPasswordx").val();
	  
	 
       $.ajax({
    	   url:'adminloginaction.html',
    	   dataType: "html",
    	   data:{
    		     'userName':userName,
    		     'passWord':passWord
    	        },
    	 
    	   type:'post',
    	   
    	   success: function(data,textStatus){
    		 
    		   if(data==0){alert('用户名密码错误，仔细检查')}
    		   if(data==1){
    			   document.location.href="manage.html";
    		   }
    		   },  
          
    	   
       });
   });
});