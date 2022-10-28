package test.mypac;

public class Mycon implements Remocon {

	@Override
	public void up() {
		System.out.println("음량을 높여요");
		
	}

	@Override
	public void down() {
		System.out.println("음량을 낮춰요");
		
	}

}
