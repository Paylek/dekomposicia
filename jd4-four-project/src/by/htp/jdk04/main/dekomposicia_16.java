package by.htp.jdk04.main;

public class dekomposicia_16 {

public static void main(String[] args) {
		
		int n = 9;
		int[] mas;
		
		mas = createArray(n);
		
		printTwins(mas);
		
	}
	
	
	public static int calcElementNumberInArray(int minBorder) {
		 int maxBoxder;
		 int elementNumber;
		 
		 maxBoxder = minBorder * 2;
		 
		 elementNumber = ((maxBoxder - minBorder) / 2) + 1;
		 
		 return elementNumber;
		 }
	
	public static int[] createArray(int minBorder) {
		
		int elementNumber;
		elementNumber = calcElementNumberInArray(minBorder);
		
		int[] arr = new int[elementNumber];
		
		int twinValue = minBorder;
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = twinValue;
			twinValue+= 2;
		}
		return arr;
	}
	
	public static void printTwins(int arr[]) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			System.out.println(arr[i] + " " + arr[i + 1]);
		}
	}
	
}
