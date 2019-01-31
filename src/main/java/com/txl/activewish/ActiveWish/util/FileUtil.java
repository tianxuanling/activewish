package com.txl.activewish.ActiveWish.util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;


/**
 * @ClassName: FileUtil
 * @Description: TODO(文件操作类)
 * @author tianxuanling
 * @date 2017-10-31 下午5:35:27
 */
public class FileUtil {
	/**
	 * @Title: writeFile
	 * @Description: TODO(生成文件)
	 * @param 输入类型
	 * @return void 返回类型
	 * @throws
	 */
	public void writeFile(String path,List<String[]> list) {
		try {
			//生成文件
			File filename = new File(path);
			filename.createNewFile();
			File filenameok = new File(path.replaceAll(".txt", ".ok"));
			filenameok.createNewFile();
			
			//写入文件
			FileOutputStream o = null;
			o = new FileOutputStream(filename);
			
			//组装文件内容
			for(int i=0;i < list.size();i++){
				String[] str = list.get(i);
				if(str[1] != null && !str[1].isEmpty()){
					String msg = str[1] + StringUtil.MSG_VERTICAL + str[2] + StringUtil.MSG_VERTICAL + str[3];
					if(i < list.size()-1){
						msg += "\n";
					}
					o.write(msg.getBytes("gbk"));
				}
			}
			o.close();
			LogUtil.initLogContext().info(path + StringUtil.VERTICAL + "文件IO写入成功!");
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			LogUtil.initLogContext().error(e.toString());
		}
	}
}
