package com.txl.activewish.ActiveWish.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.txl.activewish.ActiveWish.service.FileService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "文件服务接口", description = "文件服务接口")
@RequestMapping("/file")
public class FileController {

	@Autowired
	private FileService fileService;

	@ApiOperation(value = "根据工号或者图号查找文件", notes = "根据工号或者图号查找文件")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "workno", value = "工号", required = false, dataType = "String", defaultValue = ""),
			@ApiImplicitParam(name = "chartno", value = "图号", required = false, dataType = "String", defaultValue = "") })
	@RequestMapping(value = "/queryByName", method = RequestMethod.POST)
	public Map queryFileByName(String workno, String chartno) {
		List list = fileService.findByName(workno,chartno);
		Map map = new HashMap();
		map.put("datas", list);
		return map;
	}
}
