package com.odigos.basics;

import java.util.Scanner;
public class Smallest {
	public static void main(String[] args) {
		
	
	int a ,b,c,smallest,d;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the First Number");
a=sc.nextInt();
System.out.println("Enter the Second Number");
b=sc.nextInt();
System.out.println("Enter the Thrid Number");
c=sc.nextInt();
d = a<b?a:b; //checking a greater than b or b greater than a
smallest= c<d?c:d;//checking c greater than a and b (d)  or c greater than a or b
System.out.println("The smallest number:" + smallest);
sc.close();
}
}
