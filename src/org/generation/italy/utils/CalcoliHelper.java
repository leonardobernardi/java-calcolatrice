package org.generation.italy.utils;

public class CalcoliHelper {
	
	private CalcoliHelper() {
		
	}
	
	public static int somma (int a, int b) {
		return a + b;
	}
	
	public static double somma (double a, double b) {
		return a + b;
	}
	
	public static int differenza (int a, int b) {
		return a - b;
	}
	
	public static double differenza (double a, double b) {
		return a - b;
	}
	
	public static int moltiplicazione (int a, int b) {
		return a * b;
	}
	
	public static double moltiplicazione (double a, double b) {
		return a * b;
	}
	
	public static int valoreAssoluto (int a) {
		if(a < 0) {
			return a + a * -2;
		}else {
			return a;
		}
	}
	
	public static double valoreAssoluto (double a) {
		if(a < 0) {
			return a + a * -2;
		}else {
			return a;
		}
	}
	
	public static int minimo (int a, int b) {
		if(a <= b) {
			return a;
		}else {
			return b;
		}
	}
		
	public static double minimo (double a, double b) {
		if(a <= b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static int massimo (int a, int b) {
		if(a >= b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static double massimo (double a, double b) {
		if(a >=b) {
			return a;
		}else{
			return b;
		}
	}
	
	public static double potenza (int a, int b) {
		int result = 0;
		if(a == 0) {
			result = 0;
		}
		else if(b == 0) {
			result = 1;
		}else if(b == 1) {
			result = a;
		}else if(b == -1) {
			result = 1 / a;
		}
		else if(b < 0) {
			a = 1 / a;
			b = b + b * -2;
			int c = a * a;
			for(int i = 2; i < b; i++) {
				c = c * a;
			}
			result = c;
		}else{
			int c = a * a;
			for(int i = 2; i < b; i++) {
				c = c * a;
			}
			result = c;
		}
		return result;
	}
}
