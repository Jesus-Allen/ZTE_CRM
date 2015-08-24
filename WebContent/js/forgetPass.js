$(document).ready(function() {

	$("#txt_Name").val("");
	$("#txt_chkCode").val("");
	$("#txt_Pass").val("");
});
function send(){
	var userName = $("#txt_Name").val();
    var code = $("#txt_chkCode").val();
	
   if(userName==""){
           alert("请输入用户名！");
          
       }else{
    	   document.getElementById("send").disabled = true;
    	   $.ajax({
          	   url:'sendEmailAction.html',
          	   dataType: "html",
          	   data:{
          		     'userName':userName,
          		    
          	        },
          	 
          	   type:'post',
          	   
          	   success: function(data,textStatus){
          		   
          		  document.getElementById("send").disabled=false;
          		  alert(data)
          		   },  
                
          	   
             });
       }
   
}
function bytelength(szString){
	 return szString.replace(new RegExp("[^\x00-\xff]","g")," ").length;
}
function chk()
{    var userName = $("#txt_Name").val();
     var code = $("#txt_chkCode").val();
     var userPass=$("#txt_Pass").val();
	

    if(code==""){
            alert("请填写校验码！");
           
        }else if(userName==""){
                  alert("请输入用户名！");
                 
          
        }

    else if(userPass==""){
    	alert("修改密码的值不能为空");
    }
    else if( bytelength(userPass)<=5 || bytelength(userPass)>40){
		 alert("密码长度至少为6且不能大于40");
		
	 }
    
    else{
    	 $.ajax({
      	   url:'forgetPassAction.html',
      	   dataType: "html",
      	   data:{
      		     'code':code,
      		     'passWord':userPass,
      		     'userName':userName
      	        },
      	 
      	   type:'post',
      	   
      	   success: function(data,textStatus){
      		    alert(data)
      		   },  
        });
    }
}