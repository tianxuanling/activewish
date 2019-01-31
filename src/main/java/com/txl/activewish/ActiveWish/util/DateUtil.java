/**
 * @Title: DateUtil.java
 * @Package com.primeton.eos.xiancommon
 * @Description: TODO(用一句话描述该文件做什么)
 * @author TianXuanLing zhaoshsummit@gmail.com
 * @date 2015年6月17日 下午6:11:37
 * @version V1.0
 */
package com.txl.activewish.ActiveWish.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public DateUtil() {
	}
	
	public String intervalFirstAndEndTime(String startTime,String endTime) throws Exception{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date startDateTime = df.parse(startTime);
		Date endtDateTime = df.parse(endTime);
		
		int nDay = (int) ((endtDateTime.getTime() - startDateTime.getTime()));
		return null;
	}

	// 格式化日期为字符串 "yyyy-MM-dd   hh:mm"
	public static String formatDateTime(Date basicDate, String strFormat) {
		SimpleDateFormat df = new SimpleDateFormat(strFormat);
		return df.format(basicDate);
	}

	// 格式化日期为字符串 "yyyy-MM-dd   hh:mm"
	public String formatDateTime(String basicDate, String strFormat) {
		SimpleDateFormat df = new SimpleDateFormat(strFormat);
		Date tmpDate = null;
		try {
			tmpDate = df.parse(basicDate);
		} catch (Exception e) {
			// 日期型字符串格式错误
		}
		return df.format(tmpDate);
	}

	// 当前日期加减n天后的日期，返回String (yyyy-mm-dd)
	public String nDaysAftertoday(int n) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar rightNow = Calendar.getInstance();
		// rightNow.add(Calendar.DAY_OF_MONTH,-1);
		rightNow.add(Calendar.DAY_OF_MONTH, +n);
		return df.format(rightNow.getTime());
	}

	// 当前日期加减n天后的日期，返回String (yyyy-mm-dd)
	public Date nDaysAfterNowDate(int n) {
		Calendar rightNow = Calendar.getInstance();
		// rightNow.add(Calendar.DAY_OF_MONTH,-1);
		rightNow.add(Calendar.DAY_OF_MONTH, +n);
		return rightNow.getTime();
	}

	// 给定一个日期型字符串，返回加减n天后的日期型字符串
	public String nDaysAfterOneDateString(String basicDate, int n) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date tmpDate = null;
		try {
			tmpDate = df.parse(basicDate);
		} catch (Exception e) {
			// 日期型字符串格式错误
		}
		long nDay = (tmpDate.getTime() / (24 * 60 * 60 * 1000) + 1 + n)
				* (24 * 60 * 60 * 1000);
		tmpDate.setTime(nDay);

		return df.format(tmpDate);
	}

	// 给定一个日期，返回加减n天后的日期
	public Date nDaysAfterOneDate(Date basicDate, int n) {
		long nDay = (basicDate.getTime() / (24 * 60 * 60 * 1000) + 1 + n)
				* (24 * 60 * 60 * 1000);
		basicDate.setTime(nDay);

		return basicDate;
	}

	// 计算两个日期相隔的天数
	public int nDaysBetweenTwoDate(Date firstDate, Date secondDate) {
		int nDay = (int) ((secondDate.getTime() - firstDate.getTime()) / (24 * 60 * 60 * 1000));
		return nDay;
	}

	// 计算两个日期相隔的天数
	public int nDaysBetweenTwoDate(String firstString, String secondString) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date firstDate = null;
		Date secondDate = null;
		try {
			firstDate = df.parse(firstString);
			secondDate = df.parse(secondString);
		} catch (Exception e) {
			// 日期型字符串格式错误
		}

		int nDay = (int) ((secondDate.getTime() - firstDate.getTime()) / (24 * 60 * 60 * 1000));
		return nDay;
	}
	
	//日期计算
	public void dateModified(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
//		rightNow.add(Calendar.YEAR, -1);// 日期减1年
		rightNow.add(Calendar.MONTH, 3);// 日期加3个月
//		rightNow.add(Calendar.DAY_OF_YEAR, 10);// 日期加10天
		Date dt1 = rightNow.getTime();
		String reStr = df.format(dt1);
		System.out.println(reStr);
	}
}
