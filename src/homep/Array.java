package homep;

public class Array {

	public static void main(String[] args) {

	Object [][] arrayDemo = new Object[2] [5];
		
		arrayDemo[0][0]= 10;
		arrayDemo[0][1]= 20;
		arrayDemo[0][2]= "Linku da";
		arrayDemo[0][3]= 40;
		arrayDemo[0][4]= 50;
		
		arrayDemo[1][0]= 60;
		arrayDemo[1][1]= 70;
		arrayDemo[1][2]= 80;
		arrayDemo[1][3]= 90;
		arrayDemo[1][4]= 99;
		
		System.out.println(arrayDemo.length);
		
		System.out.println(arrayDemo[0][2]);
		
		arrayDemo[1][2]=180;
		
		System.out.println(arrayDemo[1][2]);
		
		System.out.println(arrayDemo[0].length);
		
		
		
		/*for(int i = 0; i<arrayDemo.length; i++) {
			
			for(int j= 0; j<arrayDemo[0].length; j++) {
				
				System.out.println(arrayDemo[i][j]);
				*/
			
		
		
		

	}

}
