package exam;



public class DblD {

	public static void main(String[] args) {

		int x [][] = new int [2][4];
		
		x[0][0]=20;
		x[0][1]=30;
		x[0][2]=40;
		x[0][3]=50;
		
		
		x[1][0]=25;		
		x[1][1]=35;		
		x[1][2]=45;	
		x[1][3]=55;
		
		System.out.println(x[1][2]);
		x[1][2]=145;
		System.out.println(x[1][2]);
		
		System.out.println("=========");
		
		for(int i =0; i < x.length; i++) {
			for(int j =0; j < x[0].length; j++) {
				
				
				System.out.println(x[i][j]);
			}
		}
		
		
		
		
	}

}
