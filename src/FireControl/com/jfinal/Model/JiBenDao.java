/**
 * @author HS
 * 创建时间： 2017年2月13日
 * 创建人    ： Du wei jun
 * 文件名：     JiBenDao.java
 *
 */ 
package FireControl.com.jfinal.Model;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;

public class JiBenDao extends Model<JiBenDao>{
	public  final JiBenDao JiBen_Dao = new JiBenDao();
	public static String AddAll(String a){
	
		
		
		
		//boolean pcs = Db.save("jb_info", " INSERT INTO `firecontrol`.`jb_info` (`id`, `fjid`, `fjname`, `pcsid`, `pcsname`, `sqid`, `sqname`, `dwname`, `dwmj`, `dwaddress`, `yyzzid`, `glname`, `iphone`, `code`, `dwsxid`, `dwsx`, `dwxfaqzt`, `mhqstyle`, `mhqnum`, `mhqzl`, `mhqsctime`, `mhqcjname`, `djrname`, `bydjtime`, `byrname`, `byrtime`, `cjszt`, `cjsctime`, `cjyjcztime`, `gxhzt`, `gxsctime`, `gxyjcztime`, `ssname`, `ssbyszt`, `ssgxhzt`, `x`, `y`, `djsx`, `bz`) VALUES (NULL, 'www', 'www', 'eee', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)", null);
	/*	Record user = new Record()
				.set("fjid", "Jame333s").set("", value)
				.set(column, value).set(column, value)
				.set(column, value).set(column, value)
				.set(column, value).set(column, value)
				.set(column, value).set(column, value)
				.set(column, value).set(column, value)
		boolean pc=Db.save("jb_info", user);*/
		
		
		System.out.println(a+"执行完成");
		return null;
		
	}
}
 