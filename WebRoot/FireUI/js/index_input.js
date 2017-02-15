
//<!--功能管理编辑弹窗-->
	function bt_gngl_tan(){
		document.getElementById("tan_gngl").style.display="block";
		}

//<!--角色管理编辑弹窗-->
	function bt_jsgl_tan(){
		document.getElementById("tan_jsgl").style.display="block";
		}
//<!--用户管理编辑弹窗-->
	function bt_yhgl_tan(){
		document.getElementById("tan_yhgl").style.display="block";
		}
	//关闭功能管理编辑弹窗
	function close_gngl_tan(){
		document.getElementById("tan_gngl").style.display="none";
	}
	function close_jsgl_tan(){
		document.getElementById("tan_jsgl").style.display="none";
	}
	function close_yhgl_tan(){
		document.getElementById("tan_yhgl").style.display="none";
	}
//关闭管理界面
	function close_manager(){
		document.getElementById("dv_manage").style.display="none";
		}
//打开我来管理
	function show_manage(){
		document.getElementById("dv_manage").style.display="block";
		document.getElementById("goManager").style.display="block";
		document.getElementById("bt_close_manager").style.display="block";
		}

//查询分局
function fenju_id(){
$.ajax({
     url: "/FireControl/chaxunfenju",
    type: "post",
    success: function (data) {
    	$("#fjname").empty();
    	for(var i=0;i<data.length;i++){ 
 
    		console.log(i)
    		$("#fjname").append("<option value="+data[i].id+">"+data[i].fjname+"</option>")
    }}
});}
//根据分局查询派出所
function pcs(){
var fenjuid=document.getElementById("fjname").value
console.log(fenjuid)
	$.ajax({
	     url: "/FireControl/pcs",
	    type: "post",
	    data : {
			"fenjuid" : fenjuid,
		},
	    success: function (data) {
	    	

	    	$("#pcsname").empty();
	    
	    	for(var i=0;i<data.length;i++){ 
    		console.log(data[i])	
    		$("#pcsname").append("<option value="+data[i].id+">"+data[i].pcsname+"</option>");
    }
	    }
	});}

//根据派出所查询社区
function sq(){
var pcsid=document.getElementById("pcsname").value
console.log("0000000")
console.log(pcsid)
	$.ajax({
	     url: "/FireControl/sq",
	    type: "post",
	    data : {
			"pcsid" : pcsid,
		},
	    success: function (data) {
	    	$("#sqname").empty();
	    	for(var i=0;i<data.length;i++){ 
    		console.log(data[i])
    		$("#sqname").append("<option value="+data[i].id+">"+data[i].sqname+"</option>");
    	 
    }
	}
	});}
//查询单位
function danwei(){

	$.ajax({
	     url: "/FireControl/danwei",
	    type: "post",
	    success: function (data) {
	    
	    	$("#danwei").empty();
	    	for(var i=0;i<data.length;i++){ 
	 
	    		$("#danwei").append("<option value="+data[i].dwid+">"+data[i].dwlxname+"</option>")
	    }}
	});}
//根据单位查询单位属性
function danweishuxin(){
var dwshuxin=document.getElementById("danwei").value

console.log(dwshuxin)
	$.ajax({
	     url: "/FireControl/danweishuxin",
	    type: "post",
	    data : {
			"dwshuxin" : dwshuxin,
		},
	    success: function (data) {
	    	console.log("确定进入此方法-------")
	    	console.log(data)
	    	$("#danwei_shuxin").empty();
	    	for(var i=0;i<data.length;i++){ 
    		$("#danwei_shuxin").append("<option value="+data[i].id+">"+data[i].dwsxname+"</option>");
    	 
    }
	}
	});}
//根据单位查询单位属性
function zhuangtai(){
var zt=document.getElementById("danwei").value
console.log("进入")
console.log(zt)
	$.ajax({
	     url: "/FireControl/zhaungtai",
	    type: "post",
	    data : {
			"zt" : zt,
		},
	    success: function (data) {
	    	console.log("确定进入此方法-------")
	    	console.log(data)
	    	$("#danwei_zhuangtai").empty();
	    	for(var i=0;i<data.length;i++){ 
    		$("#danwei_zhuangtai").append("<option value="+data[i].id+">"+data[i].sxztjcname+"</option>");
    }
	}
	});}
