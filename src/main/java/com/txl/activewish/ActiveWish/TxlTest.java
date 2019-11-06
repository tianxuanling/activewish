package com.txl.activewish.ActiveWish;

import java.io.File;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
		test6();
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
	
	public static void test4() {
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				// task to run goes here
				System.out.println("Hello !!!");
			}
		};
		Timer timer = new Timer();
		long delay = 0;
		long intevalPeriod = 1 * 1000;
		// schedules the task to be run in an interval
		timer.scheduleAtFixedRate(task, delay, intevalPeriod);
	}
	
	public static void test5() {
		Runnable runnable = new Runnable() {
			public void run() {
				// task to run goes here
				System.out.println("Hello !!");
			}
		};
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		// 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
		service.scheduleAtFixedRate(runnable, 10, 1, TimeUnit.SECONDS);
	}
	
	public static void test6() {
		File f1 = new File("D:\\workbench\\eclipse-workbench\\activewish\\files\\我是中国人\\总体架构图.ppt");
		System.out.println(new Date(f1.lastModified()).toLocaleString());
	}
}