package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String> list = new ArrayList<>();
		System.out.println("Size of Array list at Creation: " +list.size());

		//Adding some elements
		list.add("Tareq");
		list.add("Siddique");
		list.add("Shams");
		list.add("Riad");
		list.add("Rifat");
		list.add("Tofael");
		list.add("Ahmed");
		list.add("Hasan");

		//rechecking the array list.
		System.out.println("Size of Array list is: " + list.size());

		//displaying all the elements of array list
		System.out.println("List of all the elements: " +list);

		//removing element and also by index number
		list.remove("Hasan");
		list.remove(0);
		System.out.println("List after Removing" +list);

		//checking if the list contain a searching element like "Riad"
		System.out.println(list.contains("Riad"));
	}

}
