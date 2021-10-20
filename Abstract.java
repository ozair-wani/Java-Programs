abstract class Parent
{
	int x;
	public Parent()
	{
		x=10;
	}
	abstract public void disp();
}
class Child extends Parent
{
	int y;
	public Child()
	{
		super();
		y=10;
	}
	public void disp()
	{
		System.out.println("value of y = "+y);
		System.out.println("value of x = "+x);
	}
}
class Abstract
{
	public static void main(String args[])
	{
		Child a=new Child();
		a.disp();
	}
}