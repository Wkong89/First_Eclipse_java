package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		//  static 메소드는 클래스명에 . 을 찍어서 바로 호출 가능
		MyUtil.send();
		// static 필드는 클래스명에 . 을 찍어서 바로 참조 가능
		MyUtil.version="1.0";
	}
}
