package com.odigos.basics;
import java.util.Scanner;
public class Increasing {

	    public static void main (String[] args) {
	        // Local Declarations
	        int number;
	        boolean increasingNumber=false;
	        Scanner input = new Scanner(System.in);
	        number = input.nextInt();
	        increasingNumber = checkNumber(number);
	        System.out.println(increasingNumber);
	    }
	    public static boolean checkNumber(int number) {
	        boolean increasing = false;
	        while(number>0) {
	            int lastDigit = number % 10;
	            number /= 10;
	            int nextLastDigit = number % 10;
	            
	            if(nextLastDigit<=lastDigit) {
	                increasing=true;
	            }
	            else {
	                increasing=false;
	                break;
	            }
	            
	        }
	        return increasing;
	    }
	}
