package tedu.java.core;

import java.util.Scanner;

public class Lesson5 {
	public static void main(String[] args) {
		// // +
//		 int a = 5;
//		 int b = 7;
		// int tong = a+b;
		// System.out.println(tong);
		// // -
		// int hieu = b- a;
		// System.out.println(hieu);
		// // *
		// int tich = a*b;
		// System.out.println(tich);
		// // /
		// float chia = (float) b/a;
		// System.out.println(chia);
		// // %
		// int chiaLayDu = a % b;
		// System.out.println(chiaLayDu);

		// ==
//		boolean check = a == b;
//		System.out.println(check);
//		// !=
//		check = a !=b;
//		System.out.println(check);
//		// <
//		check = a < b;
//		System.out.println(check);
//		// >
//		check = a > b;
//		System.out.println(check);
//		// <=
//		check = a <=b ;
//		System.out.println(check);
//		// >=
//		check = a >= b;
//		System.out.println(check);
		// &&
//		boolean check = (b> a && b !=a); // true && true => true 
//		System.out.println(check);
//		// || 
//		check = (a> b || b ==a); // false || false => false
//		System.out.println(check);
//		// !
//		check = !(b>a); // ! true = false;
//		System.out.println(check);
//		// -
//		int c = -10;
//		System.out.println(c<0);
		// ++
		//int d = 1;
//		int x = d++ +c;
//		System.out.println(x);
//		System.out.println(d);
		// --
//		int y = --d +c ;
//		System.out.println(y);
//		System.out.println(d);
		Scanner  sc = new Scanner(System.in);
		System.out.println("Xin moi nhap 2 so");
		System.out.println("So thu 1 :");
		int a = sc.nextInt();
		System.out.println("So thu 2 :");
		int b = sc.nextInt();
		System.out.println("So ban vua nhap la "+ a +" "+b);
		int tong = a + b;
		System.out.println("Tong 2 so la :"+ tong);
		boolean kiemTra = a > b;
		System.out.println("So thu 1 lon hon so thu 2 la "+ kiemTra);
		
		
		
	}
}
