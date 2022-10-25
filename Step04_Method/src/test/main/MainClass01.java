package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * MyObjcet 객체를 하나 생성하여 그 객체가 갖고있는
		 * walk(), getNumber(), getGreeting() 메소드를 차례로 호출해 보세요.
		 * 단, 메소드가 어떤 data를 리턴하면 해당 데이터를 지역변수에 담으세요. 
		 */
		MyObject o1 = new MyObject();
		o1.walk();
		int num=o1.getNumber();
		String tex=o1.getGreeting();
		Car car=o1.getCar();
		
		// setNum(), setName(), useCar() 메소드도 호출해 보세요.
		// 메소드 호출하면서 인자로 전달 할 데이터를 즉석에서 만들어 전달하기
		o1.setNum(1);
		o1.setName("이름");
		o1.useCar(new Car());
		
		// 메소드 호출하면서 인자로 전달 할 값이 지역변수에 이미 존재하는 경우일때
		int a = 999;
		String b = "누구게";
		Car c1=new Car();
		
		// 값이 들어 있는 변수명으로도 전달할 수도 있다. (같은 타입일경우만 가능)
		o1.setNum(a);
		o1.setName(b);
		o1.useCar(c1);
		
		// doSomething() 메소드를 호출해 보세요.
		o1.doSomething(a, b, c1);
		o1.doSomething(2, "이름", new Car());
		
		
	}
}
