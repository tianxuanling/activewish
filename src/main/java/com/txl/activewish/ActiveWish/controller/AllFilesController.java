package com.txl.activewish.ActiveWish.controller;

import com.txl.activewish.ActiveWish.thread.AllFilesHandler;
import com.txl.activewish.ActiveWish.util.LogUtil;

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
	public void launchAllFiles(){
		LogUtil.initLogContext().info("The AllFilesController service is in the process of controlled!");
		
		//while(true){
			try {
				LogUtil.initLogContext().info("The AllFilesController service is waiting for the next controller!");
				//执行频率
				//Thread.sleep(100000);
				
				//全文件检测主线程启动
				new AllFilesHandler();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//}
	}
}
