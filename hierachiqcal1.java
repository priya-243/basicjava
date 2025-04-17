package practiceProgram;
class abc
{
	 void method1()
	{
		System.out.println("method1");
	}
}
class fgh extends abc
{
	void method3()
	{
		System.out.println("method3");
	}
}
class cde extends abc
{
	 void method2()
		{
			System.out.println("method2");
		}
}

public class hierachiqcal1 extends abc
{
public static void main(String[] args)
{
	hierachiqcal1 h1=new hierachiqcal1();
	h1.method1();

	
	cde c1=new cde(); // child class object call child class and parent class method
	c1.method2();
	c1.method1();
	
	fgh f1=new fgh();
	f1.method3();
	f1.method1();
	
}
}
