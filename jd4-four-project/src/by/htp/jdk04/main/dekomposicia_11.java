package by.htp.jdk04.main;

import java.util.Random;

public class dekomposicia_11 {

public static void main(String[] args) {
		
		int[] mas;
		int sum;
		
		mas = initArrayRandom(7);
		
		sum = calcSumOfElem(mas, 3, 5);
		
		printSum(sum);
		
		
	}
	
	public static int[] initArrayRandom(int n) {
		
		int[] arr = new int[n];
		
		Random rand = new Random();
	
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
			
		}
		
		return arr;
		
	}
	
	public static int calcSumOfElem(int[] arr, int k, int m) {
		
		int sum = 0;
		
		for(int i = k; i <= m; i++) {
			sum+= arr[i];
			
		}
		
		return sum;
		}
	
	public static void printSum(int sum) {
		System.out.print("Сумма элементов массива = " + sum);
	}
	
}
