package BasicJavaProgram;

public class nonstatic3 {
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
		nonstatic3 n=new nonstatic3();
		n.add();
		n.sub();
		n.mul();
		
	}

}
