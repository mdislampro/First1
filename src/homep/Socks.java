package homep;

import java.util.HashMap;
import java.util.Map;

public class Socks {

	public static void main(String[] args) {
		
		int x [] = {9,8,9,7,2,7,9,3,8,9,9};
		
		int tnos = 0;
		
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		
		for(int i=0; i<x.length; i++) {
			if(!m.containsKey(x[i]))  {
				m.put(x[i], 1); 
					
		        for(int j =i+1; j<x.length; j++)   {
		        	if(x[i] == x[j]) {
		        		tnos = m.get(x[i])+1;
		        		m.put(x[i], tnos)  ;
		        	}
		        }				
		}
	}
		for(int d:m.keySet()) {
			System.out.println(d+" == "+m.get(d)+"-->");
			int s = m.get(d)/2;
			System.out.println("              "+s);
			tnos=tnos+s;
			
			
		}
		System.out.println("======================");
		System.out.println("Total pears   "+tnos);
		
	}
}
