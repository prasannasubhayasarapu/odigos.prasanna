package com.odigos.basics;

import java.util.Scanner;
public class Smallest {
	public static void main(String[] args) {
		
	
	int a ,b,c,smallest,temp;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the First Number");
a=sc.nextInt();
System.out.println("Enter the Second Number");
b=sc.nextInt();
System.out.println("Enter the Thrid Number");
c=sc.nextInt();
temp = a<b?a:b;
smallest= c<temp?c:temp;
System.out.println("The smallest number:" + smallest);
}
}

