package Questões;

import java.util.*;

public class _2591 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//Scanner st = new Scanner (System.in);
		int a=0;
		a=sc.nextInt();
		sc.nextLine();
		while(a!=0) {
			a--;
			String p;
			p=sc.nextLine();
			System.out.print("k");
			int count=0;
			int pos = 0;
			char[] pChar = p.toCharArray();
			for(int i=1;i<p.length();i++) {
				if(pChar[i]!='a') {
					pos=i;
					break;
				}else {
					count++;
					}
			}
			for(int i=pos+3;;i++) {
				if(pChar[i]!='a') {
					break;
				}
				for(int j=0;j<count;j++) {
					System.out.print("a");
				}
			}
			System.out.println("");
		}
	}
}
