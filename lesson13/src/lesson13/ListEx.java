package lesson13;

import java.util.ArrayList;


public class ListEx {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); //크기 지정 X, 들어가는 타입을 지정해주지 않음
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add((int)'A');
		
		for (int i =0 - 0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.toString());
	}
}
