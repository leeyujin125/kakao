package net.hb.day0615;

import java.util.Calendar;

public class EmpjuminCalendar {
	public static void main(String[] args) {
		String jumin = "990624-2981647";
		System.out.println(jumin);
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);	//2023-1999=나이
		
		//문제1 나이 계산		if, switch 자유롭게 사용
		char y = jumin.charAt(0);
		String e = "19";
		String a = "20";
		
		String ye = e+y+jumin.charAt(1);
		String ya = a+y+jumin.charAt(1);
		if(y=='9') {
			System.out.println("현재 연도 기준으로 나이는 "+(year-(Integer.parseInt(ye)))+"세 입니다.");
		}else if(y=='0') {
			System.out.println("현재 연도 기준으로 나이는 "+(year-(Integer.parseInt(ya)))+"세 입니다.");
		}//if~else
		
		//강사님 
		char gender = jumin.charAt(7);
		int myyear = Integer.parseInt(jumin.substring(0, 2)); 
		
		int age=1;
		switch(gender) {
			case '1':	age=year-(1900+myyear); break;
			case '2':	age=year-(1900+myyear); break;
			case '3':	age=year-(2000+myyear); break;
			case '4':	age=year-(2000+myyear); break;
			default: break;
		}//switch
		System.out.println("당신의 나이는 "+age+"세 입니다.");
	}//main
}//class
