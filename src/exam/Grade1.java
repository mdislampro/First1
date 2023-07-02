package exam;

public class Grade1 {
	
	public static void main(String[] args) {
		
		int grade = 38;
		int x = grade%5;
		
		if(grade>=38) {
			if(x>=3) {
				grade=grade-x+5;
				
				System.out.println(x);
			}
		}
		
		System.out.println(grade);
		
	}

}
