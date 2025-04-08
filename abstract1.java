package inheritance;

abstract class googleauth1 // abstract class
{
	abstract void login1(); //abstract method
}
public class abstract1 extends googleauth1
{
	void login()
	{
		System.out.println("login with otp");
	}
public static void main(String[] args)
{
	abstract1 a1=new abstract1();
	a1.login();
	a1.login1();

}
@Override
void login1() {
	// TODO Auto-generated method stub
	System.out.println("login without otp");
}
}
