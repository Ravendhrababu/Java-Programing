package myStrings;

public class OccuranceOfCharactersInString {

	public static void main(String[] args) {
		// input : abcabcaabbcc
		// output : a=4 b=4 c=4

		String input = "aaccdvv";

		for (int i = 0; i < input.length(); i++) {

			int count = 0;
			char currentChar = input.charAt(i);
			boolean alreadyCounted = false;

			for (int k = 0; k < i; k++) {

				if (input.charAt(k) == currentChar) {

					alreadyCounted = true;
					break;
				}
			}
			if (alreadyCounted == false) {
				for (int j = 0; j < input.length(); j++) {

					if (input.charAt(i) == input.charAt(j)) {
						count++;
					}
				}
				System.out.println(input.charAt(i) + " is repeated " + count + " times");
			}
		}
	}
}
