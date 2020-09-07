package com.sz.twoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class EighthClassOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		final int ROW_SIZE = 5;
		final int COLUMN_SIZE = 6;
		int[][] arr = new int[ROW_SIZE][COLUMN_SIZE];
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() *100);
				
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
				
			
		}
	}

}
