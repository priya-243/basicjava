package inheritance;
class super_3
{
	super_3(String name,double b)
	{
		System.out.println("supercall 3");
	}
	
}

class super_2 extends super_3
{
	super_2()
	{
super("priya",2.92);
		System.out.println("supercall 2");	
	
     }
}
public class super_1 extends super_2
{
	super_1()
	{
		super();
		System.out.println("supercall 1");
	}
	public static void main(String[] args)
	{
		new super_1();
	}
}
