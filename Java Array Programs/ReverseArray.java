package MyArrays;

public class ReverseArray {

	public static void main(String[] args) {

		int num[] = { 10, 20, 30, 40, 50, 60 };

		System.out.println("Given array is : ");

		for (int i : num) {

			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Revers array is : ");

		for (int i = num.length - 1; i >= 0; i--) {

			System.out.print(num[i] + " ");

		}
	}

}
