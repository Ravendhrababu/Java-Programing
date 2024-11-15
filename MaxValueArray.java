package MyArrays;

public class MaxValueArray {

	public static void main(String[] args) {
//		Java Program to print the biggest element in an array
		int num[] = {1,4,6,7,3,6,7,35,7,3,2,5};	
		int max = num[0];
		
		for(int i=0; i<num.length; i++) {

			if(max<num[i]){
				
				max=num[i];
			}
		}
		System.out.println("maximum value of array is : "+ max);

	}

}
