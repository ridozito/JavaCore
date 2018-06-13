package tedu.java.core;

import java.util.HashSet;
import java.util.TreeSet;

public class Lesson13 {
	public static void main(String[] args) {
		// hashset
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(5);
		hs.add(2);
		hs.add(1);
		for(int i : hs) {
			System.out.println(i+" ");
		}
		// TreeSet
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Apple");
		ts.add("Orange");
		ts.add("Banana");
		for(String s : ts) {
			System.out.print(s+" ");
		}
		TreeSet<Integer> ts2 = new TreeSet<>();
		ts2.add(100);
		ts2.add(1000);
		ts2.add(-10);
		ts2.add(0);
		for(int i :ts2) {
			System.out.print(i+" ");
		}
	}
}
