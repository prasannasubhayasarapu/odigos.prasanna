package com.odigos.basics;

public class Sum_Natural_Numbers {
	static int n=1,sum;

	   public static int calculateSum() {

		for (n=1;n<=10;n++)
		{
			if ((n%3==0)||(n%5==0))
				
	        sum=sum+n;
		
		}
	   return sum;
	   }
		   public static void main(String[] args)
		   
		   {

			   System.out.println(calculateSum());
		   }

	   

}	

