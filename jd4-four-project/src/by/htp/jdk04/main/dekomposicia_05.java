package by.htp.jdk04.main;

import java.util.Scanner;

public class dekomposicia_05 {
	
public static void main(String[] args) {
		
		int z = scannerInt();
		int a = viChislinieA(z);
		int b = viChislinieB(z, a);
		int c = viChislinieC(z, a, b);
		
		int l = min(a, b);
		int k = min(l, c);
		int v = max(a, b);
		int y = max(v, c);
		
		
		System.out.println("Наименьшая цифра " + k);
		System.out.println("Наибольшая цифра " + y);
		
		z = k + y;
		
		System.out.println("Сумма " + z);
		
}

public static int viChislinieA(int z) {
	
	 int a = (z / 100);
	 return a;
	
}

public static int viChislinieB(int z, int a) {
	
    int  b = (z - (a * 100)) / 10;
    return b;
	
}

public static int viChislinieC(int z, int a, int b) {

	int c = (z - (a * 100) - (b * 10));
	return c;

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
