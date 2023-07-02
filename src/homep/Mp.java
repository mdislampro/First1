package homep;

import java.util.HashMap;
import java.util.Map;
public class Mp {

	public static void main(String[] args) {
		
		Map<String, Object> m = new HashMap<String, Object>();
		
		m.put("Name ","Babu");
		m.put("Age  ",22);
		m.put("Phone",6543213214L);
		
		
		System.out.println(m.size());
		
		for(String value : m.keySet()){
		
			System.out.println(value+" : "+m.get(value));
		}
		
	}

}
