package com.txl.activewish.ActiveWish.controller;

import com.txl.activewish.ActiveWish.listener.FileListener;
import com.txl.activewish.ActiveWish.listener.FileMonitor;
import com.txl.activewish.ActiveWish.util.LogUtil;
import com.txl.activewish.ActiveWish.util.PropertiesUtil;

/**
 * 
 * @ClassName: LaunchController
 * @Description: TODO(ActiveWish全局控制器，指挥调度程序运行)
 * @author tianxuanling
 * @date 2019年5月23日 下午5:39:23
 *
 */
public class LaunchController {
	/**
	 * 
	 * @Title: launch
	 * @Description: TODO(全局启动器)
	 * @param     输入类型
	 * @return void    返回类型
	 * @throws
	 */
	public void launch() {
		try {
			//初始化全局配置文件
			init();
			LogUtil.initLogContext().info("The ActiveWish service is in controlled!");
			
			// 启动文件监控
			FileMonitor m = new FileMonitor(5000);
			m.monitor(PropertiesUtil.AM_MONITOR_ROOT_DIRECTORY, new FileListener());
			m.start();
			
			FileMonitor m1 = new FileMonitor(5000);
			m1.monitor(PropertiesUtil.AM_MONITOR_ROOT1_DIRECTORY, new FileListener());
			m1.start();
			
			// 启动全量文件检测
			AllFilesController allFilesController = new AllFilesController();
			allFilesController.launchAllFiles();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @Title: init
	 * @Description: TODO(初始化全局配置文件)
	 * @param     输入类型
	 * @return void    返回类型
	 * @throws
	 */
	public void init() {
		PropertiesUtil.initPropertiesContext();
		LogUtil.initLogContext().info("关键配置文件加载成功!");
	}
}
