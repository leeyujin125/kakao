package net.hb.day0615;

public class Emp {
	public static void main(String[] args) {
		String jumin = "970624-2981647";
		
		//Quiz 1. 8번째 숫자가 1/3이면 남자.		2/4는 여자.   당신은 여자/남자 입니다.		charAt()
		//문제  2. 생일		당신의 생일은 06월 24일 입니다.		substring()
		//문제  3. ******-1981647 	(문의 1588-9987)
		
	char c = jumin.charAt(7);
	String s = jumin.substring(2, 4);
	String s2 = jumin.substring(4, 6);
	
	System.out.println(c+" "+s+" "+s2);
	System.out.println();
	
	if( jumin.charAt(7)=='1' || jumin.charAt(7)=='3' ) {
		System.out.println("당신의 성별은 남자입니다.");
	}else if( jumin.charAt(7)=='2' || jumin.charAt(7)=='4' ) {
		System.out.println("당신의 성별은 여성입니다.");
	}else {
		System.out.println("잘못된 정보입니다.");
	}
	
	System.out.println("당신의 생일은 "+s+"월 "+s2+"일 입니다.");
	
	String s3 = jumin.replace("970624", "******");
	System.out.println(s3+"\t(replace 사용)");
	
	String star="";
	for(int i=0; i<6; i++) {
		star += "*";
	}
	System.out.println(star + (jumin.substring(6)) );
	}//main
}//class
