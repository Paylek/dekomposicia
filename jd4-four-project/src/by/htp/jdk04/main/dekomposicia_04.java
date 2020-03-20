package by.htp.jdk04.main;

import java.util.Scanner;

public class dekomposicia_04 {

public static void main(String[] args) {
		
		int a = scannerInt();
		int b = scannerInt();
		int c = scannerInt();
		int n = naimensheeOk(a, b);
		int p = naimensheeOk(n, c);
		sCanner(a, b, c, p);
}

public static void sCanner(int a, int b, int c, int p) {
	
	System.out.println("Наименьшее общее кратное " + a + " " + b + " " + c + " = " + p);

	
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

public static int naimensheeOk(int a, int b) {
	 
	 int temp = naibolchiiOd(a, b);
	 
	 int res = a * b / temp;
	 
	 return res;
	 
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
