package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> que = new LinkedList<>();

		//adding new elements
		que.add("Donald");
		que.add("Hasan");
		que.add("Shams");
		que.add("Rifat");
		que.add("Riad");
		que.add("Ahmed");
		que.add("Tofael");
		que.add("Tareq");

		//for each loop
		System.out.println("Queue in for each loop: ");
		for (String element : que){
			System.out.println(element);
		}

		//while and Iterator
		System.out.println("Queue using Iterator: ");
		Iterator<String> iterator = que.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}


		//removing an elements from the queue
		String name = que.remove();
		System.out.println("Removed from Queue: " + name );
		System.out.println("Queue after remove element: " + que);

		//using poll method
		name = que.poll();
		System.out.println("Polled from Queue: " + name);
		System.out.println("Queue after polling: " + que);

		//retreiving element using peek
		System.out.println("the element at head of the queue is: " + que.peek());

	}

}
