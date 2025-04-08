package BasicJavaProgram;
import java.util.Scanner;

public class Areaofcircle
{
	public static void main(String[] args)
	{
		//pi*r*r
		System.out.println("enter the value of radius");
		Scanner s1=new Scanner(System.in);
				int r=s1.nextInt();
		System.out.println("Area of circle");
		double area=Math.PI*r*r;
				System.out.println(area);
				
		//2*pi*r
				System.out.println("Enter circumstance of circle");
				Scanner s2=new Scanner(System.in);
				int r1=s2.nextInt();
				System.out.println("circumstance of circle");
				double circumstance=2*Math.PI*r;
				System.out.println(circumstance);
		
	}

}
