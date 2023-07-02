package Incap;

public class M {

	public static void main(String[] args) {
		
		I i = new I();
		
		System.out.println(i.getA());
		System.out.println(i.b);
		
		//int s = i.b;
		
		i.setA(75);
		i.b =125;
		
		System.out.println(i.getA());
		System.out.println(i.b);
		
		
		
		
		System.out.println("=========================New Object");
		
		
		I i1 = new I();
		
		System.out.println(i1.getA());
		System.out.println(i1.b);
		
	}

}
