package exam;

public class Exam3 {

	public static void main(String[] args) {
		
		Object obj [][] = new Object[3][3];
		
		obj [0][0] = "Name";
		obj [0][1] = " Phone";
		obj [0][2] = "     Email";
		
		obj [1][0] = "Babu";
		obj [1][1] = 6268957412l;
		obj [1][2] = "abc@gmail.com";
		
		obj [2][0] = "Islam";
		obj [2][1] = 9298653471l;
		obj [2][2] = "def@gmail.com";
		
		int nor = obj.length;
		int noc = obj[0].length;
		
		
		for(int i=0; i<nor; i++) {
		for(int f=0; f<noc; f++) {
		
		
		System.out.print(obj[i][f]);
		System.out.print("   " );
		
		
		}
		
		System.out.println();
		}
		
	}

}
