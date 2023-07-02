package exam;

public class Assending {

	public static void main(String[] args) {
		
		int m []  = { 15,52,41,57,45,24,45,45,41};
				
				int n = 0;
				
											//for(int  i = 0; i< m.length;  i++) {
					
											//	System.out.print(m [i]+ " ");
					
											//}
				
				for(int  i = 0; i< m.length;  i++) {
					
					for(int  j = i+1; j< m.length;  j++) {
						
						if(m [i]> m [j]) {  // If if(m[i]< m[j]) == Descending Order .
							
							   n =  m [i];
							m [i] = m [j];
							m [j] = n;
									
						}
					}
				}
				
											//System.out.println();
				
				System.out.println("Ascending Order  : ");
				
				for(int i = 0; i <m.length; i++) {
					
					System.out.print(m [i]+ " ");
		}
	}

}
