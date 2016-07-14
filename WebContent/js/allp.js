$(function(){
	$('#allperson').datagrid({    
	    url:'/touch/person/allperson',    
	    columns:[[    
	        {field:'id',hidden:true},    
	        {field:'pname',title:'姓名',width:100},    
	        {field:'idtype',title:'证件类型',width:100,formatter:function(value,row,index){
	        	if(row.idtype==1){
	        		return '身份证';
	        	}else if(row.idtype==2){
	        		return '军官证';
	        	}else if(row.idtype==3){
	        		return '护照';
	        	}else {
	        		return '其他';
	        	}
	        }},   
	        {field:'peraccstate',title:'账户状态',width:100,formatter:function(value,row,index){
	        	if(row.idtype==0){
	        		return '正常';
	        	}else if(row.idtype==9){
	        		return '销户';
	        	}else {
	        		return '其他';
	        	}
	        }}, 
	        {field:'idnum',title:'证件号码',width:100},
	        {field:'accnum',title:'个人公积金账号',width:100},
	        {field:'unitaccnum',title:'单位公积金账号',width:100},   
	        {field:'opendate',title:'开户日期',width:100},   
	        {field:'balance',title:'公积金余额',width:100},   
	        {field:'basenumber',title:'缴存基数',width:100},    
	        {field:'unitprop',title:'单位比例',width:100},
	        {field:'indiprop',title:'个人比例',width:100},
	        {field:'lastpaydate',title:'最后汇缴月',width:100},
	        {field:'unitmonpaysum',title:'单位月应缴额',width:100},
	        {field:'permonpaysum',title:'个人月应缴额',width:100},
	        {field:'ypayamt',title:'本年汇补缴额',width:100},
	        {field:'ydrawamt',title:'本年度提取额',width:100},
	        {field:'yinterestbal',title:'年度结息',width:100},
	        {field:'remark',title:'备注',width:100}
	    ]],
	    rownumbers:true,
	    singleSelect:true,
	    toolbar:'#tb'
	});  
	
})

function reload(){
	$('#allperson').datagrid('reload');
}

function deleteperson(){
	var select = $('#allperson').datagrid('getSelected');
	if(confirm('确定要删除当前行？')){
		$.ajax({
			url:'/touch/person/delperson',
			type:'post',
			dataType:'json',
			data:{
				id:select.id,
			},
			success:function(data){
				//console.log(data);
				if(data.flag){
					alert("删除成功");
				}
				$('#allperson').datagrid('reload');
			},
			error:function(XMLHttpRequest, textStatus, errorThrown){
				this;
				
			}
		})
	}
}

function alterperson(){
	var select = $('#allperson').datagrid('getSelected');
	
}
