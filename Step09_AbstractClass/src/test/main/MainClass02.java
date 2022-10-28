package test.main;

import test.mypac.Gun;
import test.mypac.Spear;
import test.mypac.Weapon;

public class MainClass02 {
	// run 했을 때 실행의 흐름이 시작되는 특별한 main 메소드
	public static void main(String[] args) {
		// 동일 클래스 안에 있는 static 메소드 호출 가능
		//test("앙녕!");
		
		// 직접 클래스를 만들고 객체 생성을 해서 
		// 아래의 useWeapon() 메소드를 호출해보세요.
		Weapon s=new Spear();
		useWeapon(s);
		
		Weapon g1=new Gun();
		useWeapon(g1);
	}
	
	// static 영역에 없으므로  main 메소드에서 호출 불가능
	// test 메소드를 static으로 만들어주면 가능함
	//public static void test(String msg) {
		//System.out.println(msg);
	//}
	
	// Weapon type 을 인자로 전달받아 사용하는 static 메소드 
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
