package numbers;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 121;
		int number = num;
		int reminder;
		int reverse = 0;
		
		while(number != 0) {
			
			reminder= number % 10;
			reverse = reverse*10 + reminder;
			number = number/10;
		}
		
		if(num == reverse)
			System.out.println("Its a palindrome : " + reverse);
		
		else
			System.out.println("Its not a palindrome : " + reverse);

	}

}
