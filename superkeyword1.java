package inheritance;
class method2
{
	void login(String un,String pwd)
	{
		System.out.println("login using mobile number");
	}
}

public class superkeyword1 extends method2
{
	void login(String un,String pwd)
	{
		super.login("priya", "priya123");  // super keyword to call parent class method
		System.out.println("login using email id");
	}

public static void main(String[] args)
{
	superkeyword1 s1=new superkeyword1();
	s1.login("priya", "priya123");
	
}
}
