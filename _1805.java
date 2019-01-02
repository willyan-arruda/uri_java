package Questões;

import java.util.*;
public class _1805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long soma = 0;
		long a, b;
		a=sc.nextInt();
		b=sc.nextInt();
		soma=(a+b)*(b-a+1)/2;
		System.out.println(soma);
		sc.close();
	}
}
