package tedu.java.core;

import java.util.Scanner;

public class Lesson6 {
	public static void main(String[] args) {
		// int x = 2;
		// if(x > 5) {
		// x = x+1;
		// // x++;
		// }
		// System.out.println(x);
		// if(x >3) {
		// System.out.println("X lon hon 3");
		// }else if( x > 4) {
		// System.out.println("X lon hon 4");
		// }else if (x>5) {
		// System.out.println("X lon hon 5");
		// }else {
		// System.out.println("X khong thoa man");
		// }
		// switch (x) {
		// case 3:
		// System.out.println("A");
		// break;
		// case 4:
		// System.out.println("B");
		// break;
		// case 5:
		// System.out.println("C");
		// break;
		// default:
		// System.out.println("Z");
		//
		// }
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi lua chon");
		System.out.println("1.Bat dau chuong trinh");
		System.out.println("2.Exit");
		int n = sc.nextInt();
		switch (n) {
		case 1:
				System.out.println("Xin moi nhap ");
				int x = sc.nextInt();
				if(x%2 ==0) {
					System.out.println(x+ " la so chan");
				}else {
					System.out.println(x + " la so le");
				}
			break;
		case 2:
			System.out.println("Ban co thuc su muon thoat hay khong ?");
			System.out.println("1. Co");
			System.out.println("2. khong");
			int i = sc.nextInt();
			switch(i) {
			case 1 : 
				System.exit(0);
				break;
			case 2 : 
				System.out.println("Xin moi nhap ");
				int m = sc.nextInt();
				if(m%2 ==0) {
					System.out.println(m+ " la so chan");
				}else {
					System.out.println(m + " la so le");
				}
				break;
			}
			break;
		default:
			System.out.println("So ban nhap khong co trong chuong trinh");
		}
	}
}
