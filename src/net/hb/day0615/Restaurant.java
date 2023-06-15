package net.hb.day0615;

import java.text.DecimalFormat;

public class Restaurant {
	public static void main(String[] args) {
		Menu pizza = new Menu("피자", 7500);
		Menu steak = new Menu("티본", 9500);
		Menu juice = new Menu("주스", 2500);
		Menu[] menuArray = { pizza, steak, juice };
		Order cal = new Order(1200, menuArray);
		
		DecimalFormat df = new DecimalFormat("##,###");
		System.out.println();
		System.out.println("📌주문합계📌 "+df.format(cal.totalPrice())+"원 입니다.");
	}//main
	
}//Restaurant

class Order{
	int tot=0;
	int orderNum;
	Menu[] menus;
	
	public Order() {  }
	public Order(String kind) {  }
	public Order(int num, Menu[] marr) {
		this.orderNum = num;
		this.menus = marr;
	}
	
	public int totalPrice() {
		for(int i=0; i<menus.length; i++) {
			tot += menus[i].price;
		}
		return tot;
	}//totalPrice
}//Order

class Menu{
	String name;		//접근지정자 생략하면 public
	int price;			//접근지정자 생략하면 public
	
	public Menu() {  }
	public Menu(String ss, int c) { 
		this.name=ss; 
		this.price=c;
		System.out.println(this.name+"  "+this.price+"원 주문성공🌟");
	}
}//Menu

class MyExit{
	
}//MyExit