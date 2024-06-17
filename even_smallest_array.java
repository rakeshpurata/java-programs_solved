import java.util.Scanner;
class EvenSmallestArray

{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("enter array size");
		int size=scan.nextInt();
		int []a=new int [size];
		System.out.println("enter array elements");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("enter array elements are ");
		int smallest=82;
			
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
              if(a[i]<smallest)
				{
				smallest=a[i];
				}
			}
		}
		System.out.println(smallest);
		
	}
}
