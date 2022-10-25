package main.test;

import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * MyObjcet 객체를 하나 생성하여 그 객체가 갖고있는
		 * walk(), getNumber(), getGreeting() 메소드를 차례로 호출해 보세요.
		 * 단, 메소드가 어떤 data를 리턴하면 해당 데이터를 지역변수에 담으세요. 
		 */
		MyObject o1 = new MyObject();
		o1.walk();
		int num=o1.getNumber();
		String tex=o1.getGreeting();
		
	}
}
