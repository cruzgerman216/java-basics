package com.qa.java.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayExercise {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> arrayList2;
		int x = 1;
		arrayList.add(x++);
		arrayList.add(x++);
		arrayList.add(5675);
		arrayList.add(x++);
		arrayList.add(98);
		arrayList.add(x++);
		arrayList.add(x++);
		
		arrayList.remove(1);
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		Collections.sort(arrayList);
		for(Integer arr : arrayList) {
			System.out.println(arr);
		}
		System.out.println("line break");
		Collections.reverse(arrayList);
		for(Integer arr : arrayList) {
			System.out.println(arr);
		}
		System.out.println("line break");
		
		Collections.swap(arrayList,1,2);
		for(Integer arr : arrayList) {
			System.out.println(arr);
		}
		System.out.println("line break");
	}
}
