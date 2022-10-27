package test.auto;

public class AutoPilot extends Car{

	public AutoPilot(Engine engine) {
		super(engine);
	}
	
	public void drivAuto() {
		System.out.println("자율주행을 실시합니다.");
	}

}
