package practiceProgram;

public class ExceptionArrayIndexoutofbounce {
	public static void main(String[] args) 
	{
		try
		{
	int [] arr=new int[5];
	arr[5]=100;
		}
	
		catch (ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Exception handled");
		}	
	}	
}
