package FireControl.com.jfinal.Contrller;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

import com.baomidou.kisso.web.WebKissoConfigurer;
import com.jfinal.plugin.IPlugin;

/**
 * <p>
 * Kisso jfinal 插件形式初始化
 * </p>
 * 
 * jfinal 拦截器不够灵活，因此写在 demo 中，方便您自己修改。
 * 
 * @author hubin
 * @Date 2015-02-06
 */
/*public class KissoJfinalPlugin implements IPlugin {

	//protected static final Logger logger = Logger.getLogger("WebKissoConfigurer");
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(KissoJfinalPlugin.class);

	*//**
	 * 初始化
	 *//*
	public boolean start() {
		WebKissoConfigurer ssoConfig = new WebKissoConfigurer("sso.properties");
		// 此处可以实现自己的 KISSO 插件，也可动态注入 SSO 配置属性。
		// ssoConfig.setPluginList(pluginList);
		
		//运行模式设置，可选择指定模式的配置
		ssoConfig.setRunMode("test_mode");
		ssoConfig.initKisso();
		logger.info("插件初始化完成!");
		return true;
	}


	*//**
	 * 销毁
	 *//*
	public boolean stop() {
		logger.info("Uninstalling Kisso ");
		  logger.info("插件销毁!");
		return true;
	}

}
*/

public class KissoJfinalPlugin implements IPlugin{
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(KissoJfinalPlugin.class);
    //开始
    @Override
    public boolean start() {
        /*进行初始化*/
        WebKissoConfigurer webKissoConfigurer = new WebKissoConfigurer("sso.properties");
        webKissoConfigurer.setRunMode("test_mode");
        webKissoConfigurer.initKisso();
        logger.info("插件初始化完成!");
        return true;

    }
    //结束
    @Override
    public boolean stop() {
        logger.info("插件销毁!");
        return true;
    }
    }