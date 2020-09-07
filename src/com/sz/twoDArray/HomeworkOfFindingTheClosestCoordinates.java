package com.sz.twoDArray;

import java.util.Scanner;

public class HomeworkOfFindingTheClosestCoordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final double[][] COORDINATES = 
			{
					//0     1
					{93.37, 81.98},
					{48.49, 83.96},
					{50.02, 51.60},
					{15.03, 93.38},
					{54.10, 62.18},
					{28.02, 62.17},
					{75.49, 55.25},
					{60.98, 87.20},
					{60.75, 2.12},
					{46.32, 45.25},
					{5.93, 46.27},
					{11.52, 47.84},
					{39.08, 76.91},
					{56.50, 23.38},
					{30.53, 74.43},
					{76.11, 79.97},
					{77.69, 81.76},
					{86.38, 4.50},
					{17.07, 72.25},
					{96.07, 9.27}
			};
		double[][] closest1 = new double[1][2];
		closest1[0][0] = COORDINATES[0][0];
		closest1[0][1] = COORDINATES[0][1];

		double[][] closest2 = new double[1][2];
		closest2[0][0] = COORDINATES[1][0];
		closest2[0][1] = COORDINATES[1][1];

		double x = (closest2[0][0] - closest1[0][0]) * (closest2[0][0] - closest1[0][0]);
		double y = (closest2[0][1] - closest1[0][1]) * (closest2[0][1] - closest1[0][1]);
		
	

		for (int i=0; i<COORDINATES.length-1; i++) {
			for (int j=i; j<COORDINATES.length-1; j++) {
				double xValue = (COORDINATES[j+1][0]-COORDINATES[i][0])*(COORDINATES[j+1][0]-COORDINATES[i][0]);
				double yValue = (COORDINATES[j+1][1]-COORDINATES[i][1])*(COORDINATES[j+1][1]-COORDINATES[i][1]);
				if (Math.sqrt(xValue+yValue)< Math.sqrt(x+y) ) {
					x = xValue;
					y = yValue;
					closest1[0][0] = COORDINATES[i][0];
					closest1[0][1] = COORDINATES[i][1];
					closest2[0][0] = COORDINATES[j+1][0];
					closest2[0][1] = COORDINATES[j+1][1];
								
				}

			}

		}
		System.out.format("The closest coordinates of the two points are (%.2f, %.2f) and (%.2f, %.2f).",
								closest1[0][0],closest1[0][1],closest2[0][0],closest2[0][1]);









	}


}