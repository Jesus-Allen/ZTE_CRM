$(document).ready(function() {
	$("#doubleService").val("")
	$("#service").val("")
});
function apply(){
	if($("#doubleService").val()==null || $("#doubleService").val()==""){
		alert('请输入您购买的产品编号')
	}
	else{
		 $.ajax({ url: "service-apply.html", 
		      data:{
		    	  'kind':$("#doubleService").val()
		      }, 
		      dataType: "html",
		      timeout: 10000, 
		      success: function(data,textStatus){
		    	  if(data=="1"){
		    		  alert('申请成功，请等待回复')
		    		  window.location.reload();
		  			
		  		}else{
		  			alert('申请失败')
		  		}
		      }
		      });   
	}
}
function applyb(){
	if($("#service").val()==null || $("#service").val()==""){
		alert('请输入您购买的产品编号')
	}
	else{
		 $.ajax({ url: "service-applyb.html", 
		      data:{
		    	  'kindb':$("#service").val()
		      }, 
		      dataType: "html",
		      timeout: 10000, 
		      success: function(data,textStatus){
		    	  if(data=="1"){
		    		  alert('申请成功，请等待回复')
		    		  window.location.reload();
		  			
		  		}else{
		  			alert('申请失败')
		  		}
		      }
		      });   
	}
}
		 
 
