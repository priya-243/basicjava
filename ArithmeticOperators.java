package BasicJavaProgram;
public class ArithmeticOperators {
	static void add()
	{
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println(c);
	}
	static void sub()
	{
		int a=500;
				int b=200;
				int c=a-b;
		System.out.println(c);
	}
	static void mul()
	{
		int a=5;
				int b=5;
		int c=a*b;
		System.out.println(c);
	}
	static void mod() // module gives output with reminder
	{
		int a=119;
				int b=5;
				int c=a%b;
				System.out.println(c);
				
	}
	static void div() // gives output of quotient
	{
		int a=10;
		int b=2;
		int c= a/b;
		System.out.println(c);
	}
public static void main(String[] args)
{
	add();
	sub();
	mul();
	mod();
	div();
}
	
}
