package com.txl.activewish.ActiveWish.service.impl;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.txl.activewish.ActiveWish.dao.ActiveWishDao;
import com.txl.activewish.ActiveWish.dao.FileRepository;
import com.txl.activewish.ActiveWish.service.AllFilesService;
import com.txl.activewish.ActiveWish.util.LogUtil;

@Service
public class AllFilesServiceImpl implements AllFilesService {
	@Autowired
	private FileRepository fileRepository;

	private ActiveWishDao activeWishDao = new ActiveWishDao();

	private long sum = 1;

	@Override
	public void doAllFiles(String filePath) {
		// TODO Auto-generated method stub
		try {
//			LogUtil.initLogContext().info(filePath);
			File file = new File(filePath);
			if (!file.isDirectory()) {
				LogUtil.initLogContext().info("配置的主监控目录必须是文件夹，当前配置为文件，程序挂起!");
				return;
			} else {
				String[] filelist = file.list();
				for (int i = 0; i < filelist.length; i++) {
					File readfile = new File(filePath + "/" + filelist[i]);
					if (!readfile.isDirectory()) {
//						LogUtil.initLogContext().info(sum + readfile.getAbsolutePath());
						List<String[]> list = activeWishDao.queryFileByPathName(readfile.getAbsolutePath().replaceAll("\\\\", "\\\\\\\\"));
						if(list != null && list.size() < 1) {
							activeWishDao.createFile(readfile);
						}
						sum++;
					} else {
						doAllFiles(readfile.getAbsolutePath());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	@Override
	public void doAllFilesReverse() {
		// TODO Auto-generated method stub
		int start = 0;
		int end = 10;
		int step = 10;
		Integer count = activeWishDao.queryAllFilesCount();
		
		if(count > 0) {
			List<String[]> list = null;
			int sum = 0;
			do {
				if(list != null) {
					start = start + step;
				}
				
				list = activeWishDao.queryFilesByLimit(start, end);
				for(String[] str : list) {
					File file = new File(str[1]);
					if(file.exists()) {
//						LogUtil.initLogContext().info("文件存在：" + sum + file.getAbsolutePath());
					}else {
						LogUtil.initLogContext().info("文件不存在：" + sum + file.getAbsolutePath());
						activeWishDao.deleteFileById(str[0]);
					}
					
					sum++;
				}
				list.clear();
			}while(start < count);
		}
	}
}