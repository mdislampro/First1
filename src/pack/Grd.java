package pack;

public class Grd {

	public static void main(String[] args) {

		//int p [] = {38,57,73,83};
		
	//for(int i=0; i<p.length; i++) {
		//	int grade =p[i];
		
			int grade=38;
		    int x = grade%5;
		
		if(grade>=38) {
			if(x>=3) {
				grade= grade-x+5;
				
			}
		}
	
		System.out.println(grade);
	}
		
		
	

}
