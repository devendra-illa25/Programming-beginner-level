package Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Factorial
		int num,fac=1;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        num = sc.nextInt();
       for(int i=1;i<=num;i++) {
    	   fac=fac*i;
        	
        }
       System.out.println(+fac);
//
//		System.out.println("Factors are:");
//		for(int i=1; i<=number; i++) {
//			if(number%i == 0)
//				System.out.println(i);
//		int number = 10;
//		int factorial = 1;
//		
//		for(int i = 1; i<= number; i++) {
//			factorial = factorial * i;
//			//can also be written as factorial *= i
//		}
//		
//		System.out.println("Factorial is: "+factorial)
//		int sNumber = 8;
//		int eNumber = 250;
//		int sum = 0;
//		
//		for(int i = sNumber; i<=eNumber; i++) {
//			if(i % 2 == 0)
//				sum = sum + i;
//		}
//		
//		System.out.println("Sum is: "+sum);
		}

	}


