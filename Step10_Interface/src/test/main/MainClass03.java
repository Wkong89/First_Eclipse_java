package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	// anonymous inner class 를 이용해서 interface type 의 참조값 얻기
	// static 메소드 안에서 필요로 하기에 static 필드로 만들어준다.
	static Remocon r1= new Remocon() {
		@Override
		public void up() {
			System.out.println("온도를 올려요");
		}
		
		@Override
		public void down() {
			System.out.println("온도를 내려요!!! 제발!");
		}
	};
	
	public static void main(String[] args) {
		useRemocon(r1);
		// anonymous local inner class 를 이용해서 interface type의 참조값 얻기
		
		Remocon r2= new Remocon() {
			
			@Override
			public void up() {
				System.out.println("엄청 올려요");
			}
			
			@Override
			public void down() {
				System.out.println("엄청 내려요!!!");
			}
		};
		
		useRemocon(r2);
		
		
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("막 올리고");
			}
			
			@Override
			public void down() {
				System.out.println("막 내려요!!!");
			}
		});;
	}
	
	public static final void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}