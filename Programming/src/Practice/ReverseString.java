package Practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// String Reverse
		String n1,n2="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name : ");
		n1=sc.nextLine();
		String rev=n1;
		 for(int i=n1.length()-1;i>=0;i--) {
			n2=n2+n1.charAt(i); 
		 }
		 if(n2.equals(rev))
		 System.out.println("it is palindrome Reverse String ");
		 else
			 System.out.println("it is not palindrome Reverse String ");
	}

}
