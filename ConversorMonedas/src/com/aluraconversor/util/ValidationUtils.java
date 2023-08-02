package com.aluraconversor.util;

public class ValidationUtils {
	
	public static boolean validateNumbers(String n) 
	{
		try {
			double text =  Double.parseDouble(n);
			return true;
			
		} catch (NumberFormatException e) {
			return false;
		}
		
	}
}
