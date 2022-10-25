package test.main;
/*
 *  [Java 기본 데이터 type]
 *  
 *  4. String type
 *  
 *  - 문자열을 다룰 때 사용하는 데이터 type  
 */
public class MainClass05 {
	public static void main(String[] args) {
		// "김구라" 라는 String type 객체를 heap 영역(사물함)에
		// 만들고 그 참조값을 변수에 담기
		String name="김구라";
		// name 안에 있는 참조값을 tmp 변수에 복사
		String tmp=name;
		// "원숭이" 라는 String type 객체를 heap 영역에 만들고
		// 그 참조값을 변수에 담기
		name="원숭이";
		// name 변수를 비우기 
		// null 은 참조 데이터 type이 담길 수 있는 빈공간을 의미 
		name=null;
	}
}