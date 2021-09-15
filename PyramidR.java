class PyramidR
{
	public static void main(String args[])
	{
		int i,j,s;
		for(i=1;i<=20;i++)
		{
			for(s=i;s>=1;s--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=20-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}