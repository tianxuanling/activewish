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

	@ApiOperation(value = "根据工号或者图号搜索文件", notes = "根据工号或者图号搜索文件")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "workno", value = "工号", required = false, dataType = "String", defaultValue = ""),
			@ApiImplicitParam(name = "chartno", value = "图号", required = false, dataType = "String", defaultValue = "") })
	@RequestMapping(value = "/queryByName", method = RequestMethod.POST)
	public Map queryFileByName(String workno, String chartno) {
		List list = fileService.queryByName(workno, chartno);
		Map map = new HashMap();
		map.put("datas", list);
		return map;
	}

	@ApiOperation(value = "根据工号或者图号搜索装箱清单", notes = "根据工号或者图号搜索装箱清单")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "workno", value = "工号", required = false, dataType = "String", defaultValue = ""),
			@ApiImplicitParam(name = "chartno", value = "图号", required = false, dataType = "String", defaultValue = "") })
	@RequestMapping(value = "/queryBoxListByWorknoOrChartno", method = RequestMethod.POST)
	public Map queryBoxListByWorknoOrChartno(String workno, String chartno) {
		List list = fileService.queryBoxListByWorknoOrChartno(workno, chartno);
		Map map = new HashMap();
		map.put("datas", list);
		return map;
	}

	@ApiOperation(value = "装箱清单综合查询，按照修改时间排序，默认查询前200条", notes = "装箱清单综合查询，按照修改时间排序，默认显示前200条")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "workno", value = "工号", required = false, dataType = "String", defaultValue = ""),
			@ApiImplicitParam(name = "chartno", value = "图号", required = false, dataType = "String", defaultValue = ""),
			@ApiImplicitParam(name = "limit", value = "查询前N条数据", required = true, dataType = "int", defaultValue = "200") })
	@RequestMapping(value = "/queryBoxListByLimit", method = RequestMethod.POST)
	public Map queryBoxListByLimit(String workno, String chartno, int limit) {
		List list = fileService.queryBoxListByLimit(workno, chartno, 200);
		Map map = new HashMap();
		map.put("datas", list);
		return map;
	}

	@ApiOperation(value = "根据工号或者图号搜索唛头和标牌", notes = "根据工号或者图号搜索唛头和标牌")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "workno", value = "工号", required = false, dataType = "String", defaultValue = ""),
			@ApiImplicitParam(name = "chartno", value = "图号", required = false, dataType = "String", defaultValue = "") })
	@RequestMapping(value = "/queryMarkListByWorknoOrChartno", method = RequestMethod.POST)
	public Map queryMarkListByWorknoOrChartno(String workno, String chartno) {
		List list = fileService.queryMarkListByWorknoOrChartno(workno, chartno);
		Map map = new HashMap();
		map.put("datas", list);
		return map;
	}
}
