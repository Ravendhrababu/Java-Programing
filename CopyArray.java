package MyArrays;

public class CopyArray {

	public static void main(String[] args) {
//      Java Program to copy all elements of one array into another array
		
		int arr1[] = {1,4,6,7,3,6,7,35,7,3,2,5};
		int arr2[] = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			
			arr2[i] = arr1[i];
			
		}
		System.out.println("Elements of array1");
		for(int k : arr1) {
			
			System.out.print(k +" ");
		}
		System.out.println();
		System.out.println("Elements of array2");
		for(int k : arr2) {
			
			System.out.print(k +" ");
		}

	}

}
