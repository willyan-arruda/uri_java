package Questões;
import java.util.*;

public class _2867 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int c;
		int n, m;
		c=sc.nextInt();
		
		while(c>0 && sc.hasNext()) {
			c--;
			n=sc.nextInt();
			m=sc.nextInt();
			double lg=Math.log10(n);
			lg*=m;
			System.out.println((int)(Math.floor(lg)+1));
		}
	}
}
