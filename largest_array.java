import java.util.Scanner;
class  LargestArray
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter array size");
		int size=scan.nextInt();
		int a[]= new int[size];
		System.out.println("enter array elements one by one");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=scan.nextInt();
		}
		int largest=0;
		for(int i=0;i<=a.length-1;i++)
		
			{
				if (a[i]>largest);
				{
				
				largest=a[i];
				}
			}
	

				
			System.out.println(largest);
	}
}
