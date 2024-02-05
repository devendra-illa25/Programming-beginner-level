package Practice;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// Sum of Digits
		   int num, sum=0, dig;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a Number");
	        num = sc.nextInt();
	        
	      do{
	            dig = num % 10;
	            sum = sum + dig;
	            num = num / 10;
	        }while(num!=0);
	      System.out.println("Sum of digits :" +sum);

	}

}
