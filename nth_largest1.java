import java.util.Scanner;
class NthLargest1
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int [] a=new int [size];
		System.out.println("enter array elements one by one");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter n value to print nth largest element");
		int n=sc.nextInt();
		for(int i=0;i<=a.length-1;i++)
		{
			
			int count=0;
			for(int j=0;j<=a.length-1;j++)
			{
				if(a[j]>a[i])
				{
					count++;
				}
			}
				if(count==(n-1))
				{
					System.out.println(n+"th largest element is:"+a[i]);
				}
			}
			if(n>a.length)
			{
				System.out.println("enter valid input");
			}
		}
	}
