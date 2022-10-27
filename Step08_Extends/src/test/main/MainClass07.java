package test.main;


import test.auto.ElectricCar;
import test.auto.Engine;


public class MainClass07 {
	public static void main(String[] args) {
		
		ElectricCar c1=new ElectricCar(new Engine());
		
		//c1.engine; 은 참조 불가...!! 생성자가 private...(내부에서만 쓰겠다)
		c1.drive();
		c1.charge();
		
	}
}
