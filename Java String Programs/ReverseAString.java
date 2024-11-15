package myStrings;

public class ReverseAString {

	public static void main(String[] args) {
		
		//approach 1 using length() and chatAt() methods
/*		String s = "india";
		String reverse = "";
		
		for(int i=s.length()-1; i>=0; i--) {		
			reverse = reverse + s.charAt(i);	
		}
		System.out.println(reverse);		*/
		
		//approach 2 without using length() and chatAt() methods
/*		String s = "india";
		String rev = "";	
		char arr[] = s.toCharArray();
		for(int i=arr.length-1; i>=0; i--) {
			rev = rev+arr[i];
		}
		System.out.println(rev);		*/
		
		//approach 3 using in built method in StringBuffer and StringBuilder
		
		StringBuffer sb = new StringBuffer("india");
		System.out.println(sb.reverse());
		
		StringBuilder sbb = new StringBuilder("selenium");
		System.out.println(sbb.reverse());
		
	}

}
