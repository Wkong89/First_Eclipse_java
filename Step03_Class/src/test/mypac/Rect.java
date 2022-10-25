package test.mypac;

public class Rect {
	// 필드 2개
	public int w;
	public int h;
	// 메소드
	public void showInfo() {
		// 필드에 있는 정보 콘솔창에 출력하기
		int area = this.w * this.h;
		System.out.println("사각형의 넓이:" + w*h);
	}
}
