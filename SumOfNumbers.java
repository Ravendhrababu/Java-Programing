package numbers;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		int number = 121221421;
		int remainder = 0;
		int sum = 0;
		
		while(number != 0) {
			
			remainder = number % 10;
			number = number / 10;
			sum = sum+remainder;
		}
		System.out.println("Sum of the number : " + sum );

	}

}
