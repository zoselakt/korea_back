package com.mod.mod013;

import java.util.*;

public class ListGeneric {
	public static <T> void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(new Integer(4), "word");
		list.add("word2");
		list.add("second");
		list.add(new Integer(4), "word");
		System.out.println(list);
	}
}
