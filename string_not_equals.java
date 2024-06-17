class StringNotEquals
{
	public static void main(String[] args) 
	{
		String s1="Abhishek";
		String s2="Abhilash";
		boolean isEqual=true;
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				isEqual=false;
				break;
			}
		}
		if(isEqual==true)
		{
			System.out.println("both strings are equal");
		}
		else
		{
			System.out.println("both strings are  not bequal");
		}
	}
}
