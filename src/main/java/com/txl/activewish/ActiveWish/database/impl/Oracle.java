package com.txl.activewish.ActiveWish.database.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.txl.activewish.ActiveWish.database.DataBase;

/**
 * @ClassName: Oracle
 * @Description: TODO(Oracle数据库基础类)
 * @author tianxuanling
 * @date 2017-10-31 下午4:51:42
 */
public class Oracle extends DataBase {

	/**
	 * @Title: getConn
	 * @Description: TODO(获取Oracle数据库连接)
	 * @param @return 输入类型
	 * @throws
	 */
	@SuppressWarnings("finally")
	public Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.1.104:1521:projectmanager:",
					"root", "hyisaxi");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
}
