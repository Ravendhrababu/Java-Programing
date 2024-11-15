package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		//Declaration
		//HashMap hm = new HashMap();
		//Map hm = new HashMap();
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>(); 
		// it should allow only integer type keys and string type values
		
		hm.put(101, "john");
		hm.put(102, "ravi");
		hm.put(103, "john");
		hm.put(104, "merry");
		hm.put(101, "ravi");
		System.out.println(hm); //{101=ravi, 102=ravi, 103=john, 104=merry}
		
		//Retrieving the value using key
		System.out.println(hm.get(104)); //merry
		
		// get all keys
		System.out.println(hm.keySet());//[101, 102, 103, 104]
		
		//get all the values
		System.out.println(hm.values());//[ravi, ravi, john, merry]
		
		//get all the pairs
		System.out.println(hm.entrySet());//[101=ravi, 102=ravi, 103=john, 104=merry]
		
		//get size of hashmap
		System.out.println(hm.size());//4
		
		//remove a pair
		hm.remove(101);
	    System.out.println(hm);//{102=ravi, 103=john, 104=merry}
	    
	    //reading data from hashmap
	    for(int key : hm.keySet()) {
	    	
	    	System.out.println(key + "  "+ hm.get(key));
	    }
		
	    //Clear all the elements in hashmap
	    hm.clear();
	    System.out.println(hm.isEmpty());//true
		

	}

}
