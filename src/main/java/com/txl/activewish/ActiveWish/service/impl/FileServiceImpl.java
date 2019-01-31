package com.txl.activewish.ActiveWish.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.txl.activewish.ActiveWish.dao.FileRepository;
import com.txl.activewish.ActiveWish.model.ActiveWishFile;
import com.txl.activewish.ActiveWish.service.FileService;

@Service
public class FileServiceImpl implements FileService {
	@Autowired
	private FileRepository fileRepository;

	@Override
	public ActiveWishFile findByPathName(String pathName) {
		// TODO Auto-generated method stub
		return fileRepository.findByPathName(pathName);
	}

	@Override
	public List findByName(String workno, String chartno) {
		// TODO Auto-generated method stub
		if(workno == null || "".equals(workno)) {
			if(chartno == null || "".equals(chartno)) {
				workno = "8cc18c2fdf08549c9a60e11ab6ccae08";
				chartno = "8cc18c2fdf08549c9a60e11ab6ccae08";
			}
		}
		if(workno == null) {
			workno = "";
		}
		if(chartno == null) {
			chartno = "";
		}
		return fileRepository.findByName(workno, chartno);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return fileRepository.findAll();
	}
}