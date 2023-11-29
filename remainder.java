package com.odigos.basics;

public class remainder {
public void sumofTwo(int a,int b) {
	System.out.println("Addition of Two Numbers:"+(a+b));
}
public static int subofTwo(int a,int b) {
	return a-b;
}
public static int mulofTwo(int a,int b) {
	return a*b;
}
public void divofTwo(int a,int b) {
	System.out.println("division of Two Numbers:"+(a/b));

}
public void modofTwo(int a,int b) {
	System.out.println("modulus of Two Numbers:"+(a%b));
}









	public static void main(String[] args) {
System.out.println(remainder.subofTwo(2, 8));
System.out.println(remainder.mulofTwo(2,8));
remainder obj= new remainder();
obj.sumofTwo(2, 5);
obj.divofTwo(4, 4);
obj.modofTwo(5, 5);
	}

}
