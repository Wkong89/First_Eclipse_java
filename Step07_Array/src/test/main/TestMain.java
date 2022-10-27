package test.main;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
	
		int point=1000;
		Scanner scan=new Scanner(System.in);
		while(point != 0) {
			//만약 point가 0 라면
			if(point == 0) {
				break; //가장 인접한 반복문 loop 탈출
			}

			//Enter 키를 누를때까지 블로킹 하는 메소드
			System.out.println("Enter 키를 누르세요");
			scan.nextLine();
			
			//point 를 10 감소시키면서
			point -= 10;
			//원하는 작업 수행
			System.out.println("수행중....");
			
		}
	}
}
