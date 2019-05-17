package com.txl.activewish.ActiveWish.database.impl;

import java.sql.Connection;
import java.sql.DriverManager;

import com.txl.activewish.ActiveWish.database.DataBase;
import com.txl.activewish.ActiveWish.util.PropertiesUtil;

/**
 * @ClassName: MySql
 * @Description: TODO(mysql数据库基础类)
 * @author tianxuanling
 * @date 2017-10-31 下午4:27:55
 */
public class MySql extends DataBase {
	/**
	 * @Title: getConn
	 * @Description: TODO(获取Mysql数据库连接)
	 * @param @return 输入类型
	 * @throws
	 */
	@SuppressWarnings("finally")
	public Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://" + PropertiesUtil.MYSQL_SERVER_IP + ":" + PropertiesUtil.MYSQL_SERVER_PORT + "/" + PropertiesUtil.MYSQL_SERVER_DATABASE + "?user=" + PropertiesUtil.MYSQL_SERVER_USERNAME + "&password=" + PropertiesUtil.MYSQL_SERVER_PASSWORD + "&characterEncoding=utf8&useSSL=false");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
}
