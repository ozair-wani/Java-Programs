class PyramidNums
{
	public static void main(String args[])
	{
		int c=1;
		int i,j,s;
		for(i=1;i<=9;i++)
		{
			for(s=i;s<=9;s++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				
			}c++;
			System.out.println();
		}
	}
}