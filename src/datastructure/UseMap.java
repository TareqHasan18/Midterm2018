package datastructure;

import javax.swing.*;
import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<String, ArrayList<Object>> pnt = new HashMap<>();
		String grp1 = "GitHub Group2"; //first key
		ArrayList<Object> git1 = new ArrayList<>();

		git1.add("Tareq");
		git1.add("Shams");
		git1.add("Riad");
		git1.add("Rifat");
		git1.add("Tofael");

		String grp2 = "Git Hub EastRepo"; //second key;
		ArrayList<Object> git2 = new ArrayList<>();
		git2.add("Hasan");
		git2.add("Nasir");
		git2.add("Siddique");
		git2.add("Ahmed");
		git2.add("Fahim");

		//pnt.put("one", git1);
		//pnt.put("two", git2);

		/*for(Map.Entry<String, ArrayList<Object>> en : pnt.entrySet()){
			for (Object obj : en.getValue()){
				System.out.println(obj);
			}
		}*/
		pnt.put(grp1,git1);
		pnt.put(grp2,git2);
		Set<Map.Entry<String, ArrayList<Object>>> entries = pnt.entrySet();
		for (Map.Entry entry : entries){
			System.out.println(entry.getKey() + " consists " + entry.getValue());
		}
	}

}
