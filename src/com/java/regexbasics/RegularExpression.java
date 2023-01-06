package com.java.regexbasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		String sentence="Thupparku thuppaya thuppakki thupparku "
				+ "Thuppaya thoovum mazhai";
		String searchWord="thuppa";
		
		/* Pattern p=Pattern.compile(searchWord); */
		
		Pattern p=Pattern.compile(searchWord,Pattern.CASE_INSENSITIVE);
		
		Matcher m=p.matcher(sentence);
		int countFrequency=0;
		while(m.find()) {
			countFrequency++;
			/* System.out.println("Pattern Found at "+m.start()+" and ends at"+(m.end()-1)); */
		}
		
		System.out.println("Total Occurance of "+searchWord +" is "+countFrequency);
	}
}
