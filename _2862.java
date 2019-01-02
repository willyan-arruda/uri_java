package Questões;

import java.util.*;

public class _2862 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int c;
		int power;
		c=sc.nextInt();
		while(c>0 && sc.hasNext()) {
			c--;
			power=sc.nextInt();
			if(power>8000) {System.out.println("Mais de 8000!");}
			else {System.out.println("Inseto!");
			}
		}
	}
}
