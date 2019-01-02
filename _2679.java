package Questões;

import java.util.*;

public class _2679 {
	
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner (System.in);
		while(sc.hasNext()) {
			n=sc.nextInt();
			if(!Primo(n)) {
				System.out.print("Nada\n");
			}else {
				if(SuperPrimo(n)) {
					System.out.print("Super\n");
				}else {
					System.out.print("Primo\n");
				}
			}
		}
		sc.close();
	}
	public static boolean Primo(int n){
		if(n==0||n==1) {return false;}
		if(n==2) {return  true;}
		if(n%2==0) {return false;}
		for(int i=3;i<=Math.sqrt(n);i+=2) {
			if(n%i==0) {return false;}
		}
		return true;
	}
	public static boolean SuperPrimo(int n) {
		while(n>=10) {
			int s=n%10;
			n/=10;
			if(!Primo(s)) {return false;}
		}
		if(n==2||n==3||n==7||n==5) {return true;}
		else {return false;}
	}
}

