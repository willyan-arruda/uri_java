package Questões;

import java.util.*;
public class _1467 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a, b, c;
		while(sc.hasNext()) {
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			
			if(a==b&&a==c) {System.out.println("*");}
			else 
				if(a==b) {System.out.println("C");}
				else if(a==c) {System.out.println("B");}
				else if(b==c) {System.out.println("A");}
		}
		sc.close();
	}
}
