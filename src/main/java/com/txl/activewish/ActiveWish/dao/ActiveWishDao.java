package com.txl.activewish.ActiveWish.dao;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.txl.activewish.ActiveWish.database.DataBase;
import com.txl.activewish.ActiveWish.database.impl.MySql;
import com.txl.activewish.ActiveWish.util.DateUtil;
import com.txl.activewish.ActiveWish.util.LogUtil;
import com.txl.activewish.ActiveWish.util.PropertiesUtil;
import com.txl.activewish.ActiveWish.util.StringUtil;
import com.txl.activewish.ActiveWish.util.UUIDUtil;

/**
 * @ClassName: ActiveMessageDao
 * @Description: TODO(ActiveMessage数据库操作)
 * @author tianxuanling
 * @date 2017-11-1 下午2:41:34
 */
public class ActiveWishDao {
	// 创建数据库操作对象
	private DataBase db = new MySql();
	// 数据库连接
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	// 数据库查询结果集
	private ResultSet rs = null;

	/**
	 * @Title: insertSending
	 * @Description: TODO(向短信池保存数据)
	 * @param @param sending
	 * @param @return 输入类型
	 * @return boolean 返回类型
	 * @throws
	 */
	public void insertSending(List<String[]> list) {
		try {
			// 封装sql
			String sql = "insert into am_sending (id, phonenumber, orgcode, message, createtime) values (?,?,?,?,?)";

			conn = db.getConn();
			pstmt = conn.prepareStatement(sql);
			for (String[] str : list) {
				pstmt.setString(1, UUIDUtil.generateUuid());
				pstmt.setString(2, str[3]);
				pstmt.setString(3, "27000099");
				pstmt.setString(4, "您有一个新的任务到达，任务编号：" + str[0] + ",工单类型："
						+ str[4] + ",工单创建人：" + str[5] + ",任务创建时间：" + str[1]
						+ ",请及时处理。");
				pstmt.setTimestamp(5, new Timestamp(new Date().getTime()));
				pstmt.addBatch();

				LogUtil.initLogContext().info(
						"向am_sending表插入数据:" + pstmt.toString());
			}
			pstmt.executeBatch(); // 执行更新
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LogUtil.initLogContext().error(e.toString());
		} finally {
			db.closePstmt(pstmt);
			db.closeConn(conn);
		}
	}

	/**
	 * @Title: querySending
	 * @Description: TODO(查询sending表数据并封装成List)
	 * @param @return 输入类型
	 * @return List<String[]> 返回类型
	 * @throws
	 */
	public List<String[]> querySending() {
		try {
			List<String[]> list = new ArrayList<String[]>();
			// 封装sql
			String sql = "select * from am_sending t where 1=1 order by t.createtime asc limit 20";

			conn = db.getConn();
			stmt = db.getStmt(conn);
			rs = db.getResultSet(stmt, sql);

			while (rs.next()) {
				String[] listStr = new String[5];
				listStr[0] = rs.getString("id");
				listStr[1] = rs.getString("phonenumber");
				listStr[2] = rs.getString("orgcode");
				listStr[3] = rs.getString("message");
				listStr[4] = rs.getString("createtime");
				list.add(listStr);
			}

			LogUtil.initLogContext().info("查询am_sending表数据:" + stmt.toString());
			return list;
		} catch (SQLException e) {
			LogUtil.initLogContext().error(e.toString());
			return null;
		} finally {
			db.closeRs(rs);
			db.closeStmt(stmt);
			db.closeConn(conn);
		}
	}

	/**
	 * @Title: saveAmFikes
	 * @Description: TODO(保存生成文件的数据)
	 * @param @param fileName 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void saveAmFiles(String fileName) {
		// TODO Auto-generated method stub
		try {
			// 封装sql
			String sql = "insert into am_files (id, filename, status, createtime) values (?,?,?,?)";

			conn = db.getConn();
			pstmt = conn.prepareStatement(sql);
			String uuid = UUIDUtil.generateUuid();
			pstmt.setString(1, uuid);
			pstmt.setString(2, fileName);
			pstmt.setInt(3, 0);
			pstmt.setTimestamp(4, new Timestamp(new Date().getTime()));
			pstmt.executeUpdate(); // 执行更新

			LogUtil.initLogContext().info("向am_files表插入数据:" + pstmt.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LogUtil.initLogContext().error(e.toString());
		} finally {
			db.closePstmt(pstmt);
			db.closeConn(conn);
		}
	}

	/**
	 * @Title: queryAmFiles
	 * @Description: TODO(查询amfiles文件发送数据)
	 * @param @return 输入类型
	 * @return List 返回类型
	 * @throws
	 */
	public List<String[]> queryAmFiles() {
		// TODO Auto-generated method stub
		try {
			List<String[]> list = new ArrayList<String[]>();
			// 封装sql
			String sql = "select * from am_files t where 1=1 and t.status=0 order by t.createtime asc limit 10";

			conn = db.getConn();
			stmt = db.getStmt(conn);
			rs = db.getResultSet(stmt, sql);

			while (rs.next()) {
				String[] listStr = new String[2];
				listStr[0] = rs.getString("id");
				listStr[1] = rs.getString("filename");
				list.add(listStr);
			}

			LogUtil.initLogContext().info("查询AmFiles:" + sql);
			return list;
		} catch (SQLException e) {
			LogUtil.initLogContext().error(e.toString());
			return null;
		} finally {
			db.closeRs(rs);
			db.closeStmt(stmt);
			db.closeConn(conn);
		}
	}

