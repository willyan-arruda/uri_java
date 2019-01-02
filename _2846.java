package Questões;

import java.util.*;

public class _2846 { 
	public static int fibonot(int n) {
		int a=0;
		int b=1;
		int cont=0;
		int ans=4;
		while(cont<n) {
			for (int i = a+1; i < b; i++) {
				ans=i;
				if (++cont==n) {
					break;
				}
			}
			int temp=b;
			b=a;
			a=temp;
			b=a+b;
		}
		return ans;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner (System.in);
		while(sc.hasNext()) {
			n=sc.nextInt();
			System.out.println(fibonot(n));
		}
	}
}
