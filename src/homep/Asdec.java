package homep;

public class Asdec {

	public static void main(String[] args) {

		int x [] = { 5,9,4,3,10,7,20,18};
		
		Asdec ds = new Asdec();
		
		x=ds.sum(x);
		
		for(int i=0; i<x.length; i++) {
			System.out.println(x[i]+" ");
		}
	}
	public  int [] sum(int x[]) {
		
		int temp = 0;
		
		for(int i = 0; i<x.length;i++) {
			for(int j=i+1; j<x.length; j++) {
				if(x[i]<x[j]) {
					temp = x[i];
					x[i]=x[j];
					x[j]=temp;		
			}
		}
	}
			return x;
}

}
