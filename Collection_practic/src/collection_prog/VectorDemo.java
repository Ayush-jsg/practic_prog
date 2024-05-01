package collection_prog;

// Java program to find maximum element in a vector using predefined method.
// output : The maximum value present in vector is : 98;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		v.add(7);
		v.add(50);
		v.add(0);
		v.add(67);
		v.add(98);

		int i = Collections.max(v);
		System.out.println("The maximum value of : " + i);
	}

}
