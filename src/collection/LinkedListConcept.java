package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll= new LinkedList<String>();
		
		//add the elements into the linked list
		
		ll.add("test");
		ll.add("Selenium");
		ll.add("qtp");
		ll.add("Postman");
		ll.add("RFT");
		
		System.out.println("Content of this Linkedlist"+ll);

		//addFirst node
		
		ll.add(4, "Bla Bla");
		ll.addFirst("Ashutosh");
		
		//addLastnode
		ll.addLast("Automation");
		
		System.out.println("******************************");
		System.out.println(ll);
		
		//get
		System.out.println(ll.get(2));
		
		//set
		ll.set(3, "Ashu");
		
		//remove
		ll.removeFirst();
		ll.removeLast();
		
		//How to print the LinkedList elements
		//1. For loop
		System.out.println("**********For Loop********************");
		for(int i =0; i<ll.size();i++) 
		{
			System.out.println(ll.get(i));
			
		}
		
		//2. Advance for loop/for each loop
		System.out.println("**********For Each Loop********************");
		for(String str:ll) 
		{
			System.out.println(str);
		}
		
		//3. Iterator(One of the three cursors)
		System.out.println("**********Using Iterator********************");
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
			
		}
		
		//4. While loop
		
		System.out.println("**********Using While Loop********************");
		int num=0;
		while(ll.size()>num) 
		{
			System.out.println(ll.get(num));
			num++;
		}
	}

}
