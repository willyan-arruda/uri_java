package Questões;

import java.util.*;
public class _1397 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		n=sc.nextInt();
		while(n!=0){
			int sum1=0, sum2=0;
			int a, b;
			while((n--)>0) {
				a=sc.nextInt();
				b=sc.nextInt();
				if(a>b) {
					sum1+=1;
				}
				if(b>a) {
					sum2+=1;
				}
			}
			System.out.print(sum1+" ");
			System.out.println(sum2);
			n=sc.nextInt();
		}
		sc.close();
	}
}
