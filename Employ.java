package com.odigos.basics;
import java.util.Scanner;
public class Employ{
	public static void main (String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter Employ id:");
int eid=scan.nextInt();
 System.out.println("Enter Employ Name:");
String ename=scan.next();
System.out.println("Enter Employ SALARY:");
float esalary=scan.nextFloat();
System.out.println("Enter Employ Add:");
String eadd=scan.next();
System.out.println("Enter Employ Email:");
String email=scan.next();


System.out.println(eid+" "+ename+" "+esalary+" "+eadd+" "+email);
scan.close();
	}
	
}
