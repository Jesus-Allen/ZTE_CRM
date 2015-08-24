	$(document).ready(function()
	{
//		$('#menu').menu();
		$('#letter-a a').click(function(event){
			event.preventDefault();
			$('#content').load('a.html');
		});
		$('#letter-f a').click(function(event){
			event.preventDefault();
			$('#content').load('f.html');
		});
		$('#letter-g a').click(function(event){
			event.preventDefault();
			$('#content').load('g.html');
		});
		$('#letter-h a').click(function(event){
			event.preventDefault();
			$('#content').load('h.html');
		});
		$('#letter-i a').click(function(event){
			event.preventDefault();
			$('#content').load('i.html');
		});
		$('#letter-j a').click(function(event){
			event.preventDefault();
			$('#content').load('j.html');
		});
		$('#letter-k a').click(function(event){
			event.preventDefault();
			$('#content').load('k.html');
		});
		$('#letter-l a').click(function(event){
			event.preventDefault();
			$('#content').load('l.html');
		});
		$('#letter-m a').click(function(event){
			event.preventDefault();
			$('#content').load('m.html');
		});
		$('#letter-n a').click(function(event){
			event.preventDefault();
			$('#content').load('n.html');
		});
		$('#letter-o a').click(function(event){
			event.preventDefault();
			$('#content').load('o.html');
		});
		$('#letter-p a').click(function(event){
			event.preventDefault();
			$('#content').load('p.html');
		});
		$('#letter-s a').click(function(event){
			event.preventDefault();
			$('#content').load('s.html');
		});
		$('#letter-t a').click(function(event){
			event.preventDefault();
			$('#content').load('t.html');
		});
		$('#letter-u a').click(function(event){
			event.preventDefault();
			$('#content').load('u.html');
		});
		$('#letter-v a').click(function(event){
			event.preventDefault();
			$('#content').load('v.html');
		});
		$('#letter-w a').click(function(event){
			event.preventDefault();
			$('#content').load('w.html');
		});
	});

$(function(){

	var tabs_i=0
	$('.vtitle').click(function(){
		var _self = $(this);
		var j = $('.vtitle').index(_self);
		if( tabs_i == j ) return false; tabs_i = j;
		$('.vtitle em').each(function(e){
			if(e==tabs_i){
				$('em',_self).removeClass('v01').addClass('v02');
			}else{
				$(this).removeClass('v02').addClass('v01');
			}
		});
		$('.vcon').slideUp().eq(tabs_i).slideDown();
	});
})