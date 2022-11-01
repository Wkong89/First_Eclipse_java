package test.main;

/*
 *	while 문을 활용하여 원하는 횟수만큼 반복하기
 *
 * 	- 반복 횟수가 명확히 저애져 있는경우 (for 문으로 반복문 활용하는것이 좋다)
 * 	- 반복 횟수가 명확하지 않아 다 돌려보고 난 후에 알수있는 경우가 있다.
 * 		-> 이때는 while 문으로 반복문을 도는것이 좋다.  
 */

public class MainClass08 {
	public static void main(String[] args) {
		int count=0;
		while(true) {
			System.out.println("안녕!!");
			count++;
			if(count==5) {
				break;
			}
		}
		
		System.out.println("-------");
		count = 0; // 카운트 다시 0으로 만들고
		while(count<5) {		// count가 5보다 작은 동안 반복문 사용
			System.out.println("안녕!!!");
			count++;
		}
	}
}
