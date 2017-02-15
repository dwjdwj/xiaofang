/**
 * @author HS
 * 创建时间： 2017年2月15日
 * 创建人    ： Du wei jun
 * 文件名：     AppControl.java
 *
 */ 
package FireControl.com.jfinal.Contrller; 

import com.baomidou.kisso.SSOHelper;
import com.baomidou.kisso.Token;
import com.jfinal.core.Controller;

public class AppControl extends Controller{
	public void index() {
		Token token = SSOHelper.attrToken(getRequest());

	        if(!token.equals("null")){
	        	System.out.println("进入app首页");

		  render("index_App.html");

      System.out.println("登陆令牌IP地址"+token.getApp());
	            return;
	        } 
    renderFreeMarker("login_App.html");
	}
}
 