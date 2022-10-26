package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		//	1. 문자열을 저장할 수 있는 방 5개짜리 배열객체를 생성해서 
		//     참조값을 msgs 라는 지역변수에 담기
		String[] msgs=new String[5];
		//	2. 키보드로 입력 가능한 Scanner 객체를 생성해서 
		//     참조값을 scan 이라는 지역변수에 담기
		Scanner scan=new Scanner(System.in);
		//	3. 위에서 생성한 배열의 방 갯수 만큼 반복문을 돌면서 문자열을 입력받아
		//	   배열의 순서대로 저장하기
		for(int i=0; i<msgs.length; i++){
			System.out.print("문자열 입력 : ");
			// 문자열 한줄 입력 받기
			String line=scan.nextLine();
			// 배열의 i 번째 방에 저장하기
			msgs[i]=line;
			//두줄 합치면    msgs[i]=scan.nextLine(); 가능

		}
		//	4. 반복문 돌면서 배열에 저장되었던 모든 문자열을 순서대로 콘솔창에 출력하기.
		for(int i=0; i<msgs.length; i++){
			String tmp=msgs[i];
			System.out.println(tmp);
			// 두줄 합치면    System.out.println(msgs[i]); 가능 
			
		}
	}
}
