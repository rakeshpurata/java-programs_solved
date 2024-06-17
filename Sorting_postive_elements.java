class SortingPositivEelements
{

	public static void main(String[] args) 
	{
		
		int [] a = {60,53,71,24,19,18,36,70,81,90};
     for(int i=0;i<=a.length-1;i++)
	  {
		for(int j=i+1;i<=a.length-1;j++)
		{
			  if(a[i]%2==0 && a[j]%2==0 && a[i]>a[j])
			   {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			    }
				else if(a[i]%2==1 && a[j]%2==1 && a[i]>a[j])
			{
					int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
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
