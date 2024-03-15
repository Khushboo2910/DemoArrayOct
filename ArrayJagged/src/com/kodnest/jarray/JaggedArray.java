package com.kodnest.jarray;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][][] d = new int[3][][];
		
		d[0] = new int[2][];
		d[0][0] = new int[4];
		d[0][1] = new int[3];
		
		d[1] = new int[2][];
		d[1][0] = new int[2];
		d[1][1] = new int[3];
		
		d[2] = new int[3][];
		d[2][0] = new int[4];
		d[2][1] = new int[2];
		d[2][2] = new int[2];
		
		for(int i=0 ; i<=d.length-1 ; i++)
		{
			for(int j=0 ;j<=d[i].length-1 ; j++)
			{
				for(int k=0 ; k<=d[i][j].length-1 ; k++)
				{
					d[i][j][k] = scan.nextInt();
				}
			}
		}
		for(int i=0 ; i<=d.length-1 ; i++)
		{
			for(int j=0 ;j<=d[i].length-1 ; j++)
			{
				for(int k=0 ; k<=d[i][j].length-1 ; k++)
				{
					System.out.print(d[i][j][k]+" ");
				}
			}
		}
	}
}
