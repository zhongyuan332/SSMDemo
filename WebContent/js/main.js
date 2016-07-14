$(function(){
 
})

	function addperson(){
		
		var flag = $('#main').tabs('exists','个人开户');
		if(flag){
			var tab = $('#main').tabs('select','个人开户');
		}else{
			$('#main').tabs('add',{
				title:'个人开户',
				content:'Tab Body',
				cache:true,
				href:'../pages/personopen.jsp',
				closable:true
			});
		}
	}
	function addcompany(){
		var flag = $('#main').tabs('exists','企业开户');
		if(flag){
			var tab = $('#main').tabs('select','企业开户');
		}else{
			$('#main').tabs('add',{
				title:'企业开户',
				content:'Tab Body',
				cache:true,
				href:'../pages/companyopen.jsp',
				closable:true
			});
		}
	}
	function seeperson(){
		var flag = $('#main').tabs('exists','用户列表');
		if(flag){
			var tab = $('#main').tabs('select','用户列表');
		}else{
			$('#main').tabs('add',{
				title:'用户列表',
				content:'Tab Body',
				cache:true,
				href:'../pages/allperson.jsp',
				closable:true
			});
		}
	}
	function seecompany(){
		var flag = $('#main').tabs('exists','企业列表');
		if(flag){
			var tab = $('#main').tabs('select','企业列表');
		}else{
			$('#main').tabs('add',{
				title:'企业列表',
				//content:'Tab Body',
				cache:true,
				href:'../pages/allcompany.jsp',
				closable:true
			});
		}
		
	}
	