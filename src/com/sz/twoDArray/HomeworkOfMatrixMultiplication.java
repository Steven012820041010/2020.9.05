package com.sz.twoDArray;

import java.util.Scanner;

public class HomeworkOfMatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][] arrA = {
				{1,0,-2},
				{0,3,-1}};

		int [][] arrB = {
				{0,3},
				{-2,-1},
				{0,4}};
		
		int [][] arrC = new int[2][2];

		for (int i=0; i<arrC.length; i++) {
			for (int j=0; j<arrC[i].length; j++) {
				arrC[i][j]= arrA[i][0]*arrB[0][j] + arrA[i][1]*arrB[1][j] + arrA[i][2]*arrB[2][j];
			}
		}
		for (int i=0; i<arrC.length; i++) {
			for (int j=0; j<arrC[i].length; j++) {
				System.out.format("%2d", arrC[i][j]);
				if(j!=arrC[i].length-1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
		
		
		
		

	}

}
