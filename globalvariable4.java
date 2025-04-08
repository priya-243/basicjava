package BasicJavaProgram;

public class globalvariable4
{
	int noofdays=365;
	static double pi=3.14;
	
	public static void main(String[] args)
	{
		pi=3.16; // update static global variable
		globalvariable4 g1=new globalvariable4();
		g1.noofdays=366;  // update non static global variable
		System.out.println(pi);
		System.out.println(g1.noofdays);
}
}
