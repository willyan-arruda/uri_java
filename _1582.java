package Questões;

import java.util.*;
public class _1582 {
	public static void main(String[] args) {
		int a[] = new int[3];
		Scanner sc = new Scanner (System.in);
		while(sc.hasNext()) {
			a[0]=sc.nextInt();
			a[1]=sc.nextInt();
			a[2]=sc.nextInt();
			boolean x = false;
			Arrays.sort(a);
			int check=a[0];
			if(Math.pow(a[2], 2)==Math.pow(a[1], 2)+Math.pow(a[0], 2)) {
				while(check>1) {
					if((a[0]%check==0)&&(a[1]%check==0)&&(a[2]%check==0)) {
						x=true;
					}
					check--;
				}
				if(x==false) {
					System.out.println("tripla pitagorica primitiva");
				}else 
					System.out.println("tripla pitagorica");
				}else {
					System.out.println("tripla");
				}
			}
	
	}
}