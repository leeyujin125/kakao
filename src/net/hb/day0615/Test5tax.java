package net.hb.day0615;

import java.text.DecimalFormat;

public class Test5tax {
	public static void main(String[] args) {
		String name="Lee";
		int basepay=3500000;
		int tax=(int)(basepay*0.333);

		int pay=basepay-tax;
		System.out.println("*** "+name+"의 월급 명세표 ***");
		
		DecimalFormat df = new DecimalFormat("##,###");
		System.out.println("기본: "+df.format(basepay)+"원");
		System.out.println("세금: "+df.format(tax)+"원");
		System.out.println("급여: "+df.format(pay)+"원");
		System.out.println("-------------------------------------------------");
		
		System.out.println("기본: "+String.format("%,d", basepay)+"원");
		System.out.println("세금: "+String.format("%,d",tax)+"원");
		System.out.println("급여: "+String.format("%,d",pay)+"원");
		System.out.println("-------------------------------------------------");
		
		System.out.printf("기본: %,d원\n", basepay);
		System.out.printf("세금: %,d원\n" , tax);
		System.out.printf("급여: %,d원\n", pay);
	}//main
}//class
