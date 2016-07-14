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
	        {field:'unitkind',title:'企业类型',width:100,formatter:function(value,row,index){
	        	if(value==110){
	        		return '国有经济';
	        	}else if(value==120){
	        		return '集体经济';
	        	}else if(value == 130){
	        		return '股份合作企业';
	        	}else if(value == 140){
	        		return '联营企业';
	        	}else if(value == 150){
	        		return '有限责任公司';
	        	}else if(value == 160){
	        		return '股份有限公司';
	        	}else if(value == 170){
	        		return '私营企业';
	        	}else if(value == 190){
	        		return '其他企业';
	        	}else if(value == 200){
	        		return '港澳台商投资企业';
	        	}else if(value == 900){
	        		return '其他';
	        	}else {
	        		return '还有吗？';
	        	}
	        }},   
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
	
	$('#altercompany').dialog({
		title:'修改单位信息',
		closed: true,    
		width:500,
		toolbar:[{
			text:'提交修改',
			iconCls:'icon-edit',
			handler:function(){
				$('#altercompany').submit();
				alert("修改成功");
				$('#altercompany').dialog("close");
			}
		},{
			text:'取消',
			iconCls:'icon-clear',
			handler:function(){
				$('#altercompany').dialog("close");
			}
		}]

	})
	
	
	
})

function reload(){
	$('#allcompany').datagrid('reload');
}

function deletecompany(){
	var select = $('#allcompany').datagrid('getSelected');
	if(confirm('确定要删除当前行？')){
		$.ajax({
			url:'/touch/company/delcompany',
			type:'post',
			dataType:'json',
			data:{
				id:select.id,
			},
			success:function(data){
				//console.log();
				if(data.flag){
					alert("删除成功");
				}
				$('#allcompany').datagrid('reload');
			},
			error:function(XMLHttpRequest, textStatus, errorThrown){
				this;
			}
		})
	}
}

function altercompany(){
	var select = $('#allcompany').datagrid('getSelected');
	$('#altercompany').dialog("open").form('load',{
		id:select.id,
		unitaccname:select.unitaccname,
		unitchar:select.unitchar,
		unitkind:select.unitkind,
		salarydate:select.salarydate,
		unitphone:select.unitphone,
		unitlinkman:select.unitlinkman,
		unitagentpapno:select.unitagentpapno,
		unitprop:select.unitprop,
		perprop:select.perprop,
	})
}










