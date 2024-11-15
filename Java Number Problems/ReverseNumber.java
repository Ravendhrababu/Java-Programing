package numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		// input : 123456  output : 654321
		
		int number = 123456;
		int reminder;
		int reverse = 0;
		
		while(number != 0) {
			
			reminder= number % 10;
			reverse = reverse*10 + reminder;
			number = number/10;
		}
		
		System.out.println(reverse);
		
		

	}

}
