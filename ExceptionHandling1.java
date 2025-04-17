package practiceProgram;
public class ExceptionHandling1 
{
public static void main(String[] args)
{
		
	try {
		int a=1/1;
		System.out.println(a);
	}
	catch(ArithmeticException w1)
	{
		System.out.println("Hanlded the exception");
	}
	
	
	
}
}
