package test.main;

import java.util.Scanner;

import test.mypac.Weapon;



public class MainClass05 {
	// 필드를 선언하면서 값 얻어내서 대입하는 코드
	int num=0;
	String name="Lee";
	Scanner scan=new Scanner(System.in);
	// 필드는 선언만 하면 기본값이 들어간다.
	int weight;		//0
	String msg;		//null
	Scanner scan2;	//null		
	boolean isRun;	//false
	// static 영역에 올리고 싶은 필드는 static 예약어를 이용해서 만든다.
	static String greet="안녕";
	// Anonymous Inner Class 를 이용해서 Weapon type 의 참조값 얻어내기
	static Weapon w1=new Weapon() {
		@Override
		public void attack() {
			System.out.println("뭐가뭔진 모르겠지만 공격!");
		}
	};
	
	
	public static void main(String[] args) {

		// 메소드 호출하면서 static 필드에 미리 준비된 값을 전달하기
		useWeapon(w1);
		// Anonymous Local Inner Class 를 이용해서 Weapon type 의 참조값을 얻어내기
		Weapon w2=new Weapon() {
			@Override
			public void attack() {
				System.out.println("여기도 뭐가뭔진 모르겠다만 공격!");
			}
		};

		// 메소드 호출하면서 지역변수에 미리 준비된 값을 전달하기
		useWeapon(w2);
		
		// 메소드 호출하면서 값을 즉석에서 만들어서 전달하기
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("여기도 뭐가뭔진 모르겠다만 공격!");
			}
		});
		
	}	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
    }
}
