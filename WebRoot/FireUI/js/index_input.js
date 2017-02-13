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
console.log("进入")
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
var dwshuxin=document.getElementById("danwei").value
console.log("进入")
console.log(dwshuxin)
	$.ajax({
	     url: "/FireControl/zhaungtai",
	    type: "post",
	    data : {
			"zt" : zt,
		},
	    success: function (data) {
	    	console.log("确定进入此方法-------")
	    	console.log(data)
	    	//$("#danwei_shuxin").empty();
	    	for(var i=0;i<data.length;i++){ 
    		$("#danwei_shuxin").append("<option value="+data[i].id+">"+data[i].dwsxname+"</option>");
    }
	}
	});}

