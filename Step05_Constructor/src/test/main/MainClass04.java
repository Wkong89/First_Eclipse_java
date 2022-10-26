package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  	0~9 사이의 랜덤한 정수를 얻어내 콘솔창에 출력하고싶다면..
		 */
		
		// Random 객체를 생성
		Random r1=new Random();
		// nextInt() 메소드를 호출, 정수하나를 리턴받고
		int r1Num=r1.nextInt(10);
		//콘솔창에 출력해보기
		System.out.println(r1Num);
		
		// 1~45 사이의 랜덤한 정수 하나를 얻어내 r2Num 이라는 변수에 담아보세요.
		int r2Num=r1.nextInt(45)+1;
		int r3num=r1.nextInt(1,46);
				
		// true or false 중에 랜덤한 boolean 값을 얻어내서 isRun 이라는 지역변수에 담아보세요.
		boolean isRun=r1.nextBoolean();
		System.out.println(isRun);
	}
}