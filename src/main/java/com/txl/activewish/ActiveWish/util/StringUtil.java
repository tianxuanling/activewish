package com.txl.activewish.ActiveWish.util;

/**
 * 
 * @ClassName: StringUtil
 * @Description: TODO(字符串服务)
 * @author tianxuanling
 * @date 2017-11-1 下午8:28:27
 */
public class StringUtil {
	//日志分隔符
	public static String VERTICAL = "|";
	
	//短信内容分隔符
	public static String MSG_VERTICAL = "|";
	
	/**
	 * @Title: formatString
	 * @Description: TODO(流水号格式化)
	 * @param @param sequence
	 * @param @return    输入类型
	 * @return String    返回类型
	 * @throws
	 */
	public static String formatString(Integer sequence){
		String tempSequence = null;
		if(sequence < 10){
			tempSequence = "000" + sequence;
		}else if(9 < sequence && sequence < 100){
			tempSequence = "00" + sequence;
		}else if(99 < sequence && sequence < 1000){
			tempSequence = "0" + sequence;
		}else if(999 < sequence && sequence < 10000){
			tempSequence = sequence.toString();
		}
		return tempSequence;
	}
	
	public static String escapeSpecialWord(String str) {
		if(str != null&& !str.isEmpty()){
			str = str.replaceAll("\\+", "%2B");
			str = str.replaceAll(" ", "%20");
			str = str.replaceAll("\\?", "%3F");
			str = str.replaceAll("\\#", "%23");
			str = str.replaceAll("\\$", "%26");
			str = str.replaceAll("\\=", "%3D");
			return str;
		}
		return null;
	}
}
