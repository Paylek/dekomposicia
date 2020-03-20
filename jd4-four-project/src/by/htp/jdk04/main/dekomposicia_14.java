package by.htp.jdk04.main;

public class dekomposicia_14 {

	public static void main(String[] args) {
		int number1 = 1234568;
		int number2 = 75577;
		
		int moreDigitVal;
		
		moreDigitVal = moreDigitValue(number1, number2);
		
		printResult(moreDigitVal);
	}
	
	public static int calcDigitsFromNumber(int number) {
		
		int n = 0;
		
		while(number > 0) {
			number /= 10;
			n++;
		}
		return n;
	}
	
	public static int moreDigitValue(int numb1, int numb2) {
		
		if (calcDigitsFromNumber(numb1) > calcDigitsFromNumber(numb2)) {
			return numb1;
		}
		else if (calcDigitsFromNumber(numb1) == calcDigitsFromNumber(numb2)) {
			return 0;
		}
		
		else {
			return numb2;
		}
		
	}
	
	public static void printResult(int maxDigitValue) {
		
		if (maxDigitValue == 0) {
			System.out.print("����� �������� ���������� ���������� ����");	
		}
		else {
		     System.out.print("����� " + maxDigitValue + " �������� ������ ����");
		}
	}
	
}
