class Recursion
{
	public static void  integer(int a)
	{
		System.out.println(a);
		a++;
		if(a<=10)
		{
			integer(a);
		}
	}
	 public static void main(String[]args)
	{
		integer(1);
}
}
