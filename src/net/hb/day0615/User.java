package net.hb.day0615;

public class User {
	private int pwd;
	private String email;
	private int count=0;
	
	public User() {  } //기본 생성
	public User(String mail) { 
		this.email=mail;
		boolean em = email.contains("@");
		
		if(em==false) {
			System.out.println("잘못된 이메일 형식입니다. ");
			return;
		}
	}//생성자
	public User(int pass) {
		this.pwd=pass;
		int length = (int)(Math.log10(pass)+1);

		
		if(length < 4) {
			System.out.println("비밀번호는 4자리 이상 입력해주세요.");
			return;
		}else if(length > 9) {
			System.out.println("비밀번호는 8자리를 넘어갈 수 없습니다.");
			return;
		}
	}
	public void check() {
		
	}//check
	public boolean connect(String port) {
		boolean ok=false;
		while(true) {
			if(port.equals("9900")) {ok=true;}
			else {ok=false; break;}
		}
		return ok;
	}//connect
}//User
