package test.main;

import test.mypac.Rect;

public class MainClass06 {
	public static void main(String[] args) {
		// 폭과 넓이가 각 10, 20 인 사각형 객체
		Rect r1 = new Rect();
		r1.w=10;
		r1.h=20;
		r1.showInfo();
	
		// 폭과 넓이가 각 5, 10인 사각형 객체
		Rect r2 = new Rect();
		r2.w=5;
		r2.h=10;
		r2.showInfo();
	}
}
