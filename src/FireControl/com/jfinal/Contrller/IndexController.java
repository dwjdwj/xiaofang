package FireControl.com.jfinal.Contrller;


import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.ehcache.CacheName;
import com.jfinal.plugin.ehcache.RenderInfo;
import com.jfinal.template.ext.directive.Str;

import FireControl.com.jfinal.Model.FenJuDao;
import FireControl.com.jfinal.Model.JiBenDao;
import FireControl.com.jfinal.Model.Role;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baomidou.kisso.SSOHelper;
import com.baomidou.kisso.Token;
import com.jfinal.aop.Before;
import com.jfinal.core.ActionKey;
/**
 * 
 * IndexController
 */
@Before(SSOJfinalInterceptor.class)
//@CacheName("userList")
public class IndexController extends Controller {
	private static final Logger log = LoggerFactory.getLogger(IndexController.class);
	private List<Record> list;
	@ActionKey("/index")
	public void index() {
		 Token token = SSOHelper.attrToken(getRequest());
		 System.out.println(token+":tokenzhi");
	        if(!token.equals("null")){
	        	System.out.println("进入首页");
	  
	       	 setAttr("login_username",token.getApp());
				
				System.out.println(getPara("test")+"mtttttttttt");
				
	    // setAttr("blogPage",Role.dao.AddFire(0, 0));
	            render("index.html");
	            System.out.println("登陆令牌IP地址"+token.getApp());
	            return;
	        } 
	      render("login.html");
    // renderFreeMarker("index.html");
	}
//查询分局
	@ActionKey("/chaxunfenju")
	 public void FenJun() {	
		System.out.println("-------------------");
	renderJson(FenJuDao.QueryFenju());
       }
//查询派出所
	@ActionKey("/pcs")
	 public void pcs() {
		String fenjuid=getPara("fenjuid");
		System.out.println(fenjuid+":000");
	renderJson(FenJuDao.Querypcs(fenjuid));
      }
//查询社区
	@ActionKey("/sq")
	 public void Sq() {
		String pcsid=getPara("pcsid");
		System.out.println(pcsid+":000");
	renderJson(FenJuDao.Querysq(pcsid));
     }
//查询单位
	@ActionKey("/danwei")
	 public void DanWei() {
		String pcsid=getPara("pcsid");
		System.out.println(pcsid+":000");
	renderJson(FenJuDao.DanWei());
     }
//根据单位查询单位属性he单位状态
		@ActionKey("/danweishuxin")
		 public void DanWeiShuXin() {
			String dwshuxin=getPara("dwshuxin");

		renderJson(FenJuDao.DanWeiShuXin(dwshuxin));
	     }
		
//根据单位查询单位属性he单位状态
				@ActionKey("/zhuangtai")
				 public void DanWeizt() {
					String zt=getPara("zt");

				renderJson(FenJuDao.DanWeiZt(zt));
			     }
//添加数据到数据库
	@ActionKey("/add")
	 public void addUser() {
    //从页面获取属性
		
	/*	
		JiBenDao JiBen_Dao = getModel(JiBenDao.class);
System.out.println(JiBen_Dao+":ooo");*/
		
		System.out.println(getPara("")+":ll");
/*JiBenDao.AddAll(getParaValues());*/

    }

	}



