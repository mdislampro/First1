package homep;

public class Mthd2 {

	public static void main(String[] args) {


		int [] a = {15,52,41,57,45,24,45,45,41,9};


		Mthd2  m= new Mthd2 (); 

		a  = m.dada(a);
		
		System.out.println(a);

		
		  for(int i = 0; i<a.length; i++ ) {
		  
		  System.out.println(a[i]); }
		 
	}
	public int  [] dada (int a []) {

		//int [] a = {15,52,41,57,45,24,45,45,41,9};

		int sum = 0;

		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {

				if(a[i]> a[j]) {

					sum = a[i];
					a[i] = a[j];
					a[j]= sum;		
				}
			}
			
		}
		return a;
	
	}
}
