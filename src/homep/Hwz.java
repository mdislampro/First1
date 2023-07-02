package homep;

public class Hwz {

	public static void main(String[] args) {
		Hwz hwz = new Hwz();
		double x =hwz.A(p, r, n);
		System.out.println(x);
	}

static double p = 50000;
static float r = 5.5f;
static int n = 60;
static int t = n/12;
	
	
 public double A(double p,float r,int n) {
	 double M = ((p*r/100)*t+p)/n;               //p(r(1+r)*n)/((1+r)*n-1);
	 return M;
 }}