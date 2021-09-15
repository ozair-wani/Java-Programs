import java.io.DataInputStream;
class Factorial
{
	public static void main(String args[])
	{
		DataInputStream input=new DataInputStream(System.in);
		int n=0,f=1;
		System.out.println("enter any number to calculate its factorial:");
		try
		{
			n=Integer.parseInt(input.readLine());
		}
		catch(Exception e)
		{
			System.out.println("error occured "+e);
		}
		
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("factorial of "+n+" is: "+f);
	}
	

}