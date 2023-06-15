package net.hb.day0615;

import java.util.Scanner;

public class UserTest {

	public static void main(String[] args) {
		int a=0; String b="";
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("비밀번호를 입력해주세요. (4자리 ~ 8자리) >>> ");
		a=Integer.parseInt(sc.nextLine());
		
		System.out.println("이메일을 입력해주세요. >>> ");
		b=sc.nextLine();

		User er=new User();
		er.check(a,b);
		
		
		sc.close();
	}//main
}//UserTest
