import java.util.Scanner;
class RemoveDuplicate
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
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
            boolean status=false;
            for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					status=true;
					break;
				}
			}
		if(status==false)							
		{

		   count++;
		}
		}
		int[] b=new int [count];
		int indexB=0;
		for(int j=0;j<=a.length-1;j++)
		{
            boolean status=false;
            for(int k=j-1;k>=0;k--)
			{
				if(a[k]==a[j])
				{
					status=true;
					break;
				}
			}
			if(status==false)
			
			
				{	
					b[indexB]=a[j];
					indexB++;
				}
			}
			System.out.println("array without duplicates");
		  for(int i=0;i<=b.length-1;i++)
			{
			  System.out.println(b[i]);
			}
		}
	}








			
import java.util.Scanner;
class RemoveDuplicate
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
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
            boolean status=false;
            for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					status=true;
					break;
				}
			}
		if(status==false)							
		{

		   count++;
		}
		}
		int[] b=new int [count];
		int indexB=0;
		for(int j=0;j<=a.length-1;j++)
		{
            boolean status=false;
            for(int k=j-1;k>=0;k--)
			{
				if(a[k]==a[j])
				{
					status=true;
					break;
				}
			}
			if(status==false)
			
			
				{	
					b[indexB]=a[j];
					indexB++;
				}
			}
			System.out.println("array without duplicates");
		  for(int i=0;i<=b.length-1;i++)
			{
			  System.out.println(b[i]);
			}
		}
	}
