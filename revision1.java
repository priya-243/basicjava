package BasicJavaProgram;
class grandparent 
{
	void add()
	{
		System.out.println("add1");
	}
	void sub()
	{
		System.out.println("sub1");
	}
}
class parent extends grandparent
{
	void add()
	{
		super.add();
		System.out.println("add2");
	}
	void sub()
	{
		super.sub();
		System.out.println("sub2");
	}
	
}
public class revision1 extends parent
{
void add()
{
	super.add();
	System.out.println("add3");
}
void sub()
{
	super.sub();
	System.out.println("sub3");
}
public static void main(String[] args)
{
	revision1 r1=new revision1();
	r1.add();
	r1.sub();
}
}
