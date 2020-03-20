package by.htp.jdk04.main;

public class dekomposicia_20 {

	public static void main(String[] args) {
		int number = 22;
		int countOp;
		
		countOp = calcOperationsToZero(number);
		printResult(countOp);
		
	}
public static int calcDifference(int arg1, int arg2) {
	int res;
	res = arg1 - arg2;
	
	return res;
}

public static int calcDigitSum(int number) {
	int sum = 0;
	int digit;
	
	while(number > 0) {
		digit = number % 10;
		number /= 10;
		sum += digit;
	}
	return sum;
}

public static int calcOperationsToZero(int number) {
	int count = 1;
	
	if(number == 0) {
		count = 0;	
	}
	else {
	int res = calcDifference(number, calcDigitSum(number));

	
	while(res != 0) {
		res = calcDifference(res, calcDigitSum(res));
		count++;
	}}
	return count; 
}

public static void printResult(int count) {
	System.out.print("Количество операций = " + count);
}
	
}
