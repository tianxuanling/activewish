package com.txl.activewish.ActiveWish;

import com.txl.activewish.ActiveWish.service.AllFilesService;
import com.txl.activewish.ActiveWish.service.impl.AllFilesServiceImpl;
import com.txl.activewish.ActiveWish.util.PropertiesUtil;

public class TxlTest {
	private static Integer sum = 1;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}

	public static void test1(){
		PropertiesUtil.initPropertiesContext();
		AllFilesService allFilesService = new AllFilesServiceImpl();
		allFilesService.doAllFiles(PropertiesUtil.AM_MONITOR_ROOT_DIRECTORY);
	}
}
