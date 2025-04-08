package BasicJavaProgram;

public class onenonstatic {
	void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}
	void sub()
	{
		int a= 100;
		int b=50;
		int c=a-b;
		System.out.println(c);
	}
	void mul()
	{
		int a=10;
		int b=2;
		int c=a*b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		onenonstatic o=new onenonstatic();
		o.add();
	}

}
