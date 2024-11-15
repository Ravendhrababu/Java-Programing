package MyArrays;

public class SumOfArray {

	public static void main(String[] args) {
		int num[] = {23, 44, 66, 78, 2, 55, 62, 67, 22, 90};
		
		int sum=0;
		for(int i : num) {
			sum = sum+i;
		}
        System.out.println("Sum of elements in array is : "+ sum);

	}

}
