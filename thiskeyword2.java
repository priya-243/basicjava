package inheritance;

public class thiskeyword2 
{
	thiskeyword2(int a)
	{
		this(20,2.24);
		System.out.println("testcase 1");
	}
	thiskeyword2(int a,double b)
	{
		this("username1");
		System.out.println("testcase 2");
	}
	thiskeyword2()
	{
		this(10);
		System.out.println("testcase 3");
	}
	thiskeyword2(String un)
	{

	System.out.println("testcase 4");
	}
public static void main(String[] args)
{
	new thiskeyword2();	
}	
}
