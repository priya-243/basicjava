package BasicJavaProgram;
public class nestedifelse {
	public static void main(String[] args)
	{
		int a= 100;
		int b=200;
		
	    if(a>b)
		{
			System.out.println("A is Greater");
		}
		if(a<b)
		{
			System.out.println("B is greater");
		}
		if(a==b)
		{
			System.out.println("a and b are equal");
		}

		if(a<=b)
		{
			System.out.println("A is lesser than or eqval to B");
		}
		if(a>=b)
		{
			System.out.println("A is greater than or eqval to B");
		}
		else if(a!=b)
		{
			System.out.println("a and b are not eqval");
		}
	}

}
