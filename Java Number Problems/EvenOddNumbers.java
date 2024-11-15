package numbers;

public class EvenOddNumbers {

	public static void main(String[] args) {
		
		int number = 22332233;
		int remainder;
		int evenCount = 0 ,oddCount = 0;
		
		while(number != 0) {
			
			remainder = number % 10;
			number = number / 10;
			
			if(remainder%2 == 0)
				evenCount++;
			else
				oddCount++;
		}
		
		System.out.println("Number of even number: " + evenCount);
		System.out.println("Number of odd number : " + oddCount);

	}

}
