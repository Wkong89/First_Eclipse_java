package test.main;

import java.util.Random;

public class QuizMain3 {
	public static void main(String[] args) {
		// 1. run 했을 때 cherry, apple, banana, melon, 7 이렇게 5개의 문자열중
		//	  1개가 랜덤으로 출력되게 하기
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
		// nums 배열에 저장된 3개의 숫자가 모두 같은지를 boolean type 으로 얻어내기
		boolean isEqual = nums[0] == nums[1] && nums[1] == nums[2];
		if(isEqual) {
			System.out.println(" 당첨되셨습니다!");
		}else {
			System.out.println(" 아쉽지만 다음기회에...");
		}
	}
		
	
}
	
	

