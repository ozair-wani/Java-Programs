import java.io.DataInputStream;
class HormonicSum
{
	public static void main(String args[])
	{
		DataInputStream data = new DataInputStream(System.in);
		int n=0;float sum=0.0f;
		System.out.println("Enter the value of n:");
		try
		{
			n=Integer.parseInt(data.readLine());

		}
		catch(Exception e)
		{
			System.out.println("An error occured: "+e);
		}
		for(float i=1;i<=n;i++)
		{
			sum+=1/i;
		}
		System.out.println("Final sum = "+sum);




	}
}