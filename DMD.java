class Parent
{
	int x;
	public Parent()
	{
		x=10;
	}
	public void disp()
	{
		System.out.println("value of x = "+x);
	}
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
	}
}
class DMD
{
	public static void main(String args[])
	{
		Parent a=new Child();
		a.disp();//method of child class is called because a points to objects of Child class.
	}
}