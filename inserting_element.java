import java.util.Scanner; 
class InsertingElement
{


	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size");
		int size=scan.nextInt();
		int[]a=new int [size];//5
		System.out.println("enter array elements one by one");
		for(int i=0;i<=a.length-1;i++)//0,1,2,3,4
		{
			a[i]=scan.nextInt();
		}
		System.out.println("enter an element should be inserted");
		int n=scan.nextInt();
		int b[]=new int [a.length+1];//6
		for(int i=0;i<=a.length-1;i++)
		{
			b[i]=a[i];
		}
		b[b.length-1]=n;//ora.length
		System.out.println("after inserting the given element array is:");
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.println(b[i]);
	}
}
}
