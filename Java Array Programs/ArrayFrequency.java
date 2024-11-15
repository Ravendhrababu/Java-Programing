package MyArrays;

import java.util.Arrays;

public class ArrayFrequency {

	public static void main(String[] args) {
// Java Program to find the frequency of each element in the array
// In this program, we have an array of elements to count the occurrence of its each element.
		
		 int num[] = {1, 2, 8, 3, 2, 2, 2, 5, 1};
	        int len = num.length;
	        int[] frequency = new int[len];
	        boolean[] counted = new boolean[len];

	        Arrays.fill(frequency, 0);
	        Arrays.fill(counted, false);

	        for (int i = 0; i < len; i++) {
	            if (!counted[i]) {
	                int count = 1; // Start counting the current element
	                for (int j = i + 1; j < len; j++) {
	                    if (num[i] == num[j]) {
	                        count++;
	                        counted[j] = true; // Mark this element as counted
	                    }
	                }
	                frequency[i] = count;
	                System.out.println("Element: " + num[i] + ", Frequency: " + count);
	            }
	        }
	    }

}
