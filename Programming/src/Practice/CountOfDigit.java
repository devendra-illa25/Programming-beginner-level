package Practice;

import java.util.Scanner;

public class CountOfDigit {

	public static void main(String[] args) {
		// Count of digits;
		int num,dig,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		num=sc.nextInt();
		do
		{
			dig=num%10;
			count++;
			num=num/10;
		}while(num!=0);
		System.out.println(count);
		

	}

}
