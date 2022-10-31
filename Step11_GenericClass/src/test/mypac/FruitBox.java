package test.mypac;
/*
 * 
 * 		클래스 안에서 사용하는 특정 type 을 고정하지 않고
 * 		클래스를 사용하는 시점에 type을 정할도록 할 수있다.
 *		아래 선언한 T 에 들어가는 것(단어, 스펠링)은 임의로 정할 수 있다. 
 *		T 와같은 것을 포괄 클래스(Generic Class) 라고 한다.
 *		<> 안에 , , 로 3개까지 넣을 수 있다.
 */


public class FruitBox<T> {
	// 필드
	private T item;  // 클래스를 사용하는 시점에 전달된 type 을 
					 // 필드의 type으로 사용하기
	
	// 필드에 값을 넣는 메소드
	public void setItem(T item) {
		this.item=item;
	}
	
	// 필드에 저장된 값을리턴하는 메소드
	public T getItem() {
		return item;
	}
	
	
}
