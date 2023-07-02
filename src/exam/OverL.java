package exam;

public class OverL {
	public static void main(String[] args) {
		
		OverL a = new OverL();
				
		double k= a.m(5.8,10.2,12.5,15);
		
		System.out.println(k);
		
	}
	
	public  double m(double a,double b) {
		double d = a + b;
		return d;
	}
	public double m(double a, double b, double c) {
			
			double d = a+b+c;
			return d;
	}
	
	public double m(double a,double b,double c,double f) {
		
		double d = a+b+c-f;
		return d;
	}
}
