package Practice;

import java.util.Scanner;

public class ProductofDigit {

	public static void main(String[] args) {
		// Product of digits
		  int num, pro=1, dig;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a Number");
	        num = sc.nextInt();
	        
	      do{
	            dig = num % 10;
	            pro = pro * dig;
	            num = num / 10;
	        }while(num!=0);
	      System.out.println("product of digits : " +pro);

	}

}
