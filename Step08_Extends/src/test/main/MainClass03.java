package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		// phone 클래스를 상속받은 HandPhone 클래스로 객체를 생성해서
		// 그 참조값을 p1 이라는 지역변수에 담기
		HandPhone p1=new HandPhone();   //  ->객체는 new 할때만 생성된다!!!!
		
		// p1 안에 있는 참조값을 p2 라는 Phone type 지역 변수에 대입하기
		Phone p2=p1;
		
		// p1 안에 있는 참조값을 p3 이라는 Object type 지역 변수에 대입하기
		Object p3=p1;
	
		// 자식 객체의 참조값은 부모 type 의 변수나 필드에 자연스럽게 담긴다.
	}
}
