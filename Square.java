package BasicJavaProgram;
import java.util.Scanner;
public class Square
{
public static void main(String[] args)
{
	// Area of square is a*a
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of area");
	int a=s1.nextInt();
	double area=a*a;
	System.out.println("area of square");
	System.out.println(area);
	
	
	// Circumstance of square is 4a
	
	System.out.println("Enter the value  of area");
	int a1=s1.nextInt();
	double circumstance=4*a1;
	System.out.println("circumstance of square");
	System.out.println(circumstance);
}
}
