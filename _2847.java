package Questões;

import java.util.*;

public class _2847 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str;
		
		while(sc.hasNext()) {
			str = sc.nextLine();
			int I=0, l=0, o=0, v=0, e=0, y=0, u=0, pun=0;
			char[] strChar = str.toCharArray(); 
			for(int i=0;i<str.length();i++) {
				if(strChar[i]=='I') {I++;}
				if(strChar[i]=='l') {l++;}
				if(strChar[i]=='o') {o++;}
				if(strChar[i]=='v') {v++;}
				if(strChar[i]=='e') {e++;}
				if(strChar[i]=='u') {u++;}
				if(strChar[i]=='y') {y++;}
				if(strChar[i]=='!') {pun++;}
			}
			int cont=0;
			while(I>0 && l>0 && o>=2 && v>0 && e>0 && y>0 && pun>0 && u>0) {
				cont++;
				I--;l--;o-=2;v--;u--;e--;y--;pun--;
			}
			System.out.println(cont);
		}
	}
}
