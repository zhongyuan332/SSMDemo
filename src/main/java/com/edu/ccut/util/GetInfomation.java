package com.edu.ccut.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhongyuan
 * @date 2016年7月31日
 */
public class GetInfomation {

	private static Logger logger = Logger.getLogger(GetInfomation.class);  //log4j 测试

	/**
	 * 获取ip地址
	 * 
	 * @param request
	 * @return
	 */
	public String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	/**
	 * 获取mac地址
	 * 
	 * @param ip
	 * @return
	 */

	public String getMACAddress(String ip) {
		String str = "";
		String macAddress = "";
		try {
			Process p = Runtime.getRuntime().exec("nbtstat -A " + ip);
			InputStreamReader ir = new InputStreamReader(p.getInputStream());
			LineNumberReader input = new LineNumberReader(ir);
			for (int i = 1; i < 100; i++) {
				str = input.readLine();
				if (str != null) {
					if (str.indexOf("MAC Address") > 1) {
						macAddress = str.substring(str.indexOf("MAC Address") + 14, str.length());
						break;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
		return macAddress;
	}

	/**
	 * 判断是否超过24小时
	 * 
	 * 
	 * 
	 * @param date1
	 * 
	 * @param date2
	 * 
	 * @return boolean
	 * 
	 * @throws Exception
	 * 
	 */
	public static boolean judgmentDate(String date1, String date2) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d HH:mm:ss");

		Date start = sdf.parse(date1);

		Date end = sdf.parse(date2);

		long cha = end.getTime() - start.getTime();

		if (cha < 0) {

			return false;

		}

		double result = cha * 1.0 / (1000 * 60 * 60);

		if (result <= 24) {

			return true;

		} else {

			return false;

		}

	}
	
	public static String getRandomString(int length) { //length表示生成字符串的长度
	    String base = "abcdefghijklmnopqrstuvwxyz0123456789";   
	    Random random = new Random();   
	    StringBuffer sb = new StringBuffer();   
	    for (int i = 0; i < length; i++) {   
	        int number = random.nextInt(base.length());   
	        sb.append(base.charAt(number));   
	    }   
	    return sb.toString();   
	 } 
}
