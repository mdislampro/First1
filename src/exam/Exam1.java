package exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam1 {

	public static void main(String[] args) {
		
		Set<String> s =  new HashSet<String>();
		 s.add("Test");
		 s.add("Result");
		 s.add("Pass");
		 s.add("Score");
		 s.add("False");
		  
		 Iterator<String> it = s.iterator();{
		 
		
		 System.out.println(it.next());
		
		 
		 }
		
		

	}

}
