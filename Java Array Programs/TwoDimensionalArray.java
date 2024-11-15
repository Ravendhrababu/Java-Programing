package MyArrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		
	/*	int a[][] = new int[3][2];	//int [][]a = new int[3][2]; //int []a[] = new int[3][2]
		a[0][0] = 100;
		a[0][1] = 200;
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 600;	*/

		int a[][] = { {100,200}, {300,400}, {500,600} };
		
		System.out.println("Number of rows : "+a.length);
		System.out.println("Number of columns : "+a[0].length);
		
		for (int[] row : a) {           // Iterate over each row (which is an array)
		    for (int element : row) {   // Iterate over each element in the row
		        System.out.print(element + " ");
		    }
		    System.out.println();
		}
		
	/*	for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}  */

	}

}
