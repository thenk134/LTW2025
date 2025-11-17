package Util;

import java.awt.print.Printable;
import java.security.MessageDigest;

import org.apache.tomcat.util.codec.binary.Base64;

public class mahoa {
	//MD5
	//SHA-1
	public static String toSHA1(String str) {
		String salt = "alskdjci;.aaownru!!toix.@"; //làm phức tạp chuỗi String trước khi mã hóa
		String result = null;
		
		str = str + salt;
		try {
			byte[]	dataBytes = str.getBytes("UTF-8");
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			result = Base64.encodeBase64String(md.digest(dataBytes));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(toSHA1("123456"));
	}
}
