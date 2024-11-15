package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		//Declaration
	/*	ArrayList arr = new ArrayList(); //it will store all types of data
		ArrayList<String> arr = new ArrayList<String>(); // it will only store string type of data
		List arr = new ArrayList();		*/
		
		//adding data into arraylist
		ArrayList arr = new ArrayList();
		arr.add(100);
		arr.add(100);
		arr.add("Ravi");
		arr.add('A');
		arr.add(110.5);
		arr.add(true);
		arr.add(null);
		arr.add(null);
		
		//Size of arraylist
		System.out.println(arr.size());  //8
		
		//Printing array elements
		System.out.println(arr);  // [100, 100, Ravi, A, 110.5, true, null, null]
		
		//remove specific element from list using index number
		arr.remove(2);
		System.out.println(arr);  //[100, 100, A, 110.5, true, null, null]
		
		//insert an element into the list
		arr.add(2, "Ravi"); //2 is index number
		System.out.println(arr);  //[100, 100, Ravi, A, 110.5, true, null, null]

		//Replaces the element at the specified position in this list with the specified element.
		arr.set(1,200);
		System.out.println(arr);  //[100, 200, Ravi, A, 110.5, true, null, null]
		
		//accessing specific element from the list 
		
		System.out.println(arr.get(1)); //200
		
		//Reading all the elements from list
		//approach-1 using normal for loop
		for(int i=0; i<arr.size(); i++) {	
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
		
		//approach-2 using for-each loop
		for(Object value : arr) {
			System.out.print(value+" ");
		}
		System.out.println();
		
		//approach-3 using iterator
		Iterator it = arr.iterator();
		while(it.hasNext()) {	
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		//verify arrarlist is empty or not
		System.out.println(arr.isEmpty()); //false
		
		//remove multiple elements from arraylist
		ArrayList arr1 = new ArrayList();
		arr1.add(100);
		arr1.add(null);

		arr.removeAll(arr1);
		System.out.println(arr); //[200, Ravi, A, 110.5, true]
		
		//clear all the elements from list
		arr.clear();
		System.out.println("Arraylist is empty? "+arr.isEmpty()); //Arraylist is empty? true
	}

}
