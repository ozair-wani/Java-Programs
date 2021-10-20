class MyStack
{
	final int max=100;
	int st[]=new int[max];
	int top;
	public MyStack()
	{
		top=-1;
	}
	void push(int x)
	{
		st[++top]=x;
	}
	int pop()
	{
		return st[top--];
	}
	void display()
	{
		for(int i=0;i<=top;i++)
			System.out.print(" "+st[i]);
		System.out.println(" ");
	}
	
}
class ChkStack extends MyStack
{
	public ChkStack()
	{
		super();
	}
	void push(int x)
	{
		if(top!=max)
			super.push(x);
		else
			System.out.println("overflow occured");
	}
	int pop()
	{
		if(top!=-1)
			return super.pop();
		else
		{
			System.out.println("underflow occured");
			return -1;
		}
			
		
	}
}
class CheckStack
{
	public static void main(String args[])
	{
		ChkStack s1=new ChkStack();
		
		s1.push(2);
		s1.push(4);
		s1.display();
		s1.pop();
		s1.display();
		s1.pop();
		s1.display();
		s1.pop();
		s1.display();
		s1.push(3);
		s1.display();
	}
}