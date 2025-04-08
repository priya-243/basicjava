package inheritance;
class precondition 
{
	final void login() //avoid methodoverload using final keyword
	{
		System.out.println("login using mobile number");
	}
}

public class methodoverload2 extends precondition
{
	void loginwithemailid()
	{
		System.out.println("login using email id");
	
	}
	public static void main(String[] args)
{
		methodoverload2 m1=new methodoverload2();
		m1.login();
		m1.loginwithemailid();
		
	}

}
