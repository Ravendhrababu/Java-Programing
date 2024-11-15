package myStrings;

import java.util.Arrays;

public class MutabilityAndImmutability {

	public static void main(String args[]) {
		
	//	Mutable - change is possible        ex: Arrays, StingBuffer and StringBuilder
	//	Immutable - change is not possible  ex: String
		
		String s = "Selenium";
		s.concat(" Java");
		System.out.println(s);
		
		s = s.concat(" Java");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Selenium");
	    sb.append(" Java");
		System.out.println(sb);
		
		StringBuilder sd = new StringBuilder("Selenium");
	    sd.append(" Java");
		System.out.println(sd);
		
		int i[] = {100, 20, 30, 50 ,20, 5};
		System.out.println("before sort :" + Arrays.toString(i));
		Arrays.sort(i);
		System.out.println("after sort :" + Arrays.toString(i));
	}
}
