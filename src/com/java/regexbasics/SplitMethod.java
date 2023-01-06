package com.java.regexbasics;

import java.util.regex.Pattern;

public class SplitMethod {

	public static void main(String[] args) {

		String sentence="Thupparku thuppaya thuppakki thupparku "
				+ "Thuppaya thoovum mazhai";
		String regexPattern=" ";
		/* String Split Method */
		String[] splitMethodinString=sentence.split(regexPattern); //Argument==>regex 

		for(String s:splitMethodinString) {
			System.out.println(s);
		}
		
		/* Pattern Split Method */
		Pattern p=Pattern.compile(regexPattern);
		String[] splitMethodinPattern=p.split(sentence); //Argument==>String
		
		for(String s:splitMethodinPattern) {
			System.out.println(s);
		}
		
		
	}

}
