package MyArrays;

import java.util.Arrays;

public class DescendingArray {

	public static void main(String[] args) { 
    
		int num[] = {23, 44, 66, 78, 2, 55, 62, 67, 22, 1};
        
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    // Swap the elements
                    int temp = num[i]; 
                    num[i] = num[j];    
                    num[j] = temp;    
                }
            }
        }
        
        System.out.println("Descending Array: " + Arrays.toString(num));

	}

}
