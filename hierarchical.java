package inheritance;
class loginandout 
{
	void login()
	{
		System.out.println("login and logout");
	}
}

class hierarchical2 extends loginandout
{
	void a()
	{
		System.out.println("Testcase 1");
	}
}

public class hierarchical extends loginandout
{
	void b()
	{
		System.out.println("Testcase 2");
	}
	
	public static void main(String[] args) 
	{
		hierarchical h1=new hierarchical();
		h1.b();
		h1.login();
		hierarchical2 h2=new hierarchical2();
		h2.a();	

}
}
