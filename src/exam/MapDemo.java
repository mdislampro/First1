package exam;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String,Object> p =new HashMap<String,Object>();
		
		
		p.put("Name", "Abc");
		p.put("Phone", 7184561287L);
		p.put("Address", "New York");
		p.put("Gender", "Male");
		
		
		//System.out.println(p.size());
		
		//System.out.println(p.get("Phone"));

		p.remove("Address");
		System.out.println(p.size());
		
		if(p.containsKey("Gender")){
			
			System.out.println("true");
			
		}
		if(!p.containsKey("Address")){
			
			System.out.println("false");
		}
		
		
		for(String value:p.keySet()) {
			
			System.out.println(p.get(value));
		}
		
		//System.out.println(p);
		
		
	}

}
