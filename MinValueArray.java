package MyArrays;

public class MinValueArray {

	public static void main(String[] args) {

//		Java Program to print the smallest element in an array
		int num[] = {1,4,6,7,3,6,7,35,7,3,2,5};	
		int min = num[0];
		
		for(int i=0; i<num.length; i++) {

			if(min>num[i]){
				
				min=num[i];
			}
		}
		System.out.println("smallest value of array is : "+min);
	}
}
