package pack;

import java.util.Scanner;

public class SUM_Avg {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		double[]number = new double[5];
		
		double sum = 0;
		System.out.print("Please enter any 5 numbers : ");
	{
		
		number[0]= input.nextDouble();
		number[1]= input.nextDouble();
		number[2]= input.nextDouble();
		number[3]= input.nextDouble();
		number[4]= input.nextDouble();
		
		 sum = number[0] + number[1] + number[2] + number[3] + number[4];
	}
		
		{System.out.println("The Total is :"+sum);
	
		
		/*for(int i=0; i<5; i++) {
			number[i]=input.nextDouble();
			System.out.println(i);
			
			sum = number[0] + number[1] + number[2] + number[3] + number[4];
			System.out.println("The Total is :"+i);
					*/
			

	}

	}}