	/**
	 * @Title: updateAmFiles
	 * @Description: TODO(更新am_files文件表)
	 * @param @param list 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void updateAmFiles(List<String[]> list) {
		// TODO Auto-generated method stub
		try {
			conn = db.getConn();
			stmt = db.getStmt(conn);
			for (String[] str : list) {
				String sql = "update am_files t set t.status=1 where t.id='"
						+ str[0] + "';";
				stmt.addBatch(sql);
				LogUtil.initLogContext().info("更新am_files文件表:" + sql);
			}
			stmt.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LogUtil.initLogContext().error(e.toString());
		} finally {
			db.closeStmt(stmt);
			db.closeConn(conn);
		}
	}

	/**
	 * @Title: saveSent
	 * @Description: TODO(保存已发送表数据)
	 * @param @param list 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void saveSent(List<String[]> list) {
		// TODO Auto-generated method stub
		try {
			// 封装sql
			String sql = "insert into am_sent (id, phonenumber, orgcode, message,starttime,endtime,createtime) values (?,?,?,?,?,?,?)";

			conn = db.getConn();
			pstmt = conn.prepareStatement(sql);
			for (String[] str : list) {
				pstmt.setString(1, str[0]);
				pstmt.setString(2, str[1]);
				pstmt.setString(3, str[2]);
				pstmt.setString(4, str[3]);
				pstmt.setTimestamp(5, Timestamp.valueOf(str[4]));
				pstmt.setTimestamp(6, new Timestamp(new Date().getTime()));
				pstmt.setTimestamp(7, new Timestamp(new Date().getTime()));
				pstmt.addBatch();

				LogUtil.initLogContext().info("更新am_sent表:" + pstmt.toString());
			}
			pstmt.executeBatch(); // 执行更新
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LogUtil.initLogContext().error(e.toString());
		} finally {
			db.closePstmt(pstmt);
			db.closeConn(conn);
		}
	}

	/**
	 * @Title: deleteAmSending
	 * @Description: TODO(删除am_sending表数据)
	 * @param @param list 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void deleteAmSending(List<String[]> list) {
		// TODO Auto-generated method stub
		try {
			// 封装sql
			String sql = "delete from am_sending where id = ?";

			conn = db.getConn();
			pstmt = conn.prepareStatement(sql);
			for (String[] str : list) {
				pstmt.setString(1, str[0]);
				pstmt.addBatch();

				LogUtil.initLogContext().info(
						"删除am_sending表:" + pstmt.toString());
			}
			pstmt.executeBatch(); // 执行更新
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LogUtil.initLogContext().error(e.toString());
		} finally {
			db.closePstmt(pstmt);
			db.closeConn(conn);
		}
	}

	/**
	 * @Title: queryLoadDatas
	 * @Description: TODO(查询工作项数据)
	 * @param @return 输入类型
	 * @return List<String[]> 返回类型
	 * @throws
	 */
	public List<String[]> queryLoadDatas() {
		// TODO Auto-generated method stub
		try {
			List<String[]> list = new ArrayList<String[]>();
			// 封装sql
			StringBuffer sql = new StringBuffer("select * from ");
			sql.append("(select buc.workordernum,wk.workitemid,wk.createtime,emp.empname,emp.mobileno,wk.processchname,empinst.empname as createusername ");
			sql.append("from wfworkitem wk ");
			sql.append("left join org_employee emp on emp.empid=wk.participant ");
			sql.append("left join wfprocessinst inst on inst.processinstid=wk.processinstid ");
			sql.append("left join org_employee empinst on empinst.empid=inst.creator ");
			sql.append("left join itil_businessdata_collect buc on buc.processinstid=wk.processinstid ");
			sql.append("where wk.currentstate=10 ");
			sql.append("union all ");
			sql.append("select buc.workordernum,wk.workitemid,wk.createtime,emp.empname,emp.mobileno,wk.processchname,empinst.empname as createusername ");
			sql.append("from (SELECT wki.processinstid,wki.workitemid,wki.processinstname as processinstname,wki.processchname,wki.createtime, ");
			sql.append("REPLACE	( wki.PARTICIPANT, '|', ',' ) AS userid,REPLACE ( wki.PARTINAME, '|', ',' ) AS username ");
			sql.append("FROM wfworkitem wki ");
			sql.append("WHERE wki.CURRENTSTATE=4)wk ");
			sql.append("left join org_employee emp on FIND_IN_SET(emp.empid,wk.userid) and FIND_IN_SET(emp.empname,wk.username) ");
			sql.append("left join wfprocessinst inst on inst.processinstid=wk.processinstid ");
			sql.append("left join org_employee empinst on empinst.empid=inst.creator ");
			sql.append("left join itil_businessdata_collect buc on buc.processinstid=wk.processinstid)t ");
			sql.append("where t.workorderNum is not null ");
			sql.append("and t.createtime > (select  ac.starttime from am_config ac where ac.id='1') ");
			sql.append("order by t.createtime asc limit 500 ");

			conn = db.getConn();
			stmt = db.getStmt(conn);
			rs = db.getResultSet(stmt, sql.toString());

			while (rs.next()) {
				String[] listStr = new String[6];
				listStr[0] = rs.getString("workordernum");
				listStr[1] = rs.getString("createtime");
				listStr[2] = rs.getString("empname");
				listStr[3] = rs.getString("mobileno");
				listStr[4] = rs.getString("processchname");
				listStr[5] = rs.getString("createusername");
				list.add(listStr);
			}

			LogUtil.initLogContext().info("查询工作项数据:" + sql.toString());
			return list;
		} catch (SQLException e) {
			LogUtil.initLogContext().error(e.toString());
			return null;
		} finally {
			db.closeRs(rs);
			db.closeStmt(stmt);
			db.closeConn(conn);
		}
	}

	/**
	 * @Title: updateAmConfig
	 * @Description: TODO(更新am_config表的时间)
	 * @param @param startTime 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void updateAmConfig(String startTime) {
		// TODO Auto-generated method stub
		try {
			conn = db.getConn();
			stmt = db.getStmt(conn);
			String sql = "update am_config t set t.starttime='"
					+ Timestamp.valueOf(startTime) + "' where t.id='1'";
			LogUtil.initLogContext().info("更新am_files文件表:" + sql);
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LogUtil.initLogContext().error(e.toString());
		} finally {
			db.closeStmt(stmt);
			db.closeConn(conn);
		}
	}

	/**
	 * @Title: queryConfigOnAndOff
	 * @Description: TODO(查询整体开关 0 为关，1为开)
	 * @param @return 输入类型
	 * @return Object 返回类型
	 * @throws
	 */
	public Integer queryConfigOnAndOff() {
		// TODO Auto-generated method stub
		try {
			List<Integer> list = new ArrayList<Integer>();
			// 封装sql
			String sql = "select * from am_config t where 1=1 and t.id='2'";

			conn = db.getConn();
			stmt = db.getStmt(conn);
			rs = db.getResultSet(stmt, sql);

			while (rs.next()) {
				list.add(Integer.parseInt(rs.getString("status")));
			}

			LogUtil.initLogContext().info("查询am_config控制开关:" + stmt.toString());
			return list.get(0);
		} catch (SQLException e) {
			LogUtil.initLogContext().error(e.toString());
			return null;
		} finally {
			db.closeRs(rs);
			db.closeStmt(stmt);
			db.closeConn(conn);
		}
	}

	/**
	 * @Title: queryConfigSequence
	 * @Description: TODO(查询当前流水码)
	 * @param @return 输入类型
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer queryConfigSequence() {
		// TODO Auto-generated method stub
		try {
			List<Integer> list = new ArrayList<Integer>();
			DateUtil du = new DateUtil();
			String sequenceDate = null;
			// 封装sql
			String sql = "select * from am_config t where 1=1 and t.id='1'";

			conn = db.getConn();
			stmt = db.getStmt(conn);
			rs = db.getResultSet(stmt, sql);

			while (rs.next()) {
				list.add(Integer.parseInt(rs.getString("sequence")));
				sequenceDate = rs.getString("sequencedate");
				if (sequenceDate == null) {
					sequenceDate = "";
				}
			}
			LogUtil.initLogContext().info("查询am_config流水码:" + stmt.toString());

			if (sequenceDate.equals(du.formatDateTime(new Date(), "yyyyMMdd"))) {
				stmt = db.getStmt(conn);
				String sql1 = "update am_config t set t.sequence='"
						+ (list.get(0) + 1) + "' where t.id='1'";
				LogUtil.initLogContext().info("重置流水码:" + sql1);
				stmt.executeUpdate(sql1);
				return list.get(0) + 1;
			} else {
				stmt = db.getStmt(conn);
				String sql2 = "update am_config t set t.sequencedate='"
						+ du.formatDateTime(new Date(), "yyyyMMdd")
						+ "',t.sequence=1 where t.id='1'";
				LogUtil.initLogContext().info("重置流水码:" + sql2);
				stmt.executeUpdate(sql2);
				return 1;
			}
		} catch (SQLException e) {
			LogUtil.initLogContext().error(e.toString());
			return null;
		} finally {
			db.closeRs(rs);
			db.closeStmt(stmt);
			db.closeConn(conn);
		}
	}

	/**
	 * @Title: updateAmConfigSequence
	 * @Description: TODO(更新流水码)
	 * @param @param sequence 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void updateAmConfigSequence(int sequence) {
		// TODO Auto-generated method stub
		try {
			DateUtil du = new DateUtil();
			conn = db.getConn();
			stmt = db.getStmt(conn);
			String sql = "update am_config t set t.sequence='" + sequence
					+ "' where t.id='1'";
			LogUtil.initLogContext().info("重置流水码:" + sql);
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LogUtil.initLogContext().error(e.toString());
		} finally {
			db.closeStmt(stmt);
			db.closeConn(conn);
		}
	}

	/**
	 * @Title: resetAmConfigSequence
	 * @Description: TODO(重置流水码)
	 * @return void 返回类型
	 * @throws
	 */
	public void resetAmConfigSequence() {
		// TODO Auto-generated method stub
		try {
			DateUtil du = new DateUtil();
			conn = db.getConn();
			stmt = db.getStmt(conn);
			String sql = "update am_config t set t.sequencedate='"
					+ du.formatDateTime(new Date(), "yyyyMMdd")
					+ ",t.sequence=1' where t.id='1'";
			LogUtil.initLogContext().info("重置流水码:" + sql);
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LogUtil.initLogContext().error(e.toString());
		} finally {
			db.closeStmt(stmt);
			db.closeConn(conn);
		}
	}

	/**
	 * @Title: createFile
	 * @Description: TODO(创建文件)
	 * @param @param file 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void createFile(File file) {
		// TODO Auto-generated method stub
		try {
			// 封装sql
			String sql = "insert into am_monitor_currentfile (id, name, pathname, url, size, creatercode,creatername,createtime) values (?,?,?,?,?,?,?,?)";

			conn = db.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, UUIDUtil.generateUuid());
			pstmt.setString(2, file.getName());
			pstmt.setString(3, file.getAbsolutePath());
			pstmt.setString(4, PropertiesUtil.AM_HTTP_URL + StringUtil.escapeSpecialWord(file.getAbsolutePath()));
			pstmt.setString(5, String.valueOf(file.length()));
			pstmt.setString(6, "system");
			pstmt.setString(7, "system");
			pstmt.setTimestamp(8, new Timestamp(new Date().getTime()));
			pstmt.addBatch();

			LogUtil.initLogContext().info(
					"新增am_monitor_currentfile表:" + pstmt.toString());
			pstmt.executeBatch(); // 执行sql
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LogUtil.initLogContext().error(e.toString());
		} finally {
			db.closePstmt(pstmt);
			db.closeConn(conn);
		}
	}

	/**
	 * @Title: changeFile
	 * @Description: TODO(文件变更)
	 * @param @param file 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void changeFile(File file) {
		// TODO Auto-generated method stub
	}

	/**
	 * @Title: deleteFile
	 * @Description: TODO(删除文件)
	 * @param @param file 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void deleteFile(File file) {
		// TODO Auto-generated method stub
		try {
			// 封装sql
			String sql = "delete from am_monitor_currentfile where pathname = ?";

			conn = db.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, file.getAbsolutePath());
			pstmt.addBatch();

			LogUtil.initLogContext().info("删除am_monitor_currentfile表:" + pstmt.toString());
			pstmt.executeBatch(); // 执行sql
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LogUtil.initLogContext().error(e.toString());
		} finally {
			db.closePstmt(pstmt);
			db.closeConn(conn);
		}
	}
	
	/**
	 * 
	 * @Title: queryFileByPathName 
	 * @Description: TODO(通过绝对路径查询相应数据库的数据)
	 * @param @param pathName
	 * @param @return    输入类型 
	 * @return List<String[]>    返回类型 
	 * @throws
	 */
	public List<String[]> queryFileByPathName(String pathName) {
		// TODO Auto-generated method stub
		try {
			List<String[]> list = new ArrayList<String[]>();
			// 封装sql
			String sql = "select * from am_monitor_currentfile t where t.pathname = '" + pathName + "'";

			conn = db.getConn();
			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, pathName);
			
			rs = pstmt.executeQuery(sql);

			while (rs.next()) {
				String[] listStr = new String[8];
				listStr[0] = rs.getString("id");
				listStr[1] = rs.getString("name");
				listStr[2] = rs.getString("pathname");
				listStr[3] = rs.getString("url");
				listStr[4] = rs.getString("size");
				listStr[5] = rs.getString("creatercode");
				listStr[6] = rs.getString("creatername");
				listStr[7] = rs.getString("createtime");
				list.add(listStr);
			}

//			LogUtil.initLogContext().info("queryFileByPathName:" + sql);
			return list;
		} catch (SQLException e) {
			LogUtil.initLogContext().error(e.toString());
			return null;
		} finally {
			db.closeRs(rs);
			db.closeStmt(pstmt);
			db.closeConn(conn);
		}
	}
	
	/**
	 * 
	 * @Title: queryFilesByLimit
	 * @Description: TODO(分页查询文件数据)
	 * @param @param start 开始位置
	 * @param @param end  结束位置
	 * @param @return    输入类型
	 * @return List<String[]>    返回类型
	 * @throws
	 */
	public List<String[]> queryFilesByLimit(int start,int end) {
		// TODO Auto-generated method stub
		try {
			List<String[]> list = new ArrayList<String[]>();
			// 封装sql
			String sql = "select t.id,t.pathname from am_monitor_currentfile t where 1=1 order by t.createtime asc limit "+ start +","+ end;

			conn = db.getConn();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery(sql);

			while (rs.next()) {
				String[] listStr = new String[2];
				listStr[0] = rs.getString("id");
				listStr[1] = rs.getString("pathname");
				list.add(listStr);
			}

//			LogUtil.initLogContext().info("queryFileByPathName:" + sql);
			return list;
		} catch (SQLException e) {
			LogUtil.initLogContext().error(e.toString());
			return null;
		} finally {
			db.closeRs(rs);
			db.closeStmt(pstmt);
			db.closeConn(conn);
		}
	}
	
	/**
	 * 
	 * @Title: queryAllFilesCount
	 * @Description: TODO(查询全部文件数量)
	 * @param @return    输入类型
	 * @return Integer    返回类型
	 * @throws
	 */
	public Integer queryAllFilesCount() {
		// TODO Auto-generated method stub
		try {
			List<Integer> list = new ArrayList<Integer>();
			// 封装sql
			String sql = "select count(1) as count from am_monitor_currentfile";

			conn = db.getConn();
			stmt = db.getStmt(conn);
			rs = db.getResultSet(stmt, sql);

			while (rs.next()) {
				list.add(rs.getInt("count"));
			}

//			LogUtil.initLogContext().info("查询全部文件数量:" + stmt.toString());
			return list.get(0);
		} catch (SQLException e) {
			LogUtil.initLogContext().error(e.toString());
			return null;
		} finally {
			db.closeRs(rs);
			db.closeStmt(stmt);
			db.closeConn(conn);
		}
	}
	
	/**
	 * 
	 * @Title: deleteFileByPathName
	 * @Description: TODO(根据id删除相关数据)
	 * @param @param id
	 * @return void    返回类型
	 * @throws
	 */
	public void deleteFileById(String id) {
		// TODO Auto-generated method stub
		try {
			// 封装sql
			String sql = "delete from am_monitor_currentfile where id = ?";

			conn = db.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.addBatch();

			LogUtil.initLogContext().info("删除am_monitor_currentfile表:" + pstmt.toString());
			pstmt.executeBatch(); // 执行sql
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LogUtil.initLogContext().error(e.toString());
		} finally {
			db.closePstmt(pstmt);
			db.closeConn(conn);
		}
	}
}
