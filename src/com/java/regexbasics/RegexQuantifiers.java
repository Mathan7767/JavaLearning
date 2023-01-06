package com.java.regexbasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuantifiers {
	public static void main(String[] args) {
		String sentence="Thupparku thupppaya thuppakki thupparku "
				+ "Thuppaya thoovum mazhai";
		String searchWord="p{3}";
		
		Pattern p=Pattern.compile(searchWord);
		Matcher m=p.matcher(sentence);
		while(m.find()) {
			System.out.println("Pattern Found at "+m.start()+
					" and ends at "+m.end()); 
		}
	}
}
