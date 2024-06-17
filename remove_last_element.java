import java.util.Scanner;
class Removelastelement

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int[] a =new int[size];
         System.out.println("enter array elements one by one");
		 for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		int[] b=new int [a.length-1];

		System.out.println("enter last element");
		for(int i=0;i<=b.length-1;i++)
		{
			b[i]=a[i];
		}
		System.out.println("after removing last element");
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.println(b[i]);
	}
}
}
