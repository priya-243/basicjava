package BasicJavaProgram;

public class AccessMethod {
	private static void add()
	{
		System.out.println("addition");
	}
	private static void div()
	{
		System.out.println("division");
	}
	public static void main(String[] args) {
		add();
		mul();
		System.out.println("I am main method");
		sub();
		div();
	}
	static void sub()
	{
		System.out.println("subtraction");
	}
	static void mul()
	{
		System.out.println("multiplication");
	}
	
}
