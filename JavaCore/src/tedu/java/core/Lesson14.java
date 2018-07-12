package tedu.java.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Lesson14 {
	private int x;

	public static void main(String[] args) {
		// hashmap
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		for (int key : hm.keySet()) {
			System.out.println(key + " " + hm.get(key) + " ");
		}

		// Iteonrator<Integer> iterator = hm.keySet().iterator();
		// while(iterator.hasNext()) {
		// System.out.println(iterator.next());
		// }
		// for(String value : hm.values()) {
		// System.out.println(value);
		// }
		// treemap
		// TreeMap<String, Integer> tm = new TreeMap<>();
		// tm.put("One", 1);
		// tm.put("Six", 6);
		// tm.put("Nine", 10);
		// for(String key : tm.keySet()) {
		// System.out.println(key+" "+tm.get(key));
		//
		// }
		// Tra cuu thong tin sinh vien : co the tra cuu tu ma sinh vien hoac ten sinh
		// vien
		// 1. Tra cuu ma sv
		// 2 . Tra cuu ten sv
		// hm.put(123,"Nguyen Van A -7");
		// hm.containsKey(key)
		// => tra ve kq
		// dung vong for de lay ra het values , moi value kiem tra xem co chua ten sinh
		// vien day khong
		// dung ham contains trong String YES ? => tra ve KQ : khong co KQ
		int s = sumExample(1, 2);

	}

	private static int sumExample(int i, int j) {
		// TODO Auto-generated method stub
		return 1;
	}

	
}
