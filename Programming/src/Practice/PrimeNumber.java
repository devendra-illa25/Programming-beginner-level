package Practice;

public class PrimeNumber {
	public static void main(String [] args) {
		int num=8,count=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) 
			System.out.println("Prime NUmber");
		else
			System.out.println("not prime");
		}
	}

