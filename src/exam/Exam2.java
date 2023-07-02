package exam;

import java.util.ArrayList;
import java.util.List;

public class Exam2 {

	public static void main(String[] args) {
		
		List<Object> i = new ArrayList<Object>();
		
		
	    i.add("Test");
		i.add  ("1");
		i.add("Pass");
		i.add("Score");
		i.add("False");
		
		
		i.remove(1);
		
		//{System.out.println(i.get(1));
		
		for(Object x: i) {
			System.out.println(x);
	}}

}
