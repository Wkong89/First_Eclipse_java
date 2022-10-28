package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	
	static Weapon w1=new Weapon() {
		public void attack() {
			System.out.println("이정도라면.. 공격!!");
		}
		
	};
	
	public static void main(String[] args) {
		
		Weapon w2=new Weapon() {
			public void attack() {
				System.out.println("이정도여도... 공격!!!");
				
			}
		};
		useWeapon(w1);
		useWeapon(w2);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
