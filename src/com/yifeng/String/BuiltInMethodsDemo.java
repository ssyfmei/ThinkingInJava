package com.yifeng.String;

import java.io.UnsupportedEncodingException;

public class BuiltInMethodsDemo {

	private static final String str1 = "abcdefghijklmnopqrstuvwxyz";
	private static final String str2 = "America&China";
	private static final String str3 = "1234567890";
	
	public static void main(String[] args) {
		
		// getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		char[] chars = new char[12];
		str3.getChars(0, 10, chars, 0);
		for(char c: chars)
			System.out.print(c);
		
		// getBytes() will use default charset
		byte[] bytes;
		try {
			bytes = str2.getBytes("ASCII");
			for(byte b: bytes)
				System.out.println(b);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// String format 
		
		
		// Simple regex match
		/**
		 * -?
		 * -?\\d+
		 * (-|\\+)
		 * \s whitespace  \S not a whitespace
		 * \d \D
		 * \w [a-zA-Z0-9] \W
		 * [^abc] negation
		 * [a-z&&[^m-p]] intersection
		 * XY X|Y
		 * (X) a capturing group. You can refer to the ith
		 * 
		 */
		
		
	}

}
