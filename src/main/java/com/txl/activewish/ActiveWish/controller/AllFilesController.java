package com.txl.activewish.ActiveWish.controller;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.txl.activewish.ActiveWish.service.AllFilesService;
import com.txl.activewish.ActiveWish.service.impl.AllFilesServiceImpl;
import com.txl.activewish.ActiveWish.thread.AllFilesHandler;
import com.txl.activewish.ActiveWish.util.LogUtil;
import com.txl.activewish.ActiveWish.util.PropertiesUtil;

/**
 * @ClassName: ActiveMessageController
 * @Description: TODO(全量文件控制器，指挥调度程序运行)
 * @author tianxuanling
 * @date 2017-11-1 上午11:51:19
 */
public class AllFilesController {
	/**
	 * @Title: launchLoad 
	 * @Description: TODO(启动全文件检测程序) 
	 * @param
	 * @return void    返回类型 
	 * @throws
	 */
	public static void launchAllFiles(){
		LogUtil.initLogContext().info("The AllFilesController service is in the process of controlled!");
		
		Runnable runnable = new Runnable() {
			private AllFilesService allFilesService = new AllFilesServiceImpl();
			
			public void run() {
				LogUtil.initLogContext().info("全文件检测开始!");

				allFilesService.doAllFiles(PropertiesUtil.AM_MONITOR_ROOT_DIRECTORY);
				allFilesService.doAllFiles(PropertiesUtil.AM_MONITOR_ROOT1_DIRECTORY);
				allFilesService.doAllFilesReverse();
				
				LogUtil.initLogContext().info("全文件检测完成!");
			}
		};
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		// 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
		service.scheduleAtFixedRate(runnable, 10, 1, TimeUnit.SECONDS);
		
		
		while(true){
			try {
				LogUtil.initLogContext().info("The AllFilesController service is waiting for the next controller!");
				//执行频率
				Thread.sleep(86400000);
				
				//全文件检测主线程启动
				new AllFilesHandler();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
