package BasicJavaProgram;
public class StaticNonstatic {
	public static void add()
			{
				int a=10; //local variable
				int b=5;
				int c=a+b;
				System.out.println(c);
			}
			public static void sub()
			{
				int a=10;
				int b=5;
				int c=a-b;
				System.out.println(c);
			}
			void mul()
			{
				int a=10;
				int b=5;
				int c=a*b;
				System.out.println(c);
			}
		 void mod()
		 {
			 int a=10;
				int b=5;
			 int c=a%b;
			 System.out.println(c);
		 }
		 public static void main(String[] args)
		 {
			 add();
			 sub();
	StaticNonstatic s=new StaticNonstatic();
		s.mod();
	 s.mul();
			
		}
}
