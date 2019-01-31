package com.txl.activewish.ActiveWish.service.impl;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.txl.activewish.ActiveWish.dao.ActiveWishDao;
import com.txl.activewish.ActiveWish.dao.FileRepository;
import com.txl.activewish.ActiveWish.model.ActiveWishFile;
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

			File file = new File(filePath);
			if (!file.isDirectory()) {
				LogUtil.initLogContext().info("配置的主监控目录必须是文件夹，当前配置为文件，程序挂起!");
				return;
			} else {
				String[] filelist = file.list();
				for (int i = 0; i < filelist.length; i++) {
					File readfile = new File(filePath + "\\" + filelist[i]);
					if (!readfile.isDirectory()) {
						LogUtil.initLogContext().info(sum + readfile.getAbsolutePath());
						ActiveWishFile activeWishFile = fileRepository.findByPathName(readfile.getAbsolutePath());
						if(activeWishFile == null) {
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
}