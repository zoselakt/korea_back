package com.mod.mod013;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "유비"); // 자바 9이상 사용가능
		map.put(new Integer(2), "관우"); // 자바 8이하로 사용된 코드
		map.put(3, "장비"); // 문법적으로는 틀린코드이지만 오토박싱으로 자동으로 수정
		
		System.out.println(map.get(Integer.valueOf(1)));
		System.out.println(map.get(new Integer(2)));
		System.out.println(map.get(new Integer(3)));
		
		Set<Integer> set = map.keySet();
		for(Integer integer : set) {
			System.out.print(integer + ": ");
			System.out.println(map.get(integer));
		}
	}
}
