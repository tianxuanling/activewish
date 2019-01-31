package com.txl.activewish.ActiveWish.service;

import java.util.List;

import com.txl.activewish.ActiveWish.model.ActiveWishFile;

public interface FileService {
	/**
	 *  根据文件路径名查询文件
	 * @param pathName
	 * @return
	 */
	public ActiveWishFile findByPathName(String pathName);
	
	@SuppressWarnings("rawtypes")
	public List findAll();

	/**
	 * 根据文件名查询文件
	 * @param workno 
	 * @param chartno
	 * @return
	 */
	public List findByName(String workno, String chartno);
}
