package Questões;

import java.util.*;
public class _1323 {
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner (System.in);
		do {
			n=sc.nextInt();
			long x=(n*(n+1)*(2*n+1))/6;
			if(n!=0) {
				System.out.println(x);
			}
		}while(n!=0);
		sc.close();
	}
}
