package by.htp.jdk04.main;

import java.util.Scanner;

public class dekomposicia_06 {

public static void main(String[] args) {
		
		double a;
		
		a = scannerInt();
		
		double hexagonArea;
		
		hexagonArea = calcHexagonArea(a);
		
		System.out.println("Площадь правильного шестиугольника = " + hexagonArea);
		
       }
	
	public static double calcTriangleArea(double a) {
		
		double area;
		
		area = (Math.pow(a, 2) * Math.sqrt(3)) / 4;
		
		return area;
	}
	
    public static double calcHexagonArea(double a) {
		
		double hexagonArea;
		
		double triangleArea = calcTriangleArea(a);
		
		hexagonArea = 6 * triangleArea;
		
		return hexagonArea;
	}
    
 public static int scannerInt() {
 		
 		@SuppressWarnings("resource")
 		Scanner in = new Scanner(System.in);
 		
 		int number;
 		
 		System.out.println("Введите число: \r");
 		
 		while(!in.hasNextInt()) {
 			
 			in.next();
 			
 			System.out.println("Некорректный ввод!\r ");
 			System.out.println("Введите число: \r");
 		}
 		number = in.nextInt();
 	
 		return number;
 		
 	}
	
}
