package test.auto;

public class ElectricCar extends Car {

	// 부모객체가 생성되기 위해서 필요한 객체를 자식 생성자의 인자로 전달받아서
	public ElectricCar(Engine engine) {
		// 부모 생성자에 전달을 해 주어야 한다.
		super(engine);
		
	}
	
	public void charge() {
		System.out.println("충전을 시작합니다!");
	}

}
