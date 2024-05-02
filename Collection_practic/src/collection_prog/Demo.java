package collection_prog;

import java.util.ArrayList;

// java program to print an Arraylist of an user defined collection

public class Demo {

	String name;
	int rollno;

	public Demo(String s, int i) {

		name = s;
		rollno = i;

	}

	public String toString() {
		return "Name : " + name + " | Roll no : " + rollno;
	}

	public static void main(String[] args) {
		ArrayList<Demo> al = new ArrayList<Demo>();

		Demo d1 = new Demo("john", 101);
		Demo d2 = new Demo("paul", 102);
		Demo d3 = new Demo("jack", 103);
		Demo d4 = new Demo("Malan", 104);
		Demo d5 = new Demo("Devid", 105);

		al.add(d1);
		al.add(d2);
		al.add(d3);
		al.add(d4);
		al.add(d5);

		for (Demo d : al) {
			System.out.println(d);
		}

	}
}
