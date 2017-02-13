/**
 * @author HS
 * 创建时间： 2017年2月13日
 * 创建人    ： Du wei jun
 * 文件名：     FenJuDao.java
 *
 */ 
package FireControl.com.jfinal.Model;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.template.ext.directive.Str;

public class FenJuDao extends Model<FenJuDao>{
	public  final FenJuDao fenju_dao = new FenJuDao();
//查询分局
	public static List<Record> QueryFenju() {

	List<Record> Fenju = Db.find("select * from fj_info");
			return  Fenju;
		}
//查询派出所
	public static List<Record> Querypcs( String fenju) {
		List<Record> pcs = Db.find("select * from pcs_info where fjid = "+fenju+"");
		return pcs;
		
	}
//查询社区
	public static List<Record> Querysq( String pusid) {
		List<Record> pcs = Db.find("select * from sq_info where pusid = "+pusid+"");
		return pcs;
		
	}
//查询单位
	public static List<Record> DanWei( ) {
		List<Record> danwei = Db.find("select * from dwlx_info");
		return danwei;
}
	//查询单位属性和状态
		public static List<Record> DanWeiShuXin(String dwshuxin) {
			System.out.println(dwshuxin+":传值");
			List<Record> danweishuxin = Db.find("select * from dwsx_info where dwsx_info.dwsxid="+dwshuxin+"");
			
			return danweishuxin;
	}
		//查询单位属性和状态
		public static List<Record> DanWeiZt(String zt) {
			System.out.println(zt+":传值");
			List<Record> zhaungtai = Db.find("select * from dwsxzt_info where dwsxid="+zt+"");
			
			return zhaungtai;
	}
}