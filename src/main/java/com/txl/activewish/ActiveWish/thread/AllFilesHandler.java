package com.txl.activewish.ActiveWish.thread;

import org.springframework.beans.factory.annotation.Autowired;

import com.txl.activewish.ActiveWish.service.AllFilesService;
import com.txl.activewish.ActiveWish.util.LogUtil;
import com.txl.activewish.ActiveWish.util.PropertiesUtil;

/**
 * 
 * @ClassName: ThreadHandler
 * @Description: TODO(全文件检测主线程管理句柄)
 * @author tianxuanling
 * @date 2017-11-1 下午2:23:28
 */
public class AllFilesHandler implements Runnable{
	@Autowired
	private AllFilesService allFilesService;
	
	/**
	 * <p>Title: 全文件检测主线程构造方法</p> 
	 * <p>Description: 全文件检测主线程构造方法</p>
	 */
	public AllFilesHandler() {
		new Thread(this).start();
	}

	/**
	 * @Title: run
	 * @Description: TODO(全文件检测主线程执行方法)
	 * @param     输入类型
	 * @throws
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		LogUtil.initLogContext().info("加载消息数据开始!");
		
		allFilesService.doAllFiles(PropertiesUtil.AM_MONITOR_ROOT_DIRECTORY);
		
		LogUtil.initLogContext().info("加载消息数据完成!");
	}
}
