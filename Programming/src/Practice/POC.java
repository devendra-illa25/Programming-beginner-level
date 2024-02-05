package Practice;

import java.util.Scanner;

public class POC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  int num,count=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a value");
	  num=sc.nextInt();
	  
	  for(int i=2;i<num/2;i++)
	  {
		  if(num%i==0)
			  count++;
	  }
	  if(count==0)
	  {
		  System.out.println("given number is prime");
		  
	  }
	  else
	  {
	  
		  System.out.println("given number is Not prime");
	}

}
}
