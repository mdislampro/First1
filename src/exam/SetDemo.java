package exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {


		Set<Object> w = new HashSet<Object>();
		
		w.add("Information");
		w.add('b');
		w.add(25);
		w.add(45612);
		w.add(false);
		w.add(5.7);
		
		
		//System.out.println(w);
		
		System.out.println(w.size());
		
		for(Object e:w) {
			System.out.println(e);
		
			//while(q.hasNext() ) {
			
			// System.out.println(q.next());
	
			
		//Iterator<Object> q = w.iterator();
	
		
		//q.next();
		//q.next();
		//q.next();
		//System.out.println(q.next());
		
		
			
		}
		
	
		
		
	}

}
