class Sortingelements
{

	public static void main(String[] args) 
	{
		
		int [] a = {71,24,60,80,50};
		System.out.println("enter array elements one by one");
		for(int cycle=1;cycle<=a.length-1;cycle++)
		{
			for(int i=0;i<=a.length-2;i++)
			{
			if (a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		}
		System.out.println("after swapping array:");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]+" ");
		}


			}
}
