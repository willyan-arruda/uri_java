package Questões;

import java.util.*;
public class _1419 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		n=sc.nextInt();
		while(n!=0) {
			int a[] = new int [n];
			int b[] = new int [n];
			for(int i=0; i<n; i++) {
				a[i]=sc.nextInt();
			}
			for(int i=0; i<n; i++) {
				b[i]=sc.nextInt();
			}
			int isFound1=9999;
			int isFound2=9999;
			boolean f1=false;
			boolean f2=false;
			int t1=0;
			int t2=0;
			for(int i=0; i<n;i++) {
				t1+=a[i];
				if(n-i+1>3) {
					if(a[i]==a[i+1]&&a[i]==a[i+2]&&!f1) {
						t1+=a[i+1];
						t1+=a[i+2];
						isFound1=i;
						i+=2;
						f1=true;
					}
				}
			}
			for(int i=0; i<n;i++) {
				t2+=b[i];
				if(n-i+1>3) {
					if(b[i]==b[i+1]&&b[i]==b[i+2]&&!f2) {
						t2+=b[i+1];
						t2+=b[i+2];
						isFound2=i;
						i+=2;
						f2=true;
					}
				}
			}
			if(f1&&f2) {
				if(isFound1<isFound2) {t1+=30;}
				if(isFound1>isFound2) {t2+=30;}
				if(t1>t2) {System.out.println("M");}
				else if(t2>t1) {System.out.println("L");}
				else {System.out.println("T");}
				
			}else {
				if(f1) {t1+=30;}
				if(f2) {t2+=30;}
				if(t1>t2) {System.out.println("M");}
				else if(t2>t1) {System.out.println("L");}
				else {System.out.println("T");}
			}
			n=sc.nextInt();
		}
		sc.close();
	}
}
