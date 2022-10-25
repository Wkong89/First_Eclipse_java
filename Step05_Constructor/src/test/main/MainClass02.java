package test.main;

import test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {
		// 기본 생성자를 호출하면서 객체 생성하기 -> 호출하면 값이 비어있는상태로 보임
		Member m1=new Member();
		// 값을 3개 전달하는 생성자를 호출하면서 객체 생성하기 -> 호출하면 기입한 값이 보임
		Member m2=new Member(1, "김구라", "노량진");
		m1.showInfo();
		m2.showInfo();
		// 기본 생성자를 호출하면서 객체 생성하기 => 따로 지정은 가능함
		Member m3=new Member();
		m3.num=2;
		m3.name="해골";
		m3.addr="행신동";
		m3.showInfo();
	}
}
