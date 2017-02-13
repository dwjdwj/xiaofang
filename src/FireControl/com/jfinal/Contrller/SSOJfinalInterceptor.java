
package FireControl.com.jfinal.Contrller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;

import com.baomidou.kisso.SSOConfig;
import com.baomidou.kisso.SSOHelper;
import com.baomidou.kisso.Token;
import com.baomidou.kisso.web.interceptor.KissoAbstractInterceptor;
import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * 登录权限验证
 * <p>
 * kisso jfinal 拦截器，Controller 方法调用前处理。
 * </p>
 * 
 * jfinal 拦截器不够灵活，因此写在 demo 中，方便您自己修改。
 */
public class SSOJfinalInterceptor extends KissoAbstractInterceptor implements Interceptor {

/*	private static final Logger log  = Logger.getLogger("SSOJfinalInterceptor");


	public void intercept( Invocation inv ) {
		*//**
		 * 正常执行
		 *//*
		log.info("开始拦截!验证登陆.");
		HttpServletRequest request = inv.getController().getRequest();
		HttpServletResponse response = inv.getController().getResponse();
		Token token = SSOHelper.getToken(request);
		
		if ( token == null ) {
			if ( "XMLHttpRequest".equals(request.getHeader("X-Requested-With")) ) {
				
				 * Handler 处理 AJAX 请求
				 
				getHandlerInterceptor().preTokenIsNullAjax(request, response);
				  log.info("拦截ajax请求.处理中.....");
			} else if ( "APP".equals(request.getHeader("PLATFORM")) ) {
				
				 * Handler 处理 APP接口调用 请求
				 * 没有修改kisso核心代码，直接使用Ajax的认证判断方式，如果未认证，返回401状态码
				 
				getHandlerInterceptor().preTokenIsNullAjax(request, response);
				   log.info("处理APP请求!");
			} else {
				try {
					
					 log.info("拒绝请求:"+request.getRequestURI());
				
					SSOHelper.clearRedirectLogin(request, response);
				} catch ( IOException e ) {
					e.printStackTrace();
				}
			}
		} else {
			
			 * 正常请求，request 设置 token 减少二次解密
			 
			request.setAttribute(SSOConfig.SSO_TOKEN_ATTR, token);
			inv.invoke();
		}
	}

}*/
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(SSOJfinalInterceptor.class);

@Override
public void intercept(Invocation invocation) {
    log.info("开始拦截!验证登陆.");
    HttpServletRequest request = invocation.getController().getRequest();
    HttpServletResponse response = invocation.getController().getResponse();
    Token token = SSOHelper.getToken(request);

    if(token == null){
        if("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))){
            //处理ajax请求
            //如果未认证返回401
            getHandlerInterceptor().preTokenIsNullAjax(request,response);
            log.info("拦截ajax请求.处理中.....");
        }else if("APP".equals(request.getHeader("PLATFORM"))){
            //采用ajax处理方式
            getHandlerInterceptor().preTokenIsNullAjax(request,response);
            log.info("处理APP请求!");
        }else{
            //普通请求
            try {
                log.info("拒绝请求:"+request.getRequestURI());
                SSOHelper.clearRedirectLogin(request,response);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }else{
        /*
         * 正常请求，request 设置 token 减少二次解密
         */
        request.setAttribute(SSOConfig.SSO_TOKEN_ATTR,token);
        invocation.invoke();
    }
}


}
