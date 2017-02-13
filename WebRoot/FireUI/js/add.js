function myRegister(){
	alert();
console.log("-----------------------")
console.log(jarname)
$.ajax({
     url: "/FireControl/add",
    type: "post",
    data : {
		"filename" : filename,
		"jarname" :jarname
	},
    success: function (data) {
    	var re=data.result;
    	console.log(re)
    	if(re==true){
    		alert("打包成功")
    		location.reload();
    	}
    	else
    	alert("打包成功")	
    	 parent.location.reload();
    }
});}