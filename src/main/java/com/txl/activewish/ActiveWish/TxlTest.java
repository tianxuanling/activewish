package com.txl.activewish.ActiveWish;

import com.txl.activewish.ActiveWish.service.AllFilesService;
import com.txl.activewish.ActiveWish.service.impl.AllFilesServiceImpl;
import com.txl.activewish.ActiveWish.util.PropertiesUtil;
import com.txl.activewish.ActiveWish.util.StringUtil;

public class TxlTest {
	private static Integer sum = 1;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2();
	}

	public static void test1(){
		PropertiesUtil.initPropertiesContext();
		AllFilesService allFilesService = new AllFilesServiceImpl();
		allFilesService.doAllFiles(PropertiesUtil.AM_MONITOR_ROOT1_DIRECTORY);
		allFilesService.doAllFilesReverse();
	}
	
	public static void test2() {
		System.out.println(StringUtil.processURLCharacter("我是 中国人'"));
	}
	
	public static void test3() {
		System.out.println("E:\\tianxuanling\\source-code\\ideaWorkBench\\activewish\\files\\Gitlab介绍5.pptx".replaceAll("\\\\","\\\\"));
	}
}