package test.main;

import java.util.Random;

import test.mypac.Bike;

public class QuizMain1n2 {
	public static void main(String[] args) {
		// 1. run 했을 때 cherry, apple, banana, melon, 7 이렇게 5개의 문자열중
		//	  1개가 랜덤으로 출력되게 하기
		String[] items= {"cherry", "apple", "banana", "melon", "7"};
		
		Random r1=new Random();
		
		/*
		int ranNum=r1.nextInt(5);
		String str=items[ranNum];
		System.out.println(str);
		 */
		
		//2. run 했을때 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해보기
		for(int i=0; i<3; i++ ) {
			int ranNum2=r1.nextInt(5); 
			String str2=items[ranNum2];
			/*
			 * int ranNum3=r1.nextInt(5);
			   String str3=items[ranNum3];
			   int ranNum4=r1.nextInt(5); 
			   String str4=items[ranNum4]; 
 			 */
			
			System.out.print(items[ranNum2]);
			if(i != 2) {
				System.out.print(" | ");	
			}
			
		}
	}
		
	
}
	
	

