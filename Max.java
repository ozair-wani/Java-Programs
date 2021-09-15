import java.util.Scanner;
class Max
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the two numbers to compare:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		if(num1>num2)
		{
			System.out.println(num1+" is Maximum");
		}
		else if(num1<num2)
		{
			System.out.println(num2+" is Maximum");
		}
		else
		{
			System.out.println(num1+" and "+num2+" are equal");
		}
		
	}
}