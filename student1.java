package inheritance;
class studentfee
{
	void fee()
	{
		System.out.println("fee=20000");
	}
}

public class student1 extends studentfee
{
	void name()
	{
		System.out.println("student name=priya");
	}
	public static void main(String[] args) 
	{
		student1 s1=new student1();
		s1.fee();
		s1.name();
		
	}

}
