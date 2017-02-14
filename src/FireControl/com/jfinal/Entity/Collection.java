/**
 * @author HS
 * 创建时间： 2017年2月14日
 * 创建人    ： Du wei jun
 * 文件名：     Collection.java
 *
 */ 
package FireControl.com.jfinal.Entity;

import com.jfinal.plugin.activerecord.Model;

public class Collection extends Model<Collection> {
/**
	 * 
	 */
	public static final Collection jb_info = new Collection();
	private static final long serialVersionUID = 1L;
private String fjid;//所属分局id
private String pcsid;//派出所id
private String sqid;//社区id
private String dwname;//单位名称
/**
 * @return the yyzzid
 */
public String getYyzzid() {
	return yyzzid;
}
/**
 * @param yyzzid the yyzzid to set
 */
public void setYyzzid(String yyzzid) {
	this.yyzzid = yyzzid;
}
private String yyzzid;// 营业执照号：
private String glname;//所属负责人：
private String dwaddress;//地址
private String dwmj;//面积
private String iphone;//电话
private String x;//经度

private String y;//纬度
private String dwsxid;//单位id
private String dwsx;//单位属性
private String bydjtime;//单位属性
private String dwxfaqzt;//单位状态
private String mhqstyle;//器材类型
private String mhqzl;//  重量
/**
 * @return the bydjtime
 */
public String getBydjtime() {
	return bydjtime;
}
/**
 * @param bydjtime the bydjtime to set
 */
public void setBydjtime(String bydjtime) {
	this.bydjtime = bydjtime;
}
private String mhqnum;//数量
private String mhqpp;// 品牌
private String mhqcjname;//厂家


private String mhqsctime;// 生产时间：
private String djrname;//   登记人姓名
private String byrname;//  保养人姓名：
private String byrtime;//保养的时间：
private String cjszt;//  采集时状态：
private String cjsctime;//采集日期
private String cjyjcztime;//药剂充装时间
private String gxhzt;//更新后状态
/**
 * @return the gxhzt
 */
public String getGxhzt() {
	return gxhzt;
}
/**
 * @param gxhzt the gxhzt to set
 */
public void setGxhzt(String gxhzt) {
	this.gxhzt = gxhzt;
}
private String gxsctime;//更新后生产日期
private String gxyjcztime;//更新后药剂充装时间
private String ssname;// 设施检查名称
private String ssbyszt;//设施保养时状态
private String ssgxhzt;//设施更新后状态
private String djsx;//等级属性

/**
 * @return the fjid
 */
public String getFjid() {
	return fjid;
}
/**
 * @param fjid the fjid to set
 */
public void setFjid(String fjid) {
	this.fjid = fjid;
}
/**
 * @return the glname
 */
public String getGlname() {
	return glname;
}
/**
 * @param glname the glname to set
 */
public void setGlname(String glname) {
	this.glname = glname;
}
/**
 * @return the iphone
 */
public String getIphone() {
	return iphone;
}
/**
 * @param iphone the iphone to set
 */
public void setIphone(String iphone) {
	this.iphone = iphone;
}
/**
 * @return the x
 */
public String getX() {
	return x;
}
/**
 * @param x the x to set
 */
public void setX(String x) {
	this.x = x;
}
/**
 * @return the y
 */
public String getY() {
	return y;
}
/**
 * @param y the y to set
 */
public void setY(String y) {
	this.y = y;
}
/**
 * @return the dwsxid
 */
public String getDwsxid() {
	return dwsxid;
}
/**
 * @param dwsxid the dwsxid to set
 */
public void setDwsxid(String dwsxid) {
	this.dwsxid = dwsxid;
}
/**
 * @return the dwsx
 */
public String getDwsx() {
	return dwsx;
}
/**
 * @param dwsx the dwsx to set
 */
public void setDwsx(String dwsx) {
	this.dwsx = dwsx;
}
/**
 * @return the dwxfaqzt
 */
public String getDwxfaqzt() {
	return dwxfaqzt;
}
/**
 * @param dwxfaqzt the dwxfaqzt to set
 */
public void setDwxfaqzt(String dwxfaqzt) {
	this.dwxfaqzt = dwxfaqzt;
}
/**
 * @return the mhqstyle
 */
public String getMhqstyle() {
	return mhqstyle;
}
/**
 * @param mhqstyle the mhqstyle to set
 */
public void setMhqstyle(String mhqstyle) {
	this.mhqstyle = mhqstyle;
}
/**
 * @return the mhqzl
 */
public String getMhqzl() {
	return mhqzl;
}
/**
 * @param mhqzl the mhqzl to set
 */
public void setMhqzl(String mhqzl) {
	this.mhqzl = mhqzl;
}
/**
 * @return the mhqnum
 */
public String getMhqnum() {
	return mhqnum;
}
/**
 * @param mhqnum the mhqnum to set
 */
public void setMhqnum(String mhqnum) {
	this.mhqnum = mhqnum;
}
/**
 * @return the mhqpp
 */
public String getMhqpp() {
	return mhqpp;
}
/**
 * @param mhqpp the mhqpp to set
 */
public void setMhqpp(String mhqpp) {
	this.mhqpp = mhqpp;
}
/**
 * @return the mhqcjname
 */
public String getMhqcjname() {
	return mhqcjname;
}
/**
 * @param mhqcjname the mhqcjname to set
 */
public void setMhqcjname(String mhqcjname) {
	this.mhqcjname = mhqcjname;
}
/**
 * @return the mhqsctime
 */
public String getMhqsctime() {
	return mhqsctime;
}
/**
 * @param mhqsctime the mhqsctime to set
 */
public void setMhqsctime(String mhqsctime) {
	this.mhqsctime = mhqsctime;
}
/**
 * @return the djrname
 */
public String getDjrname() {
	return djrname;
}
/**
 * @param djrname the djrname to set
 */
public void setDjrname(String djrname) {
	this.djrname = djrname;
}
/**
 * @return the byrname
 */
public String getByrname() {
	return byrname;
}
/**
 * @param byrname the byrname to set
 */
public void setByrname(String byrname) {
	this.byrname = byrname;
}
/**
 * @return the byrtime
 */
public String getByrtime() {
	return byrtime;
}
/**
 * @param byrtime the byrtime to set
 */
public void setByrtime(String byrtime) {
	this.byrtime = byrtime;
}
/**
 * @return the cjszt
 */
public String getCjszt() {
	return cjszt;
}
/**
 * @param cjszt the cjszt to set
 */
public void setCjszt(String cjszt) {
	this.cjszt = cjszt;
}
/**
 * @return the cjsctime
 */
public String getCjsctime() {
	return cjsctime;
}
/**
 * @param cjsctime the cjsctime to set
 */
public void setCjsctime(String cjsctime) {
	this.cjsctime = cjsctime;
}
/**
 * @return the cjyjcztime
 */
public String getCjyjcztime() {
	return cjyjcztime;
}
/**
 * @param cjyjcztime the cjyjcztime to set
 */
public void setCjyjcztime(String cjyjcztime) {
	this.cjyjcztime = cjyjcztime;
}


/**
 * @return the gxsctime
 */
public String getGxsctime() {
	return gxsctime;
}
/**
 * @param gxsctime the gxsctime to set
 */
public void setGxsctime(String gxsctime) {
	this.gxsctime = gxsctime;
}
/**
 * @return the gxyjcztime
 */
public String getGxyjcztime() {
	return gxyjcztime;
}
/**
 * @param gxyjcztime the gxyjcztime to set
 */
public void setGxyjcztime(String gxyjcztime) {
	this.gxyjcztime = gxyjcztime;
}
/**
 * @return the ssname
 */
public String getSsname() {
	return ssname;
}
/**
 * @param ssname the ssname to set
 */
public void setSsname(String ssname) {
	this.ssname = ssname;
}
/**
 * @return the ssbyszt
 */
public String getSsbyszt() {
	return ssbyszt;
}
/**
 * @param ssbyszt the ssbyszt to set
 */
public void setSsbyszt(String ssbyszt) {
	this.ssbyszt = ssbyszt;
}
/**
 * @return the ssgxhzt
 */
public String getSsgxhzt() {
	return ssgxhzt;
}
/**
 * @param ssgxhzt the ssgxhzt to set
 */
public void setSsgxhzt(String ssgxhzt) {
	this.ssgxhzt = ssgxhzt;
}
/**
 * @return the djsx
 */
public String getDjsx() {
	return djsx;
}
/**
 * @param djsx the djsx to set
 */
public void setDjsx(String djsx) {
	this.djsx = djsx;
}
/**
 * @return the jbInfo
 */
public static Collection getJbInfo() {
	return jb_info;
}
/**
 * @return the serialversionuid
 */
public static long getSerialversionuid() {
	return serialVersionUID;
}
/**
 * @return the pcsid
 */
public String getPcsid() {
	return pcsid;
}
/**
 * @param pcsid the pcsid to set
 */
public void setPcsid(String pcsid) {
	this.pcsid = pcsid;
}
/**
 * @return the sqid
 */
public String getSqid() {
	return sqid;
}
/**
 * @param sqid the sqid to set
 */
public void setSqid(String sqid) {
	this.sqid = sqid;
}
/**
 * @return the dwname
 */
public String getDwname() {
	return dwname;
}
/**
 * @param dwname the dwname to set
 */
public void setDwname(String dwname) {
	this.dwname = dwname;
}
/**
 * @return the dwmj
 */
public String getDwmj() {
	return dwmj;
}
/**
 * @param dwmj the dwmj to set
 */
public void setDwmj(String dwmj) {
	this.dwmj = dwmj;
}
/**
 * @return the dwaddress
 */
public String getDwaddress() {
	return dwaddress;
}
/**
 * @param dwaddress the dwaddress to set
 */
public void setDwaddress(String dwaddress) {
	this.dwaddress = dwaddress;
}
/**
 * @return the yyzzid
 */


}
 