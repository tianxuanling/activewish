package com.txl.activewish.ActiveWish.service;

import java.util.List;

import com.txl.activewish.ActiveWish.model.ActiveWishFile;

public interface FileService {
	/**
	 *  根据文件路径名搜索文件
	 * @param pathName
	 * @return
	 */
	public ActiveWishFile queryByPathName(String pathName);
	
	/**
	 * 搜索全部文件
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public List queryAll();

	/**
	 * 根据文件名搜索文件
	 * @param workno 
	 * @param chartno
	 * @return
	 */
	public List queryByName(String workno, String chartno);

	/**
	 * 根据工号或者图号搜索装箱清单
	 * @param workno
	 * @param chartno
	 * @return
	 */
	public List queryBoxListByWorknoOrChartno(String workno, String chartno);

	/**
	 * 根据工号或者图号搜索唛头和标牌
	 * @param workno
	 * @param chartno
	 * @return
	 */
	public List queryMarkListByWorknoOrChartno(String workno, String chartno);

	/**
	 * 查询装箱清单前limit条数据并按照文档修改时间排序
	 * @param workno
	 * @param chartno
	 * @param limit
	 * @return
	 */
	public List queryBoxListByLimit(String workno, String chartno, int limit);

	/**
	 * 查询工艺院前limit条数据并按照文档修改时间排序
	 * @param workno
	 * @param chartno
	 * @param limit
	 * @return
	 */
	public List queryProcessListByLimit(String workno, String chartno, int limit);
}
