package test.mypac;

public class SmartPhone extends HandPhone {
	//생성자
	public SmartPhone() {
		System.out.println("SmartPhone 생성자 호출됨");
	}
	
	//메소드
	public void doInternert() {
		System.out.println("인터넷을 해요");
	}
	
	@Override
	public void takePicture() {
		System.out.println("1000만 화소의 사진을 찍어요!");
	}
}
