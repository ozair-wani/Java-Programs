import java.util.Scanner;
class ArraySort
{
	public static void main(String args[])
	{
		//create array of 10 ints
		int[] num={5,4,2,7,6,3,8,1,9,0};//num.length contains the size.
		int n=num.length,i,j;
		System.out.println("original array: ");
		for(i=0;i<n;i++)
			System.out.print(" "+num[i]);
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(num[i]>num[j])
				{
					num[i]^=num[j];
					num[j]^=num[i];
					num[i]^=num[j];
				}

			}
		}
		System.out.println("\nSorted array: ");
		for(i=0;i<n;i++)
			System.out.print(" "+num[i]);

	}
}