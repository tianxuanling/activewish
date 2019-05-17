package com.txl.activewish.ActiveWish.service;

public interface AllFilesService {
	/**
	 * 
	 * @Title: doAllFiles 
	 * @Description: TODO(全文件检测，以文件夹里面的所有文件为依据把数据库里面没有的文件添加进数据库) 
	 * @param @param filePath    文件夹路径
	 * @return void    返回类型 
	 * @throws
	 */
	public void doAllFiles(String filePath);
	
	/**
	 * 
	 * @Title: doAllFilesReverse 
	 * @Description: TODO(全文件检测，以数据库数据为依据，把其对应的真实绝对路径上没有文件的数据删除掉) 
	 * @param     输入类型 
	 * @return void    返回类型 
	 * @throws
	 */
	public void doAllFilesReverse();
}
