package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		
		//국어점수
		int kor=95; //float kor=95.0;
		//영어점수
		int eng=100; 
		
		//국어점수와 영어점수의 평균을 구해서 변수에 담고 
		//그 결과를 콘솔창에 출력
		double avg=(kor+eng)/2d;
		System.out.println(avg);
		//정수끼리 연산하면 결과는 정수만 나온다.
		//정수와 실수가 연산하면 실수가 나온다.
		
	}
}
