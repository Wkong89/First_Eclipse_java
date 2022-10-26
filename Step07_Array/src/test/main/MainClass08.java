package test.main;

import test.mypac.Bike;

public class MainClass08 {
	public static void main(String[] args) {
		String[] str= {"김", "이", "박", "최", "윤"};
		for(String tmp:str) {
			System.out.println(tmp);
		}
		Bike[] bikes=new Bike[3];
		bikes[0]=new Bike();
		bikes[1]=new Bike();
		bikes[2]=new Bike();
		
		for(Bike tmp:bikes) {
			tmp.ride();
		}
		
	}
}
