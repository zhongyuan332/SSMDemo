$(function(){
	$('#allcompany').datagrid({    
	    url:'/touch/company/allcompany',    
	    columns:[[    
	        {field:'id',hidden:true},    
	        {field:'unitaccname',title:'单位名称',width:100},    
	        {field:'orgcode',title:'组织机构代码',width:100},   
	        {field:'unitaccnum',title:'单位公积金账号',width:100},   
	        {field:'unitchar',title:'单位类别',width:100,formatter:function(value,row,index){
	        	if(value==1){
	        		return '企业';
	        	}else if(value==2){
	        		return '事业';
	        	}else if(value == 3){
	        		return '机关';
	        	}else if(value == 4){
	        		return '团体';
	        	}else {
	        		return '其他';
	        	}
	        }},   
	        {field:'unitkind',title:'企业类型',width:100},   
	        {field:'salarydate',title:'发薪日期',width:100}, 
	        {field:'unitphone',title:'联系电话',width:100}, 
	        {field:'unitlinkman',title:'单位联系人',width:100}, 
	        {field:'unitagentpapno',title:'经办人身份证号码',width:100}, 
	        {field:'balance',title:'公积金余额',width:100}, 
	        {field:'accstate',title:'账号状态',width:100,formatter:function(value,row,index){
	        	if(value == 0){
	        		return '正常';
	        	}else {
	        		return '销户';
	        	}
	        }}, 
	        {field:'createdate',title:'创建日期',width:100}, 	        
	        {field:'basenumber',title:'缴存基数',width:100},    
	        {field:'unitprop',title:'单位比例',width:100},
	        {field:'perprop',title:'个人比例',width:100},
	        {field:'unitpaysum',title:'单位月应缴额',width:100},
	        {field:'perpaysum',title:'个人月应缴额',width:100},
	        {field:'persnum',title:'单位人数',width:100},
	        {field:'lastpaydate',title:'最后汇缴月',width:100},
	        {field:'instcode',title:'公积金中心机构代码',width:100}
	    ]],
	    rownumbers:true,
	    singleSelect:true,
	    toolbar:'#td'
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
				alert("删除成功");
				$('#allperson').datagrid('reload');
			},
			error:function(XMLHttpRequest, textStatus, errorThrown){
				this;
				
			}
		})
	}
}