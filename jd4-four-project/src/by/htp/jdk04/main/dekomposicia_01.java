package by.htp.jdk04.main;

import java.util.Scanner;

public class dekomposicia_01 {
	
	public static void main(String args[]) {
	
		double x1 = scannerDouble();
		double x2 = scannerDouble();
		double x3 = scannerDouble();
		double y1 = scannerDouble();
		double y2 = scannerDouble();
		double y3 = scannerDouble();
		double a = vichislenieDliny01(x1, x2, y1, y2);
		double b = vichislenieDliny02(x1, x3, y1, y3);
		double c = vichislenieDliny03(x2, x3, y2, y3);
		double p = vichisleniePolyPetimetra(a, b, c);
		double S = vichisleniePlochadi(a, b, c, p);
		sCanner(S);

	}
	
	public static double vichisleniePolyPetimetra(double a, double b, double c) {
		
		double p;
		p = (a + b + c) / 2;
		return p;
		
	}
	
	public static double vichisleniePlochadi(double a, double b, double c, double p) {
		
		double S;
		S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return S;
		
	}
	
	public static void sCanner(double S) {
		
		System.out.println("Площадь " + S);
		
	}
	
	public static double vichislenieDliny01(double x1, double x2, double y1, double y2) {
		
		double a = Math.sqrt(Math.pow(x1 + x2, 1 / 2) + Math.pow(y1 + y2, 1 / 2));
		return a;
		
	}
	
public static double vichislenieDliny02(double x1, double x3, double y1, double y3) {
		
		double b = Math.sqrt(Math.pow(x1 + x3, 1 / 2) + Math.pow(y1 + y3, 1 / 2));
		return b;
		
	}

public static double vichislenieDliny03(double x2, double x3, double y2, double y3) {
	
	double c = Math.sqrt(Math.pow(x2 + x3, 1 / 2) + Math.pow(y2 + y3, 1 / 2));
	return c;
	
}

	
public static double scannerDouble() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		double number;
		
		System.out.println("Введите число: \r");
		
		while(!in.hasNextDouble()) {
			
			in.next();
			
			System.out.println("Некорректный ввод!\r ");
			System.out.println("Введите число: \r");
		}
		number = in.nextDouble();
	
		return number;
		
	}
}
	
