package inheritance;
class student_fee
{
	void fee()
	{
		System.out.println("fee=20000");
	}
}
 class student_name extends student_fee
{
	void name()
	{
		System.out.println("student name is priya");
	}
}

public class studentdetail extends student_name
{
	void studentclass()
	{
		System.out.println("Grade1");
	}
public static void main(String[] args) 
{
	studentdetail s1=new studentdetail();
	s1.studentclass();
	s1.name();
	s1.fee();
	
}
}
