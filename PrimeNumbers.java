package numbers;

public class PrimeNumbers {

	public static void main(String[] args) {
		
	/*	Prime numbers are the natural numbers that can be divided by their self 
	    or by 1 without any remainder.
		For example: 2, 3, 5, 7, 11, 13, 17 etc. */

	//	prime numbers between 2 to 100
		
		for (int i = 2; i <= 100; i++) {
		    int count = 0;

		    for (int j = 2; j <= i; j++) {
		        if (i % j == 0) {
		            count++;
		        }
		        if (count > 1) {
		            break; // Exit the loop early if more than one divisor is found
		        }
		    }

		    if (count == 1) { // If only one divisor (i itself) is found, it's a prime number
		        System.out.print(i + ", ");
		    }
		}   
		
		
	//	verify the given number is prime or not 
		
/*		    int number = 3;
	        int count = 0;

	        for (int i = 2; i <= number / 2; i++) {
	            if (number % i == 0) {
	                count++;
	                break; // Exit the loop early if a divisor is found
	            }
	        }

	        // Output the result
	        if (count == 0 && number > 1) { // If no divisors were found and number is greater than 1
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
*/	        
	        
	        
	}
}
