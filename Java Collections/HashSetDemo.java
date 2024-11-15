package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
	
		//Declaration
		//HashSet set = new HashSet(); //It allows Heterogenious data
		//Set set = new HashSet();     //It allows Heterogenious data
		//HashSet<Integer> set = new HashSet<Integer>(); // it allows only interger data types-->Homogenious data
		
		HashSet myset = new HashSet();
		myset.add(100);
		myset.add(10.5);
		myset.add("Ravi");
		myset.add(true);
		myset.add('B');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//Printing set elements
		System.out.println(myset); //[null, B, 100, Ravi, 10.5, true]
		//Insertion order is not maintained
		//Duplicated elements and mutliple null are not considered
		
		//size of set
		System.out.println(myset.size());//6
		
		//removing specific elements
		myset.remove(true); //true elements will be removed
		System.out.println(myset);//[null, B, 100, Ravi, 10.5]
		
		//removing multiple elements is not possible
		//inserting of elements is not possible because there is no indexing
		//accessing specific element is not possible in set 
		// we can access the element by converting set into arraylist
		
		ArrayList al = new ArrayList(myset);
		System.out.println(al); //[null, B, 100, Ravi, 10.5]
		System.out.println(al.get(1)); //B
		
		//reading all the elements from set
		//Using normal for loop it is not possible because there is no get method in HashSet
		//Approach-1 using for each loop
		
	/*	for(Object value : myset) {
			System.out.println(value);
		}			*/
		
		//Approach-2 using for iterator()
		
		Iterator it = myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Clear elements
		myset.clear();
		System.out.println(myset.isEmpty());//true
		
		
		
		
	}

}
