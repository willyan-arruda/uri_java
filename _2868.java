package Questões;

import java.util.*;
public class _2868 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int c;
		c=sc.nextInt();
		int a, b, r;
		char op1, op2;
		while(c>0 && sc.hasNext()) {
			c--;
			a=sc.nextInt();
			op1=sc.next().charAt(0);
			b=sc.nextInt();
			op2=sc.next().charAt(0);
			r=sc.nextInt();
			fausto(a, op1, b, r);
			}

		
	}
	public static void fausto(int a, char op1, int b, int r) {
		switch (op1) {
		case '+':
			if((a+b)!=r) {
				int temp=((a+b)-r);
				if(temp<0) {
					temp=(temp*-1);
				}
				System.out.print("E");
				for(int i=0; i<temp; i++) {
					System.out.print("r");
				}
				System.out.println("ou!");
			}
			break;
		case '-':
			if((a-b)!=r) {
				int temp=((a-b)-r);
				if(temp<0) {
					temp=(temp*-1);
				}
				System.out.print("E");
				for(int i=0; i<temp; i++) {
					System.out.print("r");
				}
				System.out.println("ou!");
			}
			break;
		case 'x':
			if((a*b)!=r) {
				int temp=((a*b)-r);
				if(temp<0) {
					temp=(temp*-1);
				}
				System.out.print("E");
				for(int i=0; i<temp; i++) {
					System.out.print("r");
				}
				System.out.println("ou!");
			}
			break;
		}
	}
}
