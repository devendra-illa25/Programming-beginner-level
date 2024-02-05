package Practice;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=73205,even_count=0,odd_count=0,dig;
		do {
			dig=num%10;
			if(dig%2==0) {
				
				even_count++;
				
			}
			else{
				
				odd_count++;
			}
			num=num/10;

		}while(num!=0);
		System.out.println("Even number:" +even_count);
		System.out.println("odd number:" +odd_count);
	}
}
	

