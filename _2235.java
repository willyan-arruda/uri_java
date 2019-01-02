package Questões;

import java.util.*;
public class _2235 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c = 0;
		a=sc.nextInt();
		b=sc.nextInt();
		b=sc.nextInt();
		if(a-b==0) {System.out.println("S");}
		else if(a-c==0) {System.out.println("S");}
		else if(b-c==0) {System.out.println("S");}
		else if((a+b)-c==0) {System.out.println("S");}
		else if((b+c)-a==0) {System.out.println("S");}
		else if((a+c)-b==0) {System.out.println("S");}
		else {System.out.println("N");}
		sc.close();
	}
}
