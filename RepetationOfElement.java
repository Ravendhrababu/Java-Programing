package MyArrays;

public class RepetationOfElement {

	public static void main(String[] args) {


		int a[] = {10, 20, 30, 40, 30, 20, 60, 70, 80, 20, 10, 10, 10, 10};
		
		int input = 10;
		int count=0;
		
		for(int i : a) {
			
			if(i == input) {
				count++;
			}
		}
		
		System.out.println("Number of repetations : "+ count);

	}

}
