package test.mypac;

public class Member {
	// 번호를 저장할 필드
	public int num;
	// 이름을 저장할 필드
	public String name;
	// 주소를 저장할 필드
	public String addr;
	
	// 메소드
	public void showInfo() {
		// 필드에 있는 정보 콘솔창에 출력하기
		System.out.println("번호:" + this.num + ", 이름:" +this.name + ", 주소:"+this.addr);
	}
	
}
