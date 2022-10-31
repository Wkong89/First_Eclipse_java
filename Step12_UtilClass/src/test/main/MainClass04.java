package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		// 1. Car type 을 저장 할 수 있는 ArrayList 객체를 생성하여
		//    참조값을 List 인터페이스 type 지역변수 cars 에 담아 보세요.
		
		List<Car> cars=new ArrayList<>();
				
		// 2. Car 객체(3개) 를 생성하여 List 객체에 저장해 보세요.
		cars.add(new Car("Grand Cherokee"));
		cars.add(new Car("Santafe"));
		cars.add(new Car("Seltos"));
				
		// 3. 반복문 for 문을 이용하여 List 객체에 저장된 모든 Car 객체의
		//    drive() 메소드를 순서대로 호출해 보세요.
		
		for(Car tmp:cars) {
			tmp.drive();
		}
		System.out.println("----Consumer 인터페이스 활용----");
		cars.forEach((item)->{
		item.drive();
		});

	    for(int i=0; i<cars.size(); i++) {
 			cars.get(i).drive();
			
		}
	    
	}
}
