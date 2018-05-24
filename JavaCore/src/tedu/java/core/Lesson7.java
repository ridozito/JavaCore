package tedu.java.core;

import java.util.Scanner;

public class Lesson7 {
	public static void main(String[] args) {
		// while
		//int n = 10;
//		while(n<10) {
//			n++;
//		}
//		System.out.println(n);
		
		// do while
//		do {
//			n =n+2; // n +=2;
//		}while(n<10);
		//System.out.println(n);
		
		// for
//		for(int i =0; i<n;i++) {
//			System.out.println("Xin chao " +i);
//		}
		
		// break / continue
//		for(int i =0; i<n;i++) {
//			if(i==5) {
//				
//				continue;
//			}
//			System.out.println(i);
//		}
		Scanner sc = new Scanner(System.in);
//		System.out.println("Xin moi nhap n =");
//		int n = sc.nextInt();
//		int sum=0;
//		for(int i = 1;i<=n; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
		System.out.println("Nhap so thu 1 ");
		int a = sc.nextInt();
		System.out.println("Nhap so thu 2 ");
		int b= sc.nextInt();
		int temp;
		int bcnn = a*b;
		 // a = 15 , b = 21 
		// loop 1
		// temp = 15 ; a = 21 ; b= 15 ;
		// loop 2 
		// temp ; temp = 6 ; a = 15 ; b= 6;
		// loop 3 
		// temp =3 ; a  =6 ; b= 3;
		// loop 4
		// temp = 0; a= 3 ; b =0;
		while(b!=0) {
			temp = a % b; // 21 % 15 = 6
			a  = b; // 21 -> 15 
			b = temp ; // 15-> 6 
			
		}
		
		System.out.println("UCLN "+a);
		System.out.println("BCNN "+bcnn/a);
		
		
		
	}
}
