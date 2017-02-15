/**
 * @author HS
 * 创建时间： 2017年2月8日
 * 创建人    ： Du wei jun
 * 文件名：     Role.java
 *
 */
package FireControl.com.jfinal.Model;


import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;

public class Role extends Model<Role> {

private static final long serialVersionUID = 1L;
public static final Role dao = new Role();
public static List<Record> AddFire() {

		List<Record> returnuser = Db.find("select * from role ");

		return returnuser;	
	}
//查询功能
public static List<Record> Fun() {

	List<Record> gongneng = Db.find("select  distinct t1.* ,t2.fun_ction as sup from fun_ctions t1 "
			+ "left join  fun_ctions t2 on t1.sup_mk= t2.fun_code");

	return gongneng;	
}
//查询子模块
public static List<Record> Zimok(String mokname) {
System.out.println(mokname+"mokname");
	List<Record> quanxian = Db.find("select  * from fun_ctions WHERE fun_ctions.sup_mk='"+mokname+"'");

	return quanxian;
	}
//登录时查询权限
public static List<Record> QuanXian(String username) {

	List<Record> quanxian = Db.find("select  distinct t1.* ,t2.fun_ction as sup from function t1 "
			+ "left join  function t2 on t1.sup_mk= t2.fun_code");

	return quanxian;	
}
}
