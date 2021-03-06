package com.txl.activewish.ActiveWish.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @ClassName: PropertiesUtil
 * @Description: TODO(properties文件服务类)
 * @author tianxuanling
 * @date 2017-11-6 下午12:05:37
 */
public class PropertiesUtil {
	// mysql服务器ip地址
	public static String MYSQL_SERVER_IP = null;
	// mysql服务器端口
	public static Integer MYSQL_SERVER_PORT = null;
	// mysql数据库名称
	public static String MYSQL_SERVER_DATABASE = null;
	// mysql用户名称
	public static String MYSQL_SERVER_USERNAME = null;
	// mysql用户密码
	public static String MYSQL_SERVER_PASSWORD = null;
	
	// 需要监控的根目录
	public static String AM_MONITOR_ROOT_DIRECTORY = null;
	public static String AM_MONITOR_ROOT1_DIRECTORY = null;
	public static String AM_MONITOR_ROOT2_DIRECTORY = null;
	
	// nginx服务器地址
	public static String AM_HTTP_URL = null;
	
	/**
	 * <p>Title: properties文件服务类构造方法</p>
	 * <p>Description: properties文件服务类构造方法</p>
	 */
	@SuppressWarnings("static-access")
	private PropertiesUtil() {
		// TODO Auto-generated constructor stub
		try {
			Properties prop = new Properties();
			String path = "config/config.properties";
			InputStream in = new BufferedInputStream (new FileInputStream(path));
			
			prop.load(new InputStreamReader(in, "utf-8"));
			this.MYSQL_SERVER_IP = prop.getProperty("mysql.server.ip");
			this.MYSQL_SERVER_PORT = Integer.valueOf(prop.getProperty("mysql.server.port"));
			this.MYSQL_SERVER_DATABASE = prop.getProperty("mysql.server.database");
			this.MYSQL_SERVER_USERNAME = prop.getProperty("mysql.server.username");
			this.MYSQL_SERVER_PASSWORD = prop.getProperty("mysql.server.password");
			
			this.AM_MONITOR_ROOT_DIRECTORY = prop.getProperty("am.monitor.root.directory");
			this.AM_MONITOR_ROOT1_DIRECTORY = prop.getProperty("am.monitor.root1.directory");
			this.AM_MONITOR_ROOT2_DIRECTORY = prop.getProperty("am.monitor.root2.directory");
			
			this.AM_HTTP_URL = prop.getProperty("am.http.url");
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @Title: initPropertiesContext
	 * @Description: TODO(配置文件实例化)
	 * @param @return    输入类型
	 * @return PropertiesUtil    返回类型
	 * @throws
	 */
	public static PropertiesUtil initPropertiesContext(){
		return new PropertiesUtil();
	}
}
