package com.yifeng.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo {

	public static void main(String[] args) {
		
		String str = "abcdefabc";
		String rgx = "(abc)+";
		
		//-----------basic pattern matcher----------
		Pattern p = Pattern.compile(rgx);
		System.out.println("//pattern matches demo: ");
		System.out.println(Pattern.matches(rgx, str));
		
		System.out.println("//pattern split demo: ");
		for(String item: p.split(str)) {
			System.out.println(item);
		}
		
		//--------matcher methods------------------
		System.out.println("Matchers methods");
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		System.out.println(m.lookingAt());
		
		//--------find()---------------------------
		System.out.println("//group() demo");
		Matcher matcher = Pattern.compile("\\w+")
				.matcher("Evergthing is full of linnet's wings");
		while(matcher.find())
			System.out.print(matcher.group() + " ");
		
		System.out.println();
		int i = 0;
		while(matcher.find(i)) {
			System.out.print(matcher.group() + " ");
			i++;
		}
		
		//---------group--------------------------------P534
		
		
		
		
		//---------qualifiers----------------------------
		
		
		
		
		//----------
	}

}
