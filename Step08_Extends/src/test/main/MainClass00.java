package test.main;

import test.auto.AutoPilot;
import test.auto.Car;
import test.auto.Engine;


public class MainClass00 extends Car{
	public MainClass00(Engine engine) {
		super(engine);
	}

	public static void main(String[] args) {
		
		AutoPilot c2=new AutoPilot(new Engine());
		
		c2.drive();
		c2.drivAuto();
	}
}
