package by.htp.jdk04.main;

import java.util.Random;

public class dekomposicia_08 {

public static void main(String[] args) {
		
		
		int n = 10;
		
		int [] arr;
		
		arr = initArray(n);
		
		int maxArrayVal = maxValFromArray(arr);
		
		int submax = secondMaxInArray(arr, maxArrayVal);
		
		System.out.println(submax);
		
		
	}
	
	
public static int[] initArray(int n) {
	
	Random ran = new Random();
	
	int[] mas = new int[n];
	
	for (int i = 0; i < mas.length; i++) {
		mas[i] = ran.nextInt(10);

	}
	return mas;
}

public static int maxValFromArray(int[] arr) {
	
	int max = arr[0];
	
	for(int i = 0; i < arr.length; i++) {
		
		if (arr[i] > max) {
			max = arr[i];
		}
		else {}
		
		
	}
	return max;
}

public static int secondMaxInArray(int[] arr, int max) {
	
	int submax = arr[0];
	
	int j = 1;
	
	while (submax == max) {

		submax = arr[j];
		j++;
	}
	
	
	for(int i = 0; i < arr.length; i++) {
		
		if (arr[i] > submax && arr[i] < max) {
			submax = arr[i];
		}
		else {}
		
		
	}
	return submax;
	
}
	
}
