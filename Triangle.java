package BasicJavaProgram;

import java.util.Scanner;

public class Triangle 
{
public static void main(String[] args)
{
	//Area of Triangle is 0.5*b*h
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter base of triangle");
	int base=s1.nextInt();
	System.out.println("Enter height of triangle");
	int height=s1.nextInt();
	System.out.println("Area of Triangle");
	double area=0.5*Math.PI*base*height;
	System.out.println(area);
	
	//Circumstance of Triangle is a+b+c 

	System.out.println("Enter length of a");
	int a=s1.nextInt();
	System.out.println("Enter length of b");
	int b=s1.nextInt();
	System.out.println("Enter length of c");
	int c=s1.nextInt();
	System.out.println("Circumstance of Triangle");
	double circumstance=a+b+c;
	System.out.println(circumstance);
	
	
	
	
}

}
