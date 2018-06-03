package tedu.java.core;

import java.util.Scanner;

public class Lesson10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so dong va cot cho ma tran");
		int n = sc.nextInt();
		
		int[][] matrix1 = new int[n][n];
		int [][] matrix2 = new int [n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Nhap ma tran 1 tai dong " + i + " va cot " + j);
				matrix1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Nhap ma tran 2 tai dong " + i + " va cot " + j);
				matrix2[i][j] = sc.nextInt();
			}
		}
		int [][] matrix = new int[n][n];
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				matrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}

	}
}
