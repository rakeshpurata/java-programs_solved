import java.util.Scanner;
class Mergetwoarrays
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter array1 size");
		int size1=sc.nextInt();
		int []a =new int[size1];
		System.out.println("enter array1 elements");
	
	for(int i=0;i<=a.length-1;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("enter array2 size");
		int size2=sc.nextInt();
		int []b =new int[size2];
		System.out.println("enter array2 elements");
	
	for(int i=0;i<=b.length-1;i++)
	{
		b[i]=sc.nextInt();
	}
	
	int[] c=new int[a.length+b.length];
	for(int i=0;i<=a.length-1;i++)
   {
	  
		   c[i]=a[i];
   }

		   for(int i=0;i<=b.length-1;i++)
   {
		   c[i+a.length]=b[i];
   }
   System.out.println("after merging two arrays:");
   for(int i=0;i<=a.length-1;i++)
   {
	System.out.println(a[i]+"");
   }
   }
}
