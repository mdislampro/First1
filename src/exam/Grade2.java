package exam;

public class Grade2 {

	public static void main(String[] args) {

		int x [] = {37,39,47,53,67,73,84};
		
		int grade = 0;
		
		for(int i = 0; i<x.length; i++) {
			
			int m = grade%5;
			
			if(grade>=38) {
				if(m>=3) {
					grade = grade -m+5;
					{
						
					}
				}
			}
		}
			
		System.out.println(grade);
		

	}

	
	}


