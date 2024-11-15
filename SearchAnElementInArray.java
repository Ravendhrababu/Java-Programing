package MyArrays;

import java.util.Scanner;

public class SearchAnElementInArray {

	public static void main(String[] args) {

		int a[] = {100, 50, 200, 30, 40, 60, 80};	
		
		int input = 60;
		boolean found=false;
		
		for(int i : a) {		
			if(i == input) {
				
				System.out.println("Element found..");
				found = true;
				break;
			}
		}
		if (!found)			//if (found == false)
			System.out.println("Element not found..");
		
		
/*		for(int i : a) {	
			if(i == input) {				
				count++;
				break;
			}
		}
		
		if(count == 1)
			System.out.println("Element is present in array");
		else
			System.out.println("Element is not present");     */
	}

}
