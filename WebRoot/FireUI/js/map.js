	$(function(){// 百度地图API功能
	var map = new BMap.Map("loginmap");    // 创建Map实例
	map.centerAndZoom(("兰州"), 15);  // 初始化地图,设置中心点坐标和地图级别
	map.addControl(new BMap.MapTypeControl());   //添加地图类型控件
	map.setCurrentCity("兰州");          // 设置地图显示的城市 此项是必须设置的
	map.enableScrollWheelZoom(false);     //开启鼠标滚轮缩放
	map.disableDragging(); //禁止拖拽
	var geolocation = new BMap.Geolocation();
	geolocation.getCurrentPosition(function(r){
		if(this.getStatus() == BMAP_STATUS_SUCCESS){
			var mk = new BMap.Marker(r.point);
			map.addOverlay(mk);
			map.panTo(r.point);
			//alert('您的位置：'+r.point.lng+','+r.point.lat);
		}
		else {
			alert('failed'+this.getStatus());
		}        
	},{enableHighAccuracy: true})
	map.sent
	});
function login_click(){
	
	var name=document.getElementById("tv_username").value;
	var pwd=document.getElementById("tv_pwd").value;
	if(name=="Username"||name==""){
		alert("没输入名字");
		return;
		}
    if(pwd=="Password"||pwd==""){
		alert("没输入密码");
		return;
		}
	alert("chengong");		
	}
