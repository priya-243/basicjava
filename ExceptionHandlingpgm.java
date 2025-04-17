package practiceProgram;

public class ExceptionHandlingpgm 
{
public static void main(String[] args) {
	try
	{
	int a=1/0;
	System.out.println(a);
	}
	catch(ArithmeticException w1)
	{
		System.out.println("handled the exception");
	}
	finally
	{
		System.out.println("Arithmetic operation");
	}
}
}
