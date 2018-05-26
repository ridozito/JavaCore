package tedu.java.core;

import java.util.Scanner;

public class Lesson8 {
	public static void main(String[] args) {
//		String str = " Lap trinh Tedu ";
//		// length 
//		System.out.println("Do dai cua chuoi la "+str.length());
//		//concat
//		String str2 = "Trung tam ";
//		System.out.println(str2.concat(str));
//		// equals 
//		String str3 = new String ("Lap trinh Tedu");
//		System.out.println(str.equals(str3));
//		// charAt
//		System.out.println("ChartAt example :"+str.charAt(10));
//		// indexOf
//		System.out.println("Index of example "+str.indexOf("Tedu"));
//		//contains
//		String str4 = "Tedu";
//		System.out.println(str.contains("TeduTedu"));
//		// replace
//		System.out.println(str.replace('T', 't'));
//		// trim
//		System.out.println(str.trim());
//		//substring
//		System.out.println(str.substring(1, 4));
//		// toLowerCase
//		System.out.println(str.toLowerCase());
//		// toUpperCase
//		System.out.println(str.toUpperCase());
		// ABCBA   0-> n/2 
		System.out.println("Xin moi nhap chuoi palindrome ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean flag = true;
		for(int i =0; i< str.length()/2 ; i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length()-i-1);
			if(c1 != c2) {
				System.out.println("No");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("YES");
		}
		
		
		
	}
}
