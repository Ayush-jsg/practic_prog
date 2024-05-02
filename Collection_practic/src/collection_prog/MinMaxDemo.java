package collection_prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//java program to minimum and maximum number

public class MinMaxDemo {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(3);
		l.add(5);
		l.add(18);
		l.add(4);
		l.add(6);

		System.out.println("All elements are : " + l);

		int min = Collections.min(l);
		System.out.println("Minimum value : " + min);
		int max = Collections.max(l);
		System.out.println("Maximum value : " + max);
	}

}
