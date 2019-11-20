package com.txl.activewish.ActiveWish.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.txl.activewish.ActiveWish.dao.FileRepository;
import com.txl.activewish.ActiveWish.model.ActiveWishFile;
import com.txl.activewish.ActiveWish.service.FileService;
import com.txl.activewish.ActiveWish.util.PropertiesUtil;

@Service
public class FileServiceImpl implements FileService {
	@Autowired
	private FileRepository fileRepository;

	@Override
	public ActiveWishFile queryByPathName(String pathName) {
		// TODO Auto-generated method stub
		return fileRepository.findByPathName(pathName);
	}

	@Override
	public List queryByName(String workno, String chartno) {
		// TODO Auto-generated method stub
		if (workno == null || "".equals(workno)) {
			if (chartno == null || "".equals(chartno)) {
				workno = "8cc18c2fdf08549c9a60e11ab6ccae08";
				chartno = "8cc18c2fdf08549c9a60e11ab6ccae08";
			}
		}
		if (workno == null) {
			workno = "";
		}
		if (chartno == null) {
			chartno = "";
		}
		return fileRepository.findByName(workno, chartno);
	}

	@Override
	public List queryBoxListByWorknoOrChartno(String workno, String chartno) {
		// TODO Auto-generated method stub
		if (workno == null || "".equals(workno)) {
			if (chartno == null || "".equals(chartno)) {
				workno = "8cc18c2fdf08549c9a60e11ab6ccae08";
				chartno = "8cc18c2fdf08549c9a60e11ab6ccae08";
			}
		}
		if (workno == null) {
			workno = "";
		}
		if (chartno == null) {
			chartno = "";
		}
		return fileRepository.findBoxListByWorknoOrChartno(workno, chartno, PropertiesUtil.AM_MONITOR_ROOT_DIRECTORY);
	}

	@Override
	public List queryBoxListByLimit(String workno, String chartno, int limit) {
		// TODO Auto-generated method stub
		if (workno == null) {
			workno = "";
		}
		if (chartno == null) {
			chartno = "";
		}
		return fileRepository.queryBoxListByLimit(workno, chartno, limit, PropertiesUtil.AM_MONITOR_ROOT_DIRECTORY);
	}

	@Override
	public List queryMarkListByWorknoOrChartno(String workno, String chartno) {
		// TODO Auto-generated method stub
		if (workno == null || "".equals(workno)) {
			if (chartno == null || "".equals(chartno)) {
				workno = "8cc18c2fdf08549c9a60e11ab6ccae08";
				chartno = "8cc18c2fdf08549c9a60e11ab6ccae08";
			}
		}
		if (workno == null) {
			workno = "";
		}
		if (chartno == null) {
			chartno = "";
		}
		return fileRepository.queryMarkListByWorknoOrChartno(workno, chartno, PropertiesUtil.AM_MONITOR_ROOT1_DIRECTORY);
	}

	@Override
	public List queryProcessListByLimit(String workno, String chartno, int limit) {
		// TODO Auto-generated method stub
		if (workno == null) {
			workno = "";
		}
		if (chartno == null) {
			chartno = "";
		}
		return fileRepository.queryProcessListByLimit(workno, chartno, limit, PropertiesUtil.AM_MONITOR_ROOT2_DIRECTORY);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List queryAll() {
		// TODO Auto-generated method stub
		return fileRepository.findAll();
	}
}