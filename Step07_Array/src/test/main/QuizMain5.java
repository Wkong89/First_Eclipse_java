package test.main;

import java.util.Random;

public class QuizMain5 {
	public static void main(String[] args) {
		/* 
		 * 		1. 3개가 모두 같으면 10점
		 * 		2. 2개만 같으면 5점
		 */
		
		String[] items= {"cherry", "apple", "banana", "melon", "7"};
		
		Random r1=new Random();
		
		int[] nums=new int[3];
	
		for(int i=0; i<3; i++ ) {
			// 0~4 사이의 랜덤한 숫자를 하나 얻어내서
			int ranNum2=r1.nextInt(5); 
			// 배열의 인덱스로 활용해서 문자열 출력하기
			System.out.print(items[ranNum2]);
			if(i != 2) {
				System.out.print(" | ");	
			}
			//배열에 얻어낸 랜덤한 숫자를 저장하기
			nums[i]=ranNum2;
		}
		// 개행 추가
		System.out.println();
		// 3개가 모두 같은지 여부
		boolean isAllEqual = nums[0] == nums[1] && nums[1] == nums[2];
		// 2개만 같은지 여부
		boolean isTwoEqual = nums[0]==nums[1] || nums[1]==nums[2] || nums[0]==nums[2];
		/*
		 *   점수는 10, 5, 0
		 */
		if(isAllEqual) {
			System.out.println("10점 입니다!");
		}else if(isTwoEqual) {
			System.out.println("5점 입니다.");
		}else {
			System.out.println("아쉽지만 다음기회에");
		}
	}
		
	
}
	
	

