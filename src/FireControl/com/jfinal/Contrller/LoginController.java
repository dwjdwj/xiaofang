/**
 * Copyright (c) 2011-2014, hubin (243194995@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package FireControl.com.jfinal.Contrller;


import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.slf4j.LoggerFactory;

import com.baomidou.*;
import com.baomidou.kisso.SSOConfig;
import com.baomidou.kisso.SSOHelper;
import com.baomidou.kisso.SSOToken;
import com.baomidou.kisso.Token;
import com.baomidou.kisso.common.IpHelper;
import com.baomidou.kisso.common.util.HttpUtil;
import com.baomidou.kisso.web.waf.request.WafRequestWrapper;
import com.jfinal.aop.Before;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.jfinal.plugin.ehcache.CacheKit;
import com.jfinal.plugin.ehcache.CacheName;
import com.jfinal.template.ext.directive.Str;

import FireControl.com.jfinal.Entity.CaptchaUtil;
import FireControl.com.jfinal.Model.Role;
import FireControl.com.jfinal.Model.UserDao;

import org.slf4j.Logger;
/**
 * 登录
 */
//@CacheName("userList")
//@Before(SSOJfinalInterceptor.class)
public class LoginController extends Controller {
	private static final Logger log = LoggerFactory.getLogger(LoginController.class);
	private static String  verifyCode;
@ActionKey("/login")
	public void index2() {
        boolean a=false;
	
	        Token token = SSOHelper.getToken(getRequest());
	        //判断是否是POST提交
	        if(HttpUtil.isPost(getRequest())){
	            WafRequestWrapper wafRequestWrapper = new WafRequestWrapper(getRequest());
	            String username = wafRequestWrapper.getParameter("username");
	            String password = wafRequestWrapper.getParameter("password");
	            String vcode = wafRequestWrapper.getParameter("vcode");
	          //验证账号密码,此处去数据库校验
	            UserDao addfile = enhance(UserDao.class);  
	            a=addfile.QueryUser(username, password);
	  		  System.out.println(a+"返回值");
	            if(a==true){
	          //验证验证码
	            if ( verifyCode.equalsIgnoreCase(vcode)) {
	               token = new SSOToken();
	               token.setUid(UUID.randomUUID().toString());
	               token.setIp(IpHelper.getIpAddr(getRequest()));
	               token.setId(UUID.randomUUID().toString());
	               token.setApp(username);
	        
	               System.out.println("验证码通过");
	               //保存token立即销毁信任的JSESSIONID
	               SSOHelper.setSSOCookie(getRequest(),getResponse(),token,true);
	               redirect("/index?test="+username+"",true);
	               return;
	               }else{
	            	 	 setAttr("verifyCode","验证码错误");   
	               }
	            }else{
           	 	 setAttr("user_name","用户名或密码错误");   
              }

	        }

            render("login.html");

	    }
//app使用登录界面
@ActionKey("/app")
	public void AppLogin() {
	boolean a=false;
	System.out.println("进入app-------------------------");
    Token token = SSOHelper.getToken(getRequest());
    //判断是否是POST提交
    if(HttpUtil.isPost(getRequest())){
    	System.out.println("进入app------------HttpUtil-------------");
        WafRequestWrapper wafRequestWrapper = new WafRequestWrapper(getRequest());
        String username = wafRequestWrapper.getParameter("username");
        String password = wafRequestWrapper.getParameter("password");
        String vcode = wafRequestWrapper.getParameter("vcode");
      //验证账号密码,此处去数据库校验
        UserDao addfile = enhance(UserDao.class);  
        a=addfile.QueryUser(username, password);
		  System.out.println(a+"返回值");
        if(a==true){
      //验证验证码
        if ( verifyCode.equalsIgnoreCase(vcode)) {
           token = new SSOToken();
           token.setUid(UUID.randomUUID().toString());
           token.setIp(IpHelper.getIpAddr(getRequest()));
           token.setId(UUID.randomUUID().toString());
           token.setApp(username);
           token.setUid("app");
           System.out.println("app验证码通过");
           //保存token立即销毁信任的JSESSIONID
           SSOHelper.setSSOCookie(getRequest(),getResponse(),token,true);
           redirect("/appindex?app="+username+"",true);
           return;
           }else{
        	 	 setAttr("verifyCode","验证码错误");   
           }
        }else{
   	 	 setAttr("user_name","用户名或密码错误");   
      }

    }

    render("login_App.html");

	}		
	
	/**
	 * 验证码
	 */
@ActionKey("/verify")
	public void CaptchaUtil() {
		HttpServletResponse response = getResponse();
		try {
			verifyCode = CaptchaUtil.outputImage(response.getOutputStream());
			System.out.println("验证码:" + verifyCode+response.getOutputStream());
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		renderNull();
	}
	/**
	 * 退出登录
	 */
@ActionKey("/tuichu")
	public void index3() {
		/**
		 * <p>
		 * SSO 退出，清空退出状态即可
		 * </p>
		 * 
		 * <p>
		 * 子系统退出 SSOHelper.logout(request, response); 注意 sso.properties 包含 退出到
		 * SSO 的地址 ， 属性 sso.logout.url 的配置
		 * </p>
		 */
		SSOHelper.clearLogin(getRequest(), getResponse());
		System.out.println("进入退出");
		redirect("/login");
	}
@ActionKey("/test")
public void User() {
	setAttr("w","22");   
	 render("test.html");

			     }
	
}
