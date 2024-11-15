package MyArrays;

public class OddPositionArray {

	public static void main(String[] args) {
		
		// In this program, we need to print the element which is present on odd position.
	    // array = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		// index =   0  1  2  3  4  5  ..........
	//  position =   1  2  3  4  5  6
	           
			int num[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

			for(int i=0; i<num.length; i=i+2) {
				System.out.println(num[i]);
			}

		}

}
