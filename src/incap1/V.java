package incap1;

public class V {

	public static void main(String[] args) {
		
		W w = new W();
		
		
		System.out.println(w.getA());
		System.out.println(w.y);
		
		w.setA (35);
		w.y=45;
		System.out.println(w.getA());
		System.out.println(w.y);
		
		W w1 =new W();
		
		System.out.println(w1.getA());
		System.out.println(w1.y);
	}
	
}
