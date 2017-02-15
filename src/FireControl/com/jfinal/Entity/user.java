/**
 * @author HS
 * 创建时间： 2017年2月15日
 * 创建人    ： Du wei jun
 * 文件名：     user.java
 *
 */ 
package FireControl.com.jfinal.Entity;

import com.jfinal.plugin.activerecord.Model;

public class user extends Model<user> {
	private String id;//id
	private String user_name;//用户名
	private String user_password;//密码
	private String user_remarks;//备注
	private String rel_code;//角色code
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * @return the user_password
	 */
	public String getUser_password() {
		return user_password;
	}
	/**
	 * @param user_password the user_password to set
	 */
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	/**
	 * @return the user_remarks
	 */
	public String getUser_remarks() {
		return user_remarks;
	}
	/**
	 * @param user_remarks the user_remarks to set
	 */
	public void setUser_remarks(String user_remarks) {
		this.user_remarks = user_remarks;
	}
	/**
	 * @return the rel_code
	 */
	public String getRel_code() {
		return rel_code;
	}
	/**
	 * @param rel_code the rel_code to set
	 */
	public void setRel_code(String rel_code) {
		this.rel_code = rel_code;
	}

}
 