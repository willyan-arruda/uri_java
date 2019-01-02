package Questões;

import java.util.*;
public class HappyNewYear {
	public static void main(String[] args) throws InterruptedException {
		Calendar cal = GregorianCalendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int newYear = 2019;
		if(year==newYear) {
			System.out.println("HAPPY NEW YEAR ");
			System.exit(0);
			
		}else {
			System.out.println("Ta quase");
			main(args);
		}
	}
}