package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain2 {
	public static void main(String[] args) {
		// sample 데이터
		Map<String, String> dic= new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		dic.put("computer", "컴퓨터");
		
		/*
		 * 		검색할 단어를 입력하세요:house
		 * 		house 의 뜻은 집 입니다.
		 * 
		 * 		검색할 단어를 입력하세요:gura
		 * 		gura 는 목록에 없습니다.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("검색할 단어를 입력하세요(종료=q) : ");
			String s1=scan.nextLine();
			// 입력받은 단어를 Map 의 key 값으로 활용해서 value 값을 읽어와본다.
			// 해당 key 값으로 저장된 value 가 없을수도 있다.
			if(s1.equals("q")) {
				break;  // 가장 인접한 반복문 한 블럭을 빠져나옴
			}
			// 해당 key 값이 존재하는지 여부를 알아내는법
			boolean isExist=dic.containsKey(s1);
			
			String mean=dic.get(s1);
			if(isExist) { //만약 존재한다면... 
						  //(!isExist) = (isExist==false)라면 만약 존재하지 않다면)
				System.out.println(s1+" 의 뜻은 "+ mean+" 입니다.");
			}else { // 반면 찾는 단어가 없으면...
				System.out.println(mean+ " 는 목록에 없습니다.");
			}
			
		}
		
	}
}


/*
 *	기본 data type을 == 연산자로 비교하는 경우
 *	참조 data type을 == 연산자로 비교하는 경우
 *	
 *	int num1=10;
 *	int num2=20;
 *	boolean result1 = num1==num2 // 변수안의 값을 비교
 *
 *	Car c1=new Car();
 * 	Car c2=new Car();
 * 	boolean result2 = c1==c2 // 변수안의 값(참조값)을 비교
 * 
 *  String name1="김구라"
 *  String name2="김구라"
 *  String name3=new String("김구라");
 *  boolean result3 = name1==name2 // true
 *  boolean result4 = name1==name3 // false
 *  
 *  cf) 문자열은 생성 방식에 따라 내용이 같아도 참조값은 다를 수 있다.
 *      -> 문자열에서는 ==, != 연산자로 비교 하면 안된다.
 *      
 *  우리는 문자열의 참조값보다 내욜을 비교할 일이 많다
 *  그러면 내용비교는 어떻게 할까?
 *  
 *  -> String객체.equals(); 메소드(boolean type)를 활용해야한다.
 * 
 */
