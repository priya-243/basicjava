package BasicJavaProgram;

public class globalvariable3 
{
double pi=3.14;
int b=100;
void mul()
{
	System.out.println(pi*b);
}
public static void main(String[] args)
{
	globalvariable3 g1=new globalvariable3();
	
	System.out.println("the value of pi is");
	System.out.println(g1.pi); // printing non static variable pi inside static method using object
	g1.mul();  // calling non static method
	
	}
}
