package com.test;

public class Pattern {
	public static void main(String[] args) {
		int n = 3;
		int m = 0;
		int k = 0;
		for(int i=0;i<n;i++) {
			m=(i*2)+1;
			k=n-i-1;
			while(k>0) {
				System.out.print(" ");
				k--;
			}
			for(int j=1;j<=m;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
