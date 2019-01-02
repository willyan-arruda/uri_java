package Questões;

import java.util.*;
public class _2829 {
	public static void main(String[] args) {
		ArrayList<String> palavras = new ArrayList<String>();
		
		Scanner sc = new Scanner (System.in);
		int n;
		n=sc.nextInt();
		sc.nextLine();
		while(n>0 && sc.hasNext()) {
			n--;
			String palavraTemp = sc.nextLine();
			palavras.add(palavraTemp);
		}
		sc.close();
		Collections.sort(palavras);
		for(Object resolucao: palavras) {
			System.out.println(resolucao);
		}
		
	}
}
