package homep;

public class Cnt {

	public static void main(String[] args) {
		
		String a = "We are in NY";
		String b ="NY   ";	
		
		if(a.contains(b.trim() )) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
