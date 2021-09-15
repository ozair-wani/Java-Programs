import java.util.Scanner;
class Switch
{
	public static void main(String args[])
	{
		System.out.println("Enter any alphabet");
		Scanner input=new Scanner(System.in);
		String a=input.nextLine();
		switch(a)
		{
			case "a":
			System.out.println(a+" is a vowel");
			break;
			case "e":
			System.out.println(a+" is a vowel");
			break;
			case "i":
			System.out.println(a+" is a vowel");
			break;
			case "o":
			System.out.println(a+" is a vowel");
			break;
			case "u":
			System.out.println(a+" is a vowel");
			break;
			default:
			System.out.println(a+" is a Consonant");
		}
		
	}
}