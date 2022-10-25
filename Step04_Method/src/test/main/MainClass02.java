package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {
	public static void main(String[] args) {
		
		/*
		 * 	콘솔창에 "안녕하세요" 를 출력하려고 한다.
		 * 
		 *  해당 목표를 달성하려면 콘솔창에 출력을 할 수 있는 기능을 가진 객체가 필요하다.
		 *  
		 *  그 객체는 어디에 있나? System 클래스의 out 이라는 static 필드에 
		 *  해당객체의 참조값(키값) 이 들어있다.
		 *  
		 *  그 객체는 무슨 type 인가? -> PrintStream type 이다.
		 *  
		 *  그 객체는 누가 생성했나? java 에서 스스로 생성되어 준비되어있는 객체이다.
		 *  
		 *  System 클래스는 왜 import 안해도 사용 가능한가?
		 *  
		 *  System, String 등은...   java.lang 패키지에 있는 클래스이며 해당 패키지에 있는
		 *  모든 클래스는 기본 클래스처럼 import 없이 사용 가능하다.
		 *  - PrintStream type Object's method println() 의 도움 -
		 */

		System.out.println("안녕하세요");
		System.out.println(999);
		System.out.println(true);
		System.out.println('a');
		
		MyObject o1=new MyObject();
		o1.send();
		o1.send(1);
		o1.send("구라");
		o1.send(new Car());
		
	}
}
