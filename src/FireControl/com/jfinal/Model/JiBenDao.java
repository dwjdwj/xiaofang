/**
 * @author HS
 * 创建时间： 2017年2月13日
 * 创建人    ： Du wei jun
 * 文件名：     JiBenDao.java
 *
 */ 
package FireControl.com.jfinal.Model;

import java.util.Date;
import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;
import com.mchange.io.ReaderUtils;

import FireControl.com.jfinal.Entity.Collection;
import FireControl.com.jfinal.Entity.RoleUtil;

public class JiBenDao extends Model<JiBenDao>{
	public  final JiBenDao JiBen_Dao = new JiBenDao();
	public static boolean AddAll(Object cn){
		Date d = new Date();  
        System.out.println(d);

		//boolean pcs = Db.save("jb_info", " INSERT INTO `firecontrol`.`jb_info` (`id`, `fjid`, `fjname`, `pcsid`, `pcsname`, `sqid`, `sqname`, `dwname`, `dwmj`, `dwaddress`, `yyzzid`, `glname`, `iphone`, `code`, `dwsxid`, `dwsx`, `dwxfaqzt`, `mhqstyle`, `mhqnum`, `mhqzl`, `mhqsctime`, `mhqcjname`, `djrname`, `bydjtime`, `byrname`, `byrtime`, `cjszt`, `cjsctime`, `cjyjcztime`, `gxhzt`, `gxsctime`, `gxyjcztime`, `ssname`, `ssbyszt`, `ssgxhzt`, `x`, `y`, `djsx`, `bz`) VALUES (NULL, 'www', 'www', 'eee', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)", null);
	Record user = new Record()
				.set("fjid", ((Collection) cn).getFjid())
				.set("pcsid", ((Collection) cn).getPcsid())
				.set("sqid", ((Collection) cn).getSqid())
				.set("dwname", ((Collection) cn).getDwname())
				.set("yyzzid", ((Collection) cn).getYyzzid())
				.set("glname", ((Collection) cn).getGlname())
				.set("dwaddress", ((Collection) cn).getDwaddress())
				.set("dwmj", ((Collection) cn).getDwmj())
				.set("iphone", ((Collection) cn).getIphone())
				.set("x", ((Collection) cn).getX())
				.set("y", ((Collection) cn).getY())
				.set("dwsxid", ((Collection) cn).getDwsxid())
				.set("dwsx", ((Collection) cn).getDwsx())
				.set("dwxfaqzt", ((Collection) cn).getDwxfaqzt())
				.set("mhqstyle", ((Collection) cn).getMhqstyle())
				.set("mhqzl", ((Collection) cn).getMhqzl())
				.set("mhqnum", ((Collection) cn).getMhqnum())
				.set("mhqpp", ((Collection) cn).getMhqpp())
				.set("mhqcjname", ((Collection) cn).getMhqcjname())
				.set("bydjtime", ((Collection) cn).getBydjtime()==null? ((Collection) cn).getBydjtime():d)
				.set("mhqsctime", ((Collection) cn).getMhqsctime()==null? ((Collection) cn).getMhqsctime():d)
				.set("djrname", ((Collection) cn).getDjrname())
				.set("byrname", ((Collection) cn).getByrname())
				.set("byrtime", ((Collection) cn).getByrtime()==null? ((Collection) cn).getByrtime():d)
				.set("cjszt", ((Collection) cn).getCjszt())
				.set("cjsctime", ((Collection) cn).getCjsctime()==null? ((Collection) cn).getCjsctime():d)
				.set("cjyjcztime", ((Collection) cn).getCjyjcztime()==null? ((Collection) cn).getCjyjcztime():d)
				.set("gxhzt", ((Collection) cn).getGxhzt())
				.set("gxsctime", ((Collection) cn).getGxsctime()==null? ((Collection) cn).getGxsctime():d)
				.set("gxyjcztime", ((Collection) cn).getGxyjcztime()==null? ((Collection) cn).getGxyjcztime():d)
				.set("ssname", ((Collection) cn).getSsname())
				.set("ssbyszt", ((Collection) cn).getSsbyszt())
				.set("ssgxhzt", ((Collection) cn).getSsgxhzt())
				.set("djsx", ((Collection) cn).getDjsx());
		boolean pc=Db.save("jb_info", user);
		
		System.out.println(pc+":getDwaddress执行完成");
		return pc;
		
	}
	public static boolean AddRe(Object re){
		Date d = new Date();  
        System.out.println(d);

		//boolean pcs = Db.save("jb_info", " INSERT INTO `firecontrol`.`jb_info` (`id`, `fjid`, `fjname`, `pcsid`, `pcsname`, `sqid`, `sqname`, `dwname`, `dwmj`, `dwaddress`, `yyzzid`, `glname`, `iphone`, `code`, `dwsxid`, `dwsx`, `dwxfaqzt`, `mhqstyle`, `mhqnum`, `mhqzl`, `mhqsctime`, `mhqcjname`, `djrname`, `bydjtime`, `byrname`, `byrtime`, `cjszt`, `cjsctime`, `cjyjcztime`, `gxhzt`, `gxsctime`, `gxyjcztime`, `ssname`, `ssbyszt`, `ssgxhzt`, `x`, `y`, `djsx`, `bz`) VALUES (NULL, 'www', 'www', 'eee', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)", null);
	Record user = new Record()
				.set("fjid", ((RoleUtil) re).getId())
				.set("pcsid", ((RoleUtil) re).getMk_code())
				.set("sqid", ((RoleUtil) re).getSu_code());
		boolean pc=Db.save("user_role", user);
		
		System.out.println(pc+":getDwaddress执行完成");
		return pc;
		
	}
}
 