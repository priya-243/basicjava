package BasicJavaProgram;

public class Method_overloading 
{
	static void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void add(int a)
	{
		System.out.println(a+6);
	
	}
	static void add(int a,int b)
	{
		System.out.println(a+6+b);
	}
	void add(double a,double b)
	{
		System.out.println(a+b);
	}
	void add(double a) 
	{
		System.out.println(a+7);
	}
	void add(double b,int a)
	{
		System.out.println(a+b);
	}
public static void main(String[] args) 
{
	add();
	add(100);
	add(10,20);
	Method_overloading m1=new Method_overloading();
	m1.add(100.2,200.3);
	m1.add(200.3);
	m1.add(100.3,10);
	
}
}
