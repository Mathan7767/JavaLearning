package com.java.currencyformat;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

	/*double value can be formatted to US,
	India, Chinese, France Currency Formats*/

public class PaymentFormatter {

	static String currencyFormatter(Locale locale, double paymentAmount) {
		NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
		return nf.format(paymentAmount);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Payment Amount");
		double payment=sc.nextDouble();
		
		/* India does not have a built-in Locale, we must construct one */
		Locale indianLocale=new Locale("en","IN");
		
		System.out.println("US: " + currencyFormatter(Locale.US, payment));
        System.out.println("India: " + currencyFormatter(indianLocale, payment));
        System.out.println("China: " + currencyFormatter(Locale.CHINESE,payment));
        System.out.println("France: " + currencyFormatter(Locale.FRANCE,payment));
        sc.close();
	}
}
