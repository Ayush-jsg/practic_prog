package collection_prog;
// Java Program to get the elements of linked list.

import java.util.LinkedList;

public class LLDemo {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("GEEKS");
		ll.add("FOR");
		ll.add("GEEKS");

		System.out.println("LinkedList Element : " + ll);
		
		for (int i=0; i < ll.size(); i++) {
			System.out.println("Element at index " + "is: " + ll.get(i));
			
		}

	}
}
