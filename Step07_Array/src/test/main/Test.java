package test.main;

public class Test {
	public static void main(String[] args) {
		String name="이주니의 원포인트 레슨";
		// name 안에 있는 값을(참조값) tmp 에 복사해서 넣기
		String tmp=name;
		// tmp 에 원래 String 값을 덮어쓰기
		tmp="예솔이의 원포인트 레슨";
		// 이렇게 했다고 해서 name  이 될 수는 없다
		
		System.out.println(name);
		System.out.println(tmp);
	}
}
