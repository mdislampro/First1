package homep;

import java.util.ArrayList;
import java.util.Collections;


public class D_ascending {

	public static void main(String[] args) {


		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(15);
		num.add(25);
		num.add(5);
		num.add(9);
		num.add(30);
		num.add(35);
		
		System.out.println("Before sorting : "+num);
		
		Collections.sort(num);
		
		System.out.println("Ascnding number : "+num);
		
		Collections.sort(num,Collections.reverseOrder());
		
		System.out.println("Descnding number : "+num);
		
		
	}

}
