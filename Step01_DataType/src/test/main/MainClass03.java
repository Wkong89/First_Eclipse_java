package test.main;
/*
 *  [Java 기본 데이터 type]
 *  
 *  2. 논리형 (boolean type)
 *  -참과 거짓을 나타내는 데이터 type  
 *  -true, false 두가지 값중 하나로 출력
 *  -true, false 를 직접 쓰거나 비교연산 혹은 
 *   논리 연산의 결과로 얻어낼 수 있다.
 */
public class MainClass03 {
	public static void main(String[] args) {
		//논리형 변수 선언과 동시에 값 대입하기
		boolean isRun=true;
		
		if(isRun) {
			System.out.println("달려!");
		}
		
		//비교 연산의 결과로 얻어진 boolean 값 담기
		boolean isGreater=10>1;
		//논리 연산의 결과로 얻어진 boolean 값 담기
		boolean isResult=true||false;
		
		//한번 선언한 변수는 다시 선언 할 수 없다.
		//boolean result = false;
		isResult=false; //변수에 다른 값을 대입 할 수 있다.(동일한 type인 경우)
		//다른 type 값은 변수에 담을 수 없다.
		//result=10;
		
		// JAVA 는 Type 에 민감하다!!!!!!!!!!!!!!!!!
	}
}
