package myStrings;

public class RemoveSpacesInString {

	public static void main(String[] args) {
		// input : "we l co m e"
		// output : "welcome"
		
		String input = "we l co m e";
		
		for(int i=0; i<=input.length()-1; i++) {
			
			if(input.charAt(i) != ' ') {
				
			System.out.print(input.charAt(i));
			}
		}
	}
}
