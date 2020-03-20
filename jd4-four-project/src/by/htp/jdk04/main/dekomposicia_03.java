package by.htp.jdk04.main;

import java.util.Scanner;

public class dekomposicia_03 {

public static void main(String[] args) {
		
		int a = scannerInt();
		int b = scannerInt();
		int c = scannerInt();
		int d = scannerInt();
		int n = naibolchiiOd(a, b);
		int p = naibolchiiOd(n, c);
		int m = naibolchiiOd(p, d);
		sCanner(a, b, c, d, m);
}

public static void sCanner(int a, int b, int c, int d, int m) {
	
	System.out.println("Наибольший общий делитель чисел " + a + " " + b + " " + c + " " + d + " = " + m);

	
}

public static int min(int a, int b) {
	 
	 int min;
	 
	 if(a < b) {
		min = a; 
	 }
	 
	 else {
		 min = b;}
	 
	 return min;
	 
}

public static int max(int a, int b) {
	 
	 int max;
	 
	 if(a > b) {
		max = a; 
	 }
	 
	 else {
		 max = b;}
	 
	 return max;
	 
}

public static int naibolchiiOd(int a, int b) {
	 
	int n = min(a, b);
	
    int max = 1;
	
	for (int i = 1; i <= n; i++) {
		
		if (a % i == 0 && b % i == 0) {
			
			max = max(i, max);
		}
		
		else {}
		
	}
	
	return max;
	 
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
