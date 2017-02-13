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
public List<Record> AddFire(int pageNumber, int pageSize) {
	List<Record> votes = Db.find("select * from role order by id desc");
System.out.println("---------");
		return  votes;
	
	}
}
