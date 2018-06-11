package tedu.java.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson12 {
	public static void main(String[] args) {
		// List<Integer> numberList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		// System.out.println("Xin moi nhap so phan tu");
		// int n = sc.nextInt();
		// for (int i = 0; i < n; i++) {
		// numberList.add(sc.nextInt());
		// }
		//
		// // for(int i =0;i<numberList.size();i++) {
		// // System.out.print(numberList.get(i) + " " );
		// // }
		// List<Integer> newList = new ArrayList<>();
		// for (int i = 0; i < numberList.size(); i++) {
		// if (!newList.contains(numberList.get(i))) {
		// newList.add(numberList.get(i));
		// }
		// }
		//// for(int i =0;i<numberList.size();i++) {
		//// System.out.print(numberList.get(i) + " " );
		//// }
		// for(int elemment : newList) {
		// System.out.print(elemment +" ");
		// }
		//
		List<String> nameSvList = new ArrayList<>();
		System.out.println("Xin moi nhap lua chon");
		while (true) {
			System.out.println("1. Them sinh vien \n 2.Xoa sinh vien \n 3.Sua ten sinh vien  \n 4.In ra danh sach sinh vien \n 5.Quit");
			int selected = sc.nextInt();
			sc.nextLine();
			if(selected==5) {
				break;
			}
			switch (selected) {
			case 1:
				System.out.println("Nhap ten sinh vien");
				String name = sc.nextLine();
				while(!name.isEmpty()) {
				System.out.println("Nhap ten sinh vien");
			
				nameSvList.add(name);
				name = sc.nextLine();
				}
				break;
			case 2:
				// remove(index)
				
				break;
			case 3:
				// set(index, Element e)
				
				break;
			case 4:
				System.out.println("--------Danh sach sinh vien----");
				for(String nameSv :nameSvList) {
					System.out.println(nameSv);
				}
				break;

			}
			System.out.println("---END---");
		}
	}

}
