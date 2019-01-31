package com.txl.activewish.ActiveWish.util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @ClassName: LogUtil
 * @Description: TODO(日志服务支撑)
 * @author tianxuanling
 * @date 2017-10-31 上午11:21:36
 */
public class LogUtil {
	protected static Logger logger = null;
	protected static String path = null;

	/**
	 * @Description: TODO(构造方法，加载log4j环境)
	 * @param     输入类型
	 * @throws
	 */
	@SuppressWarnings("static-access")
	protected LogUtil() {
		this.path = "config/log4j.properties";
		this.logger = Logger.getLogger(LogUtil.class);
		PropertyConfigurator.configure(path);// 绝对路径
	}
	
	/**
	 * @Title: getLogContext
	 * @Description: TODO(日志实例化)
	 * @param @return    输入类型
	 * @return LogUtil    返回类型 
	 * @throws
	 */
	public static LogUtil initLogContext(){
		return new LogUtil();
	}

	/**
	 * @Title: error
	 * @Description: TODO(Log4j建议只使用四个级别，优先级从高到低分别是ERROR、WARN、INFO、DEBUG。)
	 * @param @param str 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void error(String message) {
		logger.error(message);
	}

	/**
	 * @Title: warn
	 * @Description: TODO(Log4j建议只使用四个级别，优先级从高到低分别是ERROR、WARN、INFO、DEBUG。)
	 * @param @param str 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void warn(String message) {
		logger.warn(message);
	}

	/**
	 * @Title: info
	 * @Description: TODO(Log4j建议只使用四个级别，优先级从高到低分别是ERROR、WARN、INFO、DEBUG。)
	 * @param @param str 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void info(String message) {
		logger.info(message);
	}

	/**
	 * @Title: debug
	 * @Description: TODO(Log4j建议只使用四个级别，优先级从高到低分别是ERROR、WARN、INFO、DEBUG。)
	 * @param @param str 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void debug(String message) {
		logger.debug(message);
	}
}
