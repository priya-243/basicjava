package BasicJavaProgram;

public class LogicalOperator {
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		if(a==b&&b>a)
		{
			System.out.println(" Hello");
		}
		if(a!=b&&b>a)
		{
			System.out.println("Hi");
		}
		if(!((a==b&&b>a)))
		{
			System.out.println(" not hello");
		}
		if(!(a!=b&&b>a))
		{
			System.out.println("not hi");
		}
		else if(a==b||b>a)
		{
			System.out.println("see you");
		}
		else if(a!=b||b>a)
		{
			System.out.println("bye");
		}
		else if(!((a==b||b>a)))
		{
			System.out.println("not see you");
		
		}
		else if(!(a!=b||b>a))
		{
			System.out.println("not bye");
		
		}
			
		}
		
		}
		


