/**
 * @author HS
 * 创建时间： 2017年2月10日
 * 创建人    ： Du wei jun
 * 文件名：     UserDao.java
 *
 */ 
package FireControl.com.jfinal.Model;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.template.ext.directive.Str;

public class UserDao extends Model<UserDao>{
	private static final long serialVersionUID = 1L;
	public static final UserDao userdao = new UserDao();
	public boolean QueryUser(String username, String password) {
		boolean reuser=false;
	List<Record> returnuser = Db.find("select * from user WHERE user.user_name ='"+username+"' && user.user_password='"+password+"'");
	if(returnuser.size()!=0){
			System.out.println(returnuser+"-----用户存在---");
				reuser=true;
				}
		System.out.println(reuser+"-----返回false为用户不存在---");
			return  reuser;
		
		}
//查询用户	
public static List<Record> User() {

List<Record> returnuser = Db.find("select * from user ");

return returnuser;	
}
}