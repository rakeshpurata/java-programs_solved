import java.util.Scanner;
class Reveresingfirsthalfandsecondhalf
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int []a =new int [size];
		System.out.println("enter array elements one by one");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
	    int x=0;
		int y=(a.length-1)/2;
		int swappingcount=(a.length)/4;
		for(int b=1;b<=swappingcount;b++)
		{
		
			int temp=a[x];
			a[x]=a[y];
			a[y]=temp;
			x++;
			y--;
		}
	      x=((a.length-1)/2)+1;
		  y=a.length-1;
		  for(int b=1;b<=swappingcount;b++)
		{
		
			int temp=a[x];
			a[x]=a[y];
			a[y]=temp;
			x++;
			y--;
		}



	System.out.println("after swapping array is:");
    for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]+" ");
		}
}
}
