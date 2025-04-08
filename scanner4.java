package BasicJavaProgram;
import java.util.Scanner;
public class scanner4 
{
	static Scanner s1=new Scanner(System.in);
	static int a=s1.nextInt();
	static int b=s1.nextInt();
	void sub()
	{
		int c=a-b;
		System.out.println("sub is"+c);
	}
	void mul()
	{
		int c=a*b;
		System.out.println("mul:"+c);
		
	}
	public static void main(String[] args) 
	{
		scanner4 s4=new scanner4();
		s4.sub();
		s4.mul();
	}

}
