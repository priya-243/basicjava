package inheritance;
class parentclass
{
	static int a=100;
	static int b=200;
	 void add()
	{
		System.out.println(a+b);
	}
}
public class childclass extends parentclass   
{
	static int a=100;
	static int b=200;
	static void sub()
	{
		System.out.println(b-a);
	}
public static void main(String[] args) 
{
	sub();
	childclass c1=new childclass();  // use object for childclass to call parent class method
	c1.add();
}
}
