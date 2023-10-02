package collectionpackage;

import java.util.ArrayList;

public class One {

	public static void main(String[] args) 
	{ArrayList<String> ob = new ArrayList<String>();
	ob.add("Sony");      // method to add elements to the arraylist
	ob.add("vishnu");
	ob.add("arun");
    System.out.println(ob);
	
	ob.remove(0);            // method to remove an item from the array list
	System.out.println(ob);
	
int a = 	ob.size();   // method to print the size of array list
System.out.println(a);
	}

}
