package com.txl.activewish.ActiveWish.listener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationObserver;

import com.txl.activewish.ActiveWish.dao.ActiveWishDao;
import com.txl.activewish.ActiveWish.util.LogUtil;

public class FileListener implements FileAlterationListener {
	
	FileListener monitor = null;
	ActiveWishDao activeWishDao = new ActiveWishDao();
	
	@Override
	public void onStart(FileAlterationObserver observer) {
		LogUtil.initLogContext().info("The ActiveWish service is start in controlled!");
	}

	@Override
	public void onDirectoryCreate(File directory) {
		LogUtil.initLogContext().info("onDirectoryCreate:" + directory.getAbsolutePath());
	}

	@Override
	public void onDirectoryChange(File directory) {
		LogUtil.initLogContext().info("onDirectoryChange:" + directory.getAbsolutePath());
	}

	@Override
	public void onDirectoryDelete(File directory) {
		LogUtil.initLogContext().info("onDirectoryDelete:" + directory.getAbsolutePath());
	}

	@Override
	public void onFileCreate(File file) {
		LogUtil.initLogContext().info("onFileCreate:" + file.getAbsolutePath());
		activeWishDao.createFile(file);
	}

	@Override
	public void onFileChange(File file) {
		LogUtil.initLogContext().info("onFileChange:" + file.getAbsolutePath());
		activeWishDao.changeFile(file);
	}

	@Override
	public void onFileDelete(File file) {
		LogUtil.initLogContext().info("onFileDelete:" + file.getAbsolutePath());
		activeWishDao.deleteFile(file);
	}

	@Override
	public void onStop(FileAlterationObserver observer) {
		LogUtil.initLogContext().info("The ActiveWish service is end in controlled!");
	}
}
