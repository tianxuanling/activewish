package com.txl.activewish.ActiveWish.util;

import java.util.UUID;

/**
 * 
 * @ClassName: UuidUtil
 * @Description: TODO(UUID服务)
 * @author tianxuanling
 * @date 2017-11-1 下午3:22:44
 */
public class UUIDUtil {
	/**
	 * 
	 * @Title: generateUuid
	 * @Description: TODO(生成UUID)
	 * @param @return    输入类型
	 * @return String    返回类型 
	 * @throws
	 */
	public static String generateUuid(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
