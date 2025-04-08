package inheritance;
class precondition1 
{
	void login()
	{
		System.out.println("login using mobile number"); // parent class method got overriden
	}
}


public class methodoverride1 extends precondition1 
{
	void login()
	{
		System.out.println("login using email id");
	}
	public static void main(String[] args) 
	{
		methodoverride1 m1=new methodoverride1();
		m1.login();
		
	}

}
