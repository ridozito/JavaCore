package tedu.java.core;

public class Lesson4 {
	public static void main(String[] args) {
		// boolean
		boolean bo = true;
		System.out.println(bo);
		// byte
		byte b = 127;
		System.out.println(b);
		// short
		short s = 10;
		System.out.println(s);
		// char
		char c = 70;
		System.out.println(c);
		// int
		int i = 10000;
		System.out.println(i);
		// long
		long l = 100000;
		System.out.println(l);
		// float
		float f = 100.5f;
		System.out.println(f);
		// double
		double d = 100.5;
		System.out.println(d);
		// wrapper class
		int x = 10;
		Integer y = x; // autoboxing
		Integer p = new Integer(20);
		int q = p; // unboxing
		System.out.println(y + " " + q);
		// ep kieu tu kieu du lieu co kich thuoc nho sang kieu su lieu co kich
		// thuoc lon
		int m = 100;
		float n = m;
		// tu kieu du lieu co kich thuoc lon ve kieu du lieu co kich thuoc nho
		float a = 100.51F;
		int h = (int) a;
		System.out.println(h);
		

	}
}