//查询器材类型
function qicaitype(){

		$.ajax({
		     url: "/FireControl/qicaitype",
		    type: "post",
		    data : {
				
			},
		    success: function (data) {
		    	console.log("确定进入此方法-------")
		    	console.log(data)
		    	$("#mhqstyle").empty();
		    	for(var i=0;i<data.length;i++){ 
	    		$("#mhqstyle").append("<option value="+data[i].id+">"+data[i].mhqname+"</option>");
	    }
		}
		});}

//根据单位查询出重量
function QCDanWei(){
var QCDanWei=document.getElementById("mhqstyle").value
console.log("进入")
console.log(QCDanWei)
	$.ajax({
	     url: "/FireControl/QCDanWei",
	    type: "post",
	    data : {
			"QCDanWei" : QCDanWei,
		},
	    success: function (data) {
	    	console.log("确定进入此方法-------")
	    	console.log(data)
	    	$("#mhqstyle_zl").empty();
	    	for(var i=0;i<data.length;i++){ 
    		$("#mhqstyle_zl").append("<option value="+data[i].id+">"+data[i].mhqzl+"</option>");
    }
	}
	});}

//打开用户管理界面-->
function open_yh_manage(){
	console.log("进入")
	console.log(QCDanWei)
		$.ajax({
		     url: "/FireControl/chaxunyonghu",
		    type: "post",
		    success: function (data) {
		    	console.log("确定进入此方法-------")
		    	console.log(data)
		  	$("#user_yonghu").empty();
		    	$("#user_yonghu").append( " <tr><th>用户编号</th><th>用户名称</th><th>备注</th></tr>" );	
		    	for(var i=0;i<data.length;i++){ 
		       	 $("#user_yonghu").append( "<tr>" );	
		    	 $("#user_yonghu").append( "<th>"+data[i].user_code+"</th>" );	
		        $("#user_yonghu").append( " <th>"+data[i].user_name+"</th>" );
		        $("#user_yonghu").append( "<th>"+data[i].user_remarks+"</th>" );	
		        $("#user_yonghu").append( "</tr>" );	
	    }	    	
		}
		});
	    document.getElementById("quanxian_yh_manager").style.display="block";
		document.getElementById("quanxian_gn_manager").style.display="none";
		document.getElementById("quanxian_js_manager").style.display="none";
	}
//<!--打开角色管理界面-->
function open_js_manage(){

		$.ajax({
		     url: "/FireControl/chaxunjs",
		    type: "post",
		    success: function (data) {
		    	console.log("确定进入此方法-------")
		    	console.log(data)
		  	$("#role_").empty();
		    	$("#role_").append( " <tr><th>角色编号</th><th>角色名称</th></tr>" );	
		    	for(var i=0;i<data.length;i++){ 
		       	 $("#role_").append( "<tr>" );	
		    	 $("#role_").append( "<th>"+data[i].role_code+"</th>" );	
		        $("#role_").append( " <th>"+data[i].role_name+"</th>" );
		        $("#role_").append( "</tr>" );	
	    }	    	
		}
		});
	    document.getElementById("quanxian_js_manager").style.display="block";
		document.getElementById("quanxian_gn_manager").style.display="none";
		document.getElementById("quanxian_yh_manager").style.display="none";
	}
//<!--打开功能管理界面-->
function open_gn_manage(){
	$.ajax({
	     url: "/FireControl/chaxungl",
	    type: "post",
	    success: function (data) {
	    	console.log("确定进入此方法-------")
	    	console.log(data)
	  	$("#fun_gongneng").empty();
	    	$("#fun_gongneng").append( " <tr><th>模块名称</th><th>子模块名称</th><th>所属上级模块</th></tr>" );	
	    	for(var i=0;i<data.length;i++){ 
	       	 $("#fun_gongneng").append( "<tr>" );	
	    	 $("#fun_gongneng").append( "<th>"+data[i].fun_ction+"</th>" );	
	        $("#fun_gongneng").append( " <th>"+data[i].fun_zmk+"</th>" );
	        $("#fun_gongneng").append( " <th>"+data[i].sup+"</th>" );
	        $("#fun_gongneng").append( "</tr>" );	
   }	    	
	}
	});
	    document.getElementById("quanxian_gn_manager").style.display="block";
		document.getElementById("quanxian_js_manager").style.display="none";
		document.getElementById("quanxian_yh_manager").style.display="none";
	}
//当页面加载时自动查询角色模块权限
function shouquan(){
	console.log("-0-0ojinbh ghfyt890po;jbhvgu")
	$.ajax({
   url: "/FireControl/chaxunshouquan",
	    type: "post",
	    data : {

		},
	    success: function (data) {
	
	}
	});
	   
	}
