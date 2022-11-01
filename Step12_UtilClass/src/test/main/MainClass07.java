package test.main;

import java.util.HashSet;
import java.util.Set;

/*
 * 		HashSet 은 Set 인터페이스를 구현한 클래스 이다.
 * 
 * 		- 순서가 없다.
 * 		- Key 값이 없다
 * 		- 중복을 허용하지 않는다.
 *  	- 어떤 data 를 묶음(집합) 으로 관리하고자 할 때 사용한다.
 */

public class MainClass07 {
	public static void main(String[] args) {
		HashSet<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		set1.add(40);
		
		// 문자열을 저장 할 수있는 HashSet 객체
		Set<String> set2=new HashSet<>();
		set2.add("kim");
		set2.add("lee");
		set2.add("park");
		set2.add("kim");
		set2.add("yuen");
		set2.add("lee");
		
	}
}
