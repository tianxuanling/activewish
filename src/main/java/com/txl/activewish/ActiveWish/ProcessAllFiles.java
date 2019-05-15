package com.txl.activewish.ActiveWish;

import com.txl.activewish.ActiveWish.service.AllFilesService;
import com.txl.activewish.ActiveWish.service.impl.AllFilesServiceImpl;
import com.txl.activewish.ActiveWish.util.PropertiesUtil;

public class ProcessAllFiles {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doAllFiles();
	}

	public static void doAllFiles(){
		PropertiesUtil.initPropertiesContext();
		AllFilesService allFilesService = new AllFilesServiceImpl();
		allFilesService.doAllFiles(PropertiesUtil.AM_MONITOR_ROOT1_DIRECTORY);
	}
}