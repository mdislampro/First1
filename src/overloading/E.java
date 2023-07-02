package overloading;

public class E {

	public static void main(String[] args) {
		
		E e = new E();
		
		double r=e.sum(20,30,40); //a=30,b=40,c=40
		
		System.out.println(r);
	}
	
	
	
	
	
	
	
	
	
	public double sum(double a, double b) {
		double total =a+b;
		return total;
	}	
	public double sum(double a,double b, double c) {
		double total = a+b+c;
		return total;
	
	}
	
}
