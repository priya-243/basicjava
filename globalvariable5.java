package BasicJavaProgram;

public class globalvariable5
{
	int a=100;
	int b=200;
	static int c=10;
	static int d=20;
	static void sub()
	{
		System.out.println(d-c);
	}
	void mul()
	{
		System.out.println(a*b);
	}
	static void add()
	{
		System.out.println(c+d);
	}
	
	public static void main(String[] args) 
	{
		globalvariable5 g1=new globalvariable5();
		g1.mul();
		g1.sub();
	}

}
