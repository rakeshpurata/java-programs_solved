import java.util.Scanner;
class  Smallestarray
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter array size");
		int size=scan.nextInt();
		int a[]= new int[size];
		System.out.println("enter array elements one by one");
		for(int i=0;i<= a.length-1;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("smallest array element");
		int smallest=a[0];
		for(int i=0; i<=a.length-1;i++)
		
			{
				if (a[i]<smallest);
				{
				
				smallest=a[i];
				}
			}
	

				
			System.out.println(smallest);
	}
}
