package test.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass10 {
	public static void main(String[] args) {
		// HashSet 객체에 정수를 순서 없이 담기
		Set<Integer> set1=new HashSet<>();
		set1.add(30);
		set1.add(20);
		set1.add(50);
		set1.add(10);
		set1.add(20);
		
		// HashSet 객체에 담긴 아이템을 순서있게 관리하기위해 
		// 생성자의 인자에 넣어 객체 생성하기
		List<Integer> list=new ArrayList<>(set1);
		
		Collections.sort(list);
		
		for(int tmp:list) {
			System.out.println(tmp);
		}
	}
}
