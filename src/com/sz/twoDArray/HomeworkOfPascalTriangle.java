package com.sz.twoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkOfPascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		while (true) {
			String input = sc.nextLine();
			if ("STOP".equals(input)) {
				break;
			}
			try {
				int exponent = Integer.parseInt(input);
				int[][] pascal = new int [exponent+1][];
				pascal[0] = new int [1];
				pascal[0][0] = 1;
				for (int i=1; i<= exponent; ++i) {
					pascal[i] = new int [i+1];
					for (int j=0; j<pascal[i].length; ++j) {
						if (j == 0 || j == pascal[i].length - 1) {
							pascal[i][j]=1;
						}else {
							pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
							
						}
					}
				}
				
				int totalCharacter= exponent*2;
				for(int i =0; i<pascal[exponent].length; i++) {
					totalCharacter += Integer.toString(pascal[exponent][i]).length();
				}
				System.out.println(totalCharacter);
				for (int i = 0; i < pascal.length; ++i) {
					for (int j=0; j<pascal[i].length; j++) {
						if (j==0) {
							for (int s = totalCharacter/2; s>0; s-- ) {
								System.out.print(" ");
							}
						}
						System.out.format("%d", pascal[i][j]);
						System.out.print(" ");
						
						
						
					}
					System.out.println();
					totalCharacter-=2;
				}


			}catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Please try again\n");
			}
		}

	}

}
