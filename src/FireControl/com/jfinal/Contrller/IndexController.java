package FireControl.com.jfinal.Contrller;


import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.ehcache.CacheName;
import com.jfinal.plugin.ehcache.RenderInfo;
import com.jfinal.template.ext.directive.Str;

import FireControl.com.jfinal.Entity.Collection;
import FireControl.com.jfinal.Model.FenJuDao;
import FireControl.com.jfinal.Model.JiBenDao;
import FireControl.com.jfinal.Model.Role;
import FireControl.com.jfinal.Model.UserDao;

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
		 setAttr("login_username",token.getApp());
	        if(!token.equals("null")){
	        	System.out.println("进入首页");
	           
	  if(token.getUid().equals("app")){
			System.out.println(token.getUid()+"进入app首页");
		  render("index_App.html");
		     return;
 
	  }else{
	  render("index.html");
	     return;
      }
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
@ActionKey("/zhaungtai")
public void DanWeizt() {
String zt=getPara("zt");
renderJson(FenJuDao.DanWeiZt(zt));
			     }

//前端触发事件，自动查询器材类型
@ActionKey("/qicaitype")
public void QCType() {

renderJson(FenJuDao.Qicaitype());
			     }
//根据器材类型查询出单位
@ActionKey("/QCDanWei")
public void QCDanWei() {
	String QCDanWei=getPara("QCDanWei");
renderJson(FenJuDao.QCDanWei(QCDanWei));
			     }

//为要采集
	@ActionKey("/add")
	 public void AddCollection() {
    //从页面获取属性
		Collection cn= new Collection();
		cn.setFjid(getPara("jb.fjid"));
		cn.setPcsid(getPara("jb.pcsid"));
		cn.setSqid(getPara("jb.sqid"));
		cn.setDwname(getPara("jb.dwname"));
		cn.setYyzzid(getPara("jb.yyzzid"));
		cn.setGlname(getPara("jb.glname"));
		cn.setDwaddress(getPara("jb.dwaddress"));
		cn.setDwmj(getPara("jb.dwmj"));
		cn.setIphone(getPara("jb.iphone"));
		cn.setX(getPara("jb.x"));
		cn.setY(getPara("jb.y"));
		cn.setDwsxid(getPara("jb.dwsxid"));
		cn.setDwsx(getPara("jb.dwsx"));
		cn.setDwxfaqzt(getPara("jb.dwxfaqzt"));
		cn.setMhqstyle(getPara("jb.mhqstyle"));
		cn.setMhqzl(getPara("jb.mhqzl"));
		cn.setMhqnum(getPara("jb.mhqnum"));
		cn.setMhqpp(getPara("jb.mhqpp"));
		cn.setMhqcjname(getPara("jb.mhqcjname"));
		cn.setMhqsctime(getPara("jb.mhqsctime"));
		cn.setDjrname(getPara("jb.djrname"));
		cn.setByrname(getPara("jb.byrname"));
		cn.setByrtime(getPara("jb.byrtime"));
		cn.setCjszt(getPara("jb.setcjsctime"));
		cn.setCjsctime(getPara("jb.cjsctime"));
		cn.setCjyjcztime(getPara("jb.cjyjcztime"));
		cn.setGxhzt(getPara("jb.gxhzt"));
		cn.setGxsctime(getPara("jb.gxsctime"));
		cn.setGxyjcztime(getPara("jb.gxyjcztime"));
		cn.setBydjtime(getPara("jb.bydjtime"));
		cn.setSsname(getPara("jb.ssname"));
		cn.setSsbyszt(getPara("jb.ssbyszt"));
		cn.setSsgxhzt(getPara("jb.ssgxhzt"));
		cn.setDjsx(getPara("jb.djsx"));
		cn._setAttrs(cn);
		boolean add = JiBenDao.AddAll(cn);

redirect("/index?返回值：="+add+"",true);
    }
//查询用户
	@ActionKey("/chaxunyonghu")
	public void User() {

		renderJson(UserDao.User());
				     }
//查询角色
	@ActionKey("/chaxunjs")
	public void Role() {

		renderJson(Role.AddFire());
				     }
	
//查询功能
@ActionKey("/chaxungl")
	public void Fun() {

		renderJson(Role.Fun());
		}
//查询模块授权
@ActionKey("/chaxunshouquan")
	public void ChaXsq() {
	Token token = SSOHelper.attrToken(getRequest());
	
	System.out.println(token.getApp()+":token.getApp()");
		renderJson(Role.QuanXian(token.getApp()));
				     }	
	
	
	}





