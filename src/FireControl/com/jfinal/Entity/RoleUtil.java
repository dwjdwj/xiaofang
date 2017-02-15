/**
 * @author HS
 * 创建时间： 2017年2月15日
 * 创建人    ： Du wei jun
 * 文件名：     RoleUtil.java
 *
 */ 
package FireControl.com.jfinal.Entity;

import com.jfinal.plugin.activerecord.Model;

public class RoleUtil extends Model<RoleUtil> {
	private String id;//id
	private String role_name;//id
	private String gl_role_code;//id
	private String mk_code;//id
	private String su_code;//id
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
	 * @return the role_name
	 */
	public String getRole_name() {
		return role_name;
	}
	/**
	 * @param role_name the role_name to set
	 */
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	/**
	 * @return the gl_role_code
	 */
	public String getGl_role_code() {
		return gl_role_code;
	}
	/**
	 * @param gl_role_code the gl_role_code to set
	 */
	public void setGl_role_code(String gl_role_code) {
		this.gl_role_code = gl_role_code;
	}
	/**
	 * @return the mk_code
	 */
	public String getMk_code() {
		return mk_code;
	}
	/**
	 * @param mk_code the mk_code to set
	 */
	public void setMk_code(String mk_code) {
		this.mk_code = mk_code;
	}
	/**
	 * @return the su_code
	 */
	public String getSu_code() {
		return su_code;
	}
	/**
	 * @param su_code the su_code to set
	 */
	public void setSu_code(String su_code) {
		this.su_code = su_code;
	}

}
 