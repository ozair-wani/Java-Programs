import java.util.Scanner;
class Leap
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the year to check whether leap or not:");
		int y=input.nextInt();
		if(y%4==0)
		{
			System.out.println(y+" is a leap Year");
		}
		else
		{
			System.out.println(y+" is not a leap Year");
		}
	}
}