package tedu.java.core;

import java.util.Scanner;

public class Lesson9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi nhap kich thuoc mang ");
		int n = sc.nextInt();
		System.out.println("Xin moi nhap cac phan tu cho mang");
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Xin moi nhap phan tu thu " + i);
			num[i] = sc.nextInt();
		}

		// 5 3 1 6 2
		// 3 5 1 6 2
		// 3 1 5 6 2
		// 3 1 5 2 6
		// 1 3 5 2 6
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (num[j] < num[j + 1]) {
					int temp = num[j]; // temp =5 ; num[0]=5;
					num[j] = num[j + 1];// num[0]= 3;
					num[j + 1] = temp;// num[1] = 5;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}
}
//nhap vao 1 mang tu ban phim , nhap vao 1 so kiem tra xem so day co trong mang da nhap hay khong 
		// Neu co in ra vi tri . Neu khong => in ra No
