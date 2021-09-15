import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the limit for prime numbers: ");
		int max=input.nextInt();
		System.out.println("prime numbers from 1 to "+max+" is:");
		int i,j;
		for(i=1;i<=max;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
			{
				System.out.print(i+", ");
			}
		}
	}
}