package net.hb.day0615;

import java.util.Random;

public class Test2Random {
	public static void main(String[] args) {
		Random r = new Random();
		int value = r.nextInt(7)+1;
		System.out.println(value);
		System.out.println(r.nextInt(7)+1);
		
		System.out.println("테스트2랜덤");
		double d=Math.random()*7;
		int com=(int)d+1;
		System.out.println(com);
	}//main
}//class
