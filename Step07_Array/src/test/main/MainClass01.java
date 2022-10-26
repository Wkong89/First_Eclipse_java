package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		// int type 5 개를 저장하고 있는 배열 객체를 생성하여 
		// 참조값을 nums 라는 지역변수에 담기
		int[] nums= {10, 20, 30, 40, 50};
		// double type 5개를 저장하고있는 배열
		double[] db= {1.1, 2.2, 3.3, 4.4, 5.5};
		// boolean type 5개를 저장하고있는 배열
		boolean[] bl= {true, false, false, true, false};
		// String type 5개를 저장하고있는 배열
		String[] str= {"김", "이", "박", "최", "윤"};
		
		// 배열 각각의 방 참조 하기
		int result1=nums[0];	//10
		double result2=db[1];	//2.2
		boolean result3=bl[3];	//false
		String result4=str[4];	//"최"
		
		// 배열 객체의 메소드와 필드 사용해보기
		int[] cloned= nums.clone();  //복제본 얻기
		int[] copied= nums;			 //참조값 복사하기
		int size=nums.length;		 
	}
}
