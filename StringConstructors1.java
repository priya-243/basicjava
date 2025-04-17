package practiceProgram;
public class StringConstructors1 
{
	public static void main(String[] args)
	{
		StringBuffer b1=new StringBuffer();
		StringBuffer b2=new StringBuffer("Hello");
		StringBuffer b3=new StringBuffer(50);
		System.out.println("String buffer default:"+b1.capacity());
		System.out.println("String buffer string:"+b2);
		System.out.println("String buffer capacity:"+b3.capacity());
		
		StringBuilder b4=new StringBuilder();
		StringBuilder b5=new StringBuilder("hi");
		StringBuilder b6=new StringBuilder(50);
		System.out.println("String Builder default:"+b4);
		System.out.println("String Builder string:"+b5);
		System.out.println("String Builder capacity:"+b6.capacity());
		
		
	}

}
