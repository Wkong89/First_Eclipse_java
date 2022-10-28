package test.auto;
/*
 * 		- 접근 지정자 접근범위
 * 
 * 		public : 전체 공개 (어디에서나 접근 가능)
 * 		protected : 동일한 package 혹은 상속관계일때 자식쪽에서 접근 가능
 * 		default : 동일한 package 안에서만 접근 가능
 * 		private : 비공개 (동일한 클래스 혹은 동일한 객체 안에서만 접근 가능)
 * 						-> 나빼고 못봐!  ex) 나 = 동일한 객체내부, 동일클래스 에서만!
 * 
 * 		- 접근 지정자를 붙이는 위치
 * 
 * 		1. 클래스를 선언 할 때
 * 		2. 생성자
 * 		3. 필드
 * 		4. 메소드
 * 
 * 		클래스는 default 와 public 두가지의 접근 지정자만 지정 가능하다
 * 		import 가능여부를 따지면 두가지일수밖에 없다.
 * 		아무나 다 접근 가능하게 = public
 * 		아무나 접근 못하게 = default
 * 
 * 		접근 지정자를 생략한 것이 default 접근 지정자다
 * 		
 */


public class Car {
	//필드
	protected Engine engine;
	
	//Engine 객체를 인자로 전달 받는 생성자
	public Car(Engine engine) {
		//생성자로 전달 받은 Engine 객체의 참조값을 필드에 저장하기
		this.engine=engine;
	}
	//메소드
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine 객체가 없어서 달릴수 없어요.");
			return; //메소드 끝!
		}
		System.out.println("달려요!");
	}
	
}
