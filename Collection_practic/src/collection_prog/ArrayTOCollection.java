package collection_prog;
//convert an Array into collection in java.

import java.util.Arrays;
import java.util.List;

public class ArrayTOCollection {
	public static void main(String[] args) {

		String PlayerArray[] = { "virat", "rohit", "sachin", "bumrah" };
		System.out.println("Array input :" + Arrays.toString(PlayerArray));

		List playerslist = Arrays.asList(PlayerArray);
		System.out.println("converted elements : " + playerslist);

	}

}
