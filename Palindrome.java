import java.io.DataInputStream;
class Palindrome
{
	public static void main(String args[])
	{
		System.out.print("Enter any number to check whether palindrome or not:\n\t->");
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
		int rev=0,temp=a;
		for(;temp!=0;temp/=10)
		{
			rev=rev*10+temp%10;
		}
		System.out.println("Given number: "+a+"\nReverse: "+rev);
		if(rev==a)
		{
			System.out.println("Result: palindrome");
		}
		else
		{
			System.out.println("Result: Not palindrome");
		}
	}
}