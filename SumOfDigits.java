import java.io.DataInputStream;
class SumOfDigits
{
	public static void main(String args[])
	{
		System.out.print("Enter any number to calculate sum of its digits:\n\t->");
		DataInputStream input=new DataInputStream(System.in);
		int a=0;
		try
		{
			a=Integer.parseInt(input.readLine());

		}
		catch(Exception e)
		{
			System.out.print("error occured"+e);
		}
		int sum=0,temp=a;
		for(;temp!=0;temp/=10)
		{
			sum=sum+temp%10;
		}
		System.out.println("Sum of digits of "+a+" is: "+sum);
		
	}
}