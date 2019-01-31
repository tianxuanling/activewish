package com.txl.activewish.ActiveWish.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @ClassName: DataBase
 * @Description: TODO(jdbc数据库基础类)
 * @author tianxuanling
 * @date 2017-10-31 下午4:12:25
 */
public abstract class DataBase {
	/**
	 * @Title: getConn
	 * @Description: TODO(获取数据库连接，抽象方法。)
	 * @param @return 输入类型
	 * @return Connection 返回类型
	 * @throws
	 */
	public abstract Connection getConn();

	/**
	 * @Title: getStmt
	 * @Description: TODO(获得Statement)
	 * @param @param conn
	 * @param @return 输入类型
	 * @return Statement 返回类型
	 * @throws
	 */
	@SuppressWarnings("finally")
	public Statement getStmt(Connection conn) {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return stmt;
		}
	}

	/**
	 * @Title: getResultSet
	 * @Description: TODO(获得sql查询结果集)
	 * @param @param stmt
	 * @param @param sql
	 * @param @return 输入类型
	 * @return ResultSet 返回类型
	 * @throws
	 */
	public ResultSet getResultSet(Statement stmt, String sql) {
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * @Title: executeSql
	 * @Description: TODO(执行一条sql)
	 * @param @param stmt
	 * @param @param sql
	 * @param @return 输入类型
	 * @return boolean 返回类型
	 * @throws
	 */
	public boolean executeSql(Statement stmt, String sql) {
		try {
			if (!stmt.execute(sql)) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * @Title: closeConn
	 * @Description: TODO(关闭conn)
	 * @param @param conn 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void closeConn(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @Title: closeStmt
	 * @Description: TODO(关闭stmt)
	 * @param @param stmt 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void closeStmt(Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @Title: closePstmt
	 * @Description: TODO(关闭pstmt)
	 * @param @param pstmt    输入类型
	 * @return void    返回类型 
	 * @throws
	 */
	public void closePstmt(PreparedStatement pstmt) {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @Title: closeRs
	 * @Description: TODO(关闭rs)
	 * @param @param rs 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void closeRs(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
