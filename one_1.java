package inheritance;
class three_3
{	void c()
	{
		System.out.println("testcase 3");
	}	
}
class two_2 extends three_3
{	void b()
	{
		System.out.println("testcase 2");
	}	
}
public class one_1 extends two_2
{
	static void a()
		{
			System.out.println("testcase 1");
		}
	public static void main(String[] args)
	{
		a();
		one_1 o1=new one_1();
		o1.b();
		o1.c();
		
	}
}
