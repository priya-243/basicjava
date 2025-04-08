package BasicJavaProgram;
public class staticpara
{
	static void studentdetails(String name,char gender,int rollno)
	{
		System.out.println(name);
		System.out.println(gender);
       System.out.println(rollno);
		
	}
	static void teacherdetails(String name,double salary)
	{
		System.out.println(name);
		System.out.println(salary);
	}
    static void classdetail(String standard)
    {
	System.out.println(standard);
    }
    static void Feedetails(double fees)
    {
	System.out.println(fees);
    }
 public static void main(String[] args)
 {
studentdetails("jashu",'m',245);
teacherdetails("malathi",2456.34);
classdetail("grade1");
Feedetails(44000);

}
}
