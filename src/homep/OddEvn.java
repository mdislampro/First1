package homep;

public class OddEvn {

	public static void main(String[] args) {

		for(int i = 0; i<20; i++ ) {

			int num = i%2;
			System.out.print(i+"  :  ");
			if(num==0) {

				System.out.println("EVEN");

			}else  {								// Or else if (num==1)
				System.out.println("Odd");
			}
		}			
	}
}

