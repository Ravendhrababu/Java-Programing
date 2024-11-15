package MyArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {

	public static void main(String[] args) {
	
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println("Enter a value for "+i+" positon");	
		    a[i] = sc.nextInt();
		}
		
		System.out.println("Given array : " + Arrays.toString(a));
	}

}
