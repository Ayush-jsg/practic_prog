package collection_prog;

import java.util.ArrayList;
import java.util.List;

//java program to remove() method

public class RemoveDemo {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);

		System.out.println(l);

		l.remove(3);
		l.remove(1);
		System.out.println(l
				);
	}

}
