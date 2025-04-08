package BasicJavaProgram;
public class GlobalVariable1 {
	static int noofdays=365;
	double bankbalance;
	String name="priya r"; // static declaration
	static int a=100;
	static int b=200;
	static void add()
	{
		System.out.println(a+b);
	}
	void sub(int b,int a)
	{
		System.out.println(b-a);
	}
	void mul()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args)
	{
		add();
		GlobalVariable1 g1=new GlobalVariable1();
		g1.sub(b, a);
		g1.mul();
		noofdays=366; // update static global variable in main method
		System.out.println(noofdays);
		System.out.println(g1.bankbalance);
		System.out.println(g1.name);
		
	}

}
