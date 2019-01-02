package Questões;

import java.util.*;

public class _2850 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str;
		String esquerda = "esquerda";
		String direita = "direita";
		String nenhuma = "nenhuma";
		
		while(sc.hasNext()) {
			str=sc.nextLine();
			if(str.equals(esquerda)) {System.out.println("ingles");}
			else if(str.equals(direita)) {System.out.println("frances");}
			else if(str.equals(nenhuma)) {System.out.println("portugues");}
			else {System.out.println("caiu");}
		}
	}
}
