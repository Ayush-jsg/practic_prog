package collection_prog;

// java program to change collection to an Array

import java.util.ArrayList;
import java.util.List;

public class CollectionToArray {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();

		l.add("geeks");
		l.add("for");
		l.add("geeks");
		l.add("is");
		l.add("the");
		l.add("best");

		String[] str = l.toArray(new String[0]);

		for (int i = 0; i < str.length; i++) {
			String data = str[i];
			System.out.println(data);
		}
	}

}
