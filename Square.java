package com.odigos.basics;

	public class Square {
		static int n=1,add,sum1,sum, square,diff;

		   public static int calculateDifference() {

			for (n=1;n<=10;n++)
			{
				add=n+add;
				sum = add*add;
				square =n*n;
		        sum1=sum1+square;
		        diff =sum-sum1;
			}
			
		   return diff;
		   }
			   public static void main(String[] args)
			   
			   {

				   System.out.println(calculateDifference());
			   } 

	}	


	
	