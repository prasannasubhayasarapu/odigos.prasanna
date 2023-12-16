package com.odigos.basics;

import java.util.Scanner;

public class Power_of_2
{
	public static boolean checkNumber() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Number");
		int n=scan.nextInt();
		if (n%2==0) 
			return true;
		return false;	
				
	
	}
	public static void main(String[] args) {
	System.out.println(checkNumber());
	
	}}
