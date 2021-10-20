class Shape
{
	void draw()
	{
		System.out.println("Shape");
	}
}
class Rect extends Shape
{
	void draw()
	{
		System.out.println("Rectangle");
	}
}
class Dynamic
{
	public static void main(String args[])
	{
		Shape s1=new Rect();
		s1.draw();
	}
}