package myStrings;

public class StringComparision {

	public static void main(String[] args) {
		
		String s1 = "welcome";
		String s2 = "welcome";
		System.out.println(s1==s2);        //true
		System.out.println(s1.equals(s2)); //true
		
		String s3 = new String("welcome");
		System.out.println(s1==s3);        //false
		System.out.println(s1.equals(s3)); //true
		
		String s4 = new String("welcome");
		String s5 = new String("welcome");
		System.out.println(s4==s5);        //false
		System.out.println(s4.equals(s5)); //true
		
		String s6 = new String("Apple");
		String s7 = new String("apple");
		System.out.println(s6==s7);        //false
		System.out.println(s6.equals(s7)); //false
		System.out.println(s6.equalsIgnoreCase(s7)); //true
		
		
		
		
		
		
	}

}
