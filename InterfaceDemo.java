interface Area 
{
	float pi=3.14f;
	float area(float a, float b);
}
class Circle implements Area
{
	float area,radius;
	public float area(float x,float y)
	{
		radius=x;
		area=pi*radius*radius;
		System.out.println("Area of circle with radius of "+radius+"cm is "+area+" square cm");
		return area;
	}
}
class Rectangle implements Area
{
	float area,l,b;
	public float area(float x,float y)
	{
		l=x;b=y;
		area=l*b;
		System.out.println("Area of rectangle with length of "+l+"cm and breadth of "+b+"cm is "+area+" square cm");
		return area;
	}
}
public class InterfaceDemo
{
	public static void main(String args[])
	{
		Area a;
		Circle c1=new Circle();
		Rectangle r1=new Rectangle();
		a=c1;
		a.area(10,0);
		a=r1;
		a.area(20,10);
	}
}