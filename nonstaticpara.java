package BasicJavaProgram;

public class nonstaticpara 
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	void mul(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	void div(int a,int b)
	{
		System.out.println(a/b);
	}
	public static void main(String[] args) 
	{
		nonstaticpara n1=new nonstaticpara();
		n1.add(10, 20);
		n1.sub(20, 10);
		n1.mul(5, 5);
		n1.div(10, 20);
		
	}

}
