package collection_prog;
// Java program to Demonstrate Binary search on vector.

// output => Element is found at index : 2;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo2 {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(50);
		v.add(20);
		v.add(40);
		v.add(25);

		Collections.sort(v);
		System.out.println("sorted vector : " + v);

		int i = Collections.binarySearch(v, 25);
		System.out.println("Element is found at index : " + i);

	}

}
