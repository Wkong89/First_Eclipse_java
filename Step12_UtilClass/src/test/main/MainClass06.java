package test.main;

import java.util.HashMap;

/*
 * 		Java 에서 어떤 데이터를 key : value 의 형태로 관리하고싶을때
 * 		HashMap 객체를 사용한다.
 * 
 * 		key 의 generic 은 임의로 지정 가능하나 보통 String type으로 한다.
 * 		value 의 generic 은 때에따라 다르나 여러가지 type일 경우 object type으로 한다.
 */

public class MainClass06 {
	public static void main(String[] args) {
		Object obj=1;
		Object obj1="kim";
		Object obj2=true;
		
		HashMap<String, Object> map1= new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("isMan", true);
		
		/*
		 * 		value 의 Generic 클래스가 Object 로 지정되어있기때문에
		 * 		린턴되는 Object type 을 원래 type 으로 casting 해야 한다.
		 */
		
		Object num = (int)map1.get("num");
		Object name= (String)map1.get("name");
		Object isMan= (boolean)map1.get("isMan");
		
		// 동일한 key 값으로 다시 담으면 수정
		map1.put("name", "에이콘");
		
		// 특정 key 값으로 담긴 내용 삭제, 성공하면 true, 실패하면 false 로 리턴
		map1.remove("isMan");
				
		// 모두 삭제
		map1.clear();
	}
}
