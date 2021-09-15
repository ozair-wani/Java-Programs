import java.io.DataInputStream;
class Fibonacci
{
	public static void main(String args[])
	{
		System.out.print("Enter the no. of terms U want to display:\n\t->");
		DataInputStream input=new DataInputStream(System.in);
		int n=0;
		try
		{
			n=Integer.parseInt(input.readLine());
		}
		catch(Exception e)
		{
			System.out.println("Error Occured "+e);
		}
		
		int x=0,y=1,z=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(z+", ");
			x=y;
			y=z;
			z=x+y;
		}
	}
}