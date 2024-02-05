package Practice;

public class searchvalue1D {

	public static void main(String [] args)
	{
		int a[]= {10,2,30,40,50};
		int search=2;
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
			{
				System.out.println("Element found in : "+i);
			}
		}
	}
}
