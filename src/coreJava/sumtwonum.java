package coreJava;

import java.time.LocalDate;
import java.time.Month;

public class sumtwonum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		LocalDate startDate = LocalDate.now();
		
		int year = 0;
		int month = 0;
		int dayOfMonth = 0;
		LocalDate startDate1 = LocalDate.of(2001, 2, 24);
		
		
		String stringDate = startDate1.toString();
		
		
		System.out.println(stringDate);
		
		boolean assigned = true;
		String s1=Boolean.toString(assigned); 
		
		System.out.println(s1);
		
	/*	int a[]= {2,5,8,7,4};
	//	int sum = 0;
		
		for(int i=0;i<a.length;i++) 
		{
	//		sum = sum +a[i];
	//		System.out.println(sum);
			if (a[i] == 7)
			{
				System.out.println("Number 8's index in the arrray is: " + i);
				break;  
			}
		}*/
	}

}
