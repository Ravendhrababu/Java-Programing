package MyArrays;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
//		Java Program to print the duplicate elements of an array

		int num[] = { 10, 20, 20, 30, 30, 50 };		
		System.out.println("Duplicate elements of array");
		
		for(int i=0; i<num.length; i++) {
			
			for(int j=i+1; j<num.length; j++) {
				
				if(num[i]==num[j]) {	
					
					System.out.println(num[i]);			
				}
			}	
		}

	}

}
