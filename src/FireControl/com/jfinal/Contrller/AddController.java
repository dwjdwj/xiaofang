/**
 * @author HS
 * 创建时间： 2017年2月15日
 * 创建人    ： Du wei jun
 * 文件名：     AddController.java
 *
 */ 
package FireControl.com.jfinal.Contrller;
import com.baomidou.kisso.SSOHelper;
import com.baomidou.kisso.Token;
import com.jfinal.aop.Before;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

import FireControl.com.jfinal.Entity.Collection;
import FireControl.com.jfinal.Entity.UserUtil;
import FireControl.com.jfinal.Model.Role;
@Before(SSOJfinalInterceptor.class)
public class AddController extends Controller{
//添加用户使用方法
@ActionKey("/adduser")
		public void ChaXsq() {
	UserUtil cn= new UserUtil();
cn.setRel_code(getPara());
cn.setUser_name(getPara());
cn.setUser_password(getPara());
cn._setAttrs(cn);
renderJson(Role.Adduser(cn));
					     }	
}
