package myStrings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		

		//length() - returns length of the string
/*		String s = new String("Mangalagiri");
		System.out.println(s.length()); 		*/
		
		//concat() - Joining two strings		
		String s1 = "Mangalagiri";
		String s2 = " city";
		String s3 = " is a capital";
/*		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2+s3));
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2)+s3);
		System.out.println(s1+s2+s3);		*/
		
		//trim() - used to remove the extra spaces before and after the string	
/*		s1 = "  Mangalagiri  ";
		System.out.println("before trim length : "+ s1.length());
		System.out.println("after trim length : "+ s1.trim().length());
		s1 = "   Mangalagiri";
		System.out.println("before trim length : "+ s1.length());
		System.out.println("after trim length : "+ s1.trim().length());		*/
		
		//charAt() - returns a specific chat from the String bases on the index
		//index starts from 0
/*		s1 = "Mangalagiri";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(4));
		System.out.println(s1.charAt(s1.length()-1));    */
		
		//contains() - used to verify the mentioned string is present in the main string
		// returns true or false
/*		s1 = "india is a best country to live";
		s2 = "best";
		
		System.out.println(s1.contains(s2));
		System.out.println(s1.contains("best"));
		System.out.println(s1.contains("try"));
		System.out.println(s1.contains("dia"));
		System.out.println(s1.contains("bes"));
		
		System.out.println(s1.contains("Best"));
		System.out.println(s1.contains("India"));		*/
		
		//equals() and equalsIgnoreCase() - used to compare the two strings
		// returns true or false
/*		s1 = "welcome";
		s2 = "welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("Welcome"));
		System.out.println(s1.equalsIgnoreCase("Welcome"));		*/
		
		//replace() - used to replace the single/multiple (sequence) of char from the main string using the index
/*		s1 = "selenium java selenium python selenium c3 selenium playwright";
		System.out.println(s1.replace('s', 'x'));
		System.out.println(s1.replace("selenium", "x"));		*/
		
		//subSrting() - extract sub string from the main string 
		// strating index start from 0
		// ending index start from 1
/*		s1 = "Mangalagiri";
		System.out.println(s1.substring(0,1));
		System.out.println(s1.substring(1,4));
		System.out.println(s1.substring(2,6));
		
		System.out.println(s1.substring(2));			*/
		
		//split() - it will split the given string into multiple parts by using the delimeter
		// *  %  &  () - we can use this as a delimeter
		
/*		s1 = "india is my country";
		String []a = s1.split(" ");
		System.out.println(Arrays.toString(a)); //[india, is, my, country]
		
		s1 = "abc123@gmail.com";
		String []b = s1.split("@");
		System.out.println(Arrays.toString(b)); //[abc123, gmail.com]
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		s1 = "abc,123@xyz"; //output : abc 123 xyz
	
		//case-1
		String arr[] = s1.split(",");
		System.out.println(Arrays.toString(arr)); //[abc , 123@xyz]
		String arr1[] = arr[1].split("@");
		System.out.println(arr[0]);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		//case-2
		String ss = s1.replace('@', ',');
		String arr2[] = ss.split(",");
		System.out.println(Arrays.toString(arr2));				*/
		
		//toLowerCase() and toUpperCase()
/*		s1 = "Mangalagiri";
		System.out.println(s1.toUpperCase());
		s2 = "MANGALAGIRI";
		System.out.println(s1.toLowerCase());		*/
		
		
		
		
		
	}

}

