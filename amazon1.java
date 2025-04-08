package BasicJavaProgram;
public class amazon1
{
	amazon1(String un,String pwd)
	{
		System.out.println(un);
		System.out.println(pwd);
	}
amazon1(int age, char gender)
{
	System.out.println(age);
	System.out.println(gender);
}

amazon1()
{
	System.out.println("logged in");
}
amazon1(String so)
{
	System.out.println("log out");
}

public static void main(String[] args) 
{
	new amazon1("priya","pwd123"); // object creation for constructor
	new amazon1(20,'f');
	new amazon1();
	new amazon1("signout");
	
}
}
