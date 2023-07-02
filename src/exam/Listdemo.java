package exam;

import java.util.ArrayList;
import java.util.List;

public class Listdemo {

	public static void main(String[] args) {
		
		List<Integer> s =new ArrayList<>();
		
		s.add(15);
		s.add(25);
		s.add(30);
		s.add(40);
		s.add(55);
		
		
		
		System.out.println(s.get(2));
		
		s.add(65);
		
		
		s.remove(3);
		System.out.println(s.size());
		
		System.out.println(s.get(4));
		
		System.out.println("=====================");
		
		for(int m : s) {
			System.out.println(m);
		}

	}

}
