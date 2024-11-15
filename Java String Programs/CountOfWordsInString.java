package myStrings;

public class CountOfWordsInString {

	public static void main(String[] args) {
		// input : "welcome to java programming"
		// output : 4 words
		
		String input = "welcome to java programming from dec";
		
		String arr[] = input.split(" ");
		
		System.out.println(arr.length + " words");
	}
}
