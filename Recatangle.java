package BasicJavaProgram;
import java.util.Scanner;
public class Recatangle {
	public static void main(String[] args)
	{
		// Area of Rectangle is a*b
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s1.nextInt();
		System.out.println("Enter b value");
		int b=s1.nextInt();
		System.out.println("Area of Rectangle is");
		double area=a*b;
		System.out.println(area);
			
		// Circumstance of Rectangle is a1(a1+b1)
		System.out.println("Enter a1 value");
		int a1=s1.nextInt();
		System.out.println("Enter b1 value");
		int b1=s1.nextInt();
		System.out.println("circumstance of Rectangle is");;
		double circumstance=a1*a1+b1;
		System.out.println(circumstance);
		s1.close();
		
	}	
}
