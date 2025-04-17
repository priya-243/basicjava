package practiceProgram;

public class thiskeyword1 {
	int empid; double salary; String name;
	void empdetails(int empid,double salary,String name)
	{
		System.out.println("emp id is:"+empid);
		System.out.println("emp salary is:"+salary);
		System.out.println("emp name is:"+name);
	}
	public static void main(String[] args)
	{ 
		thiskeyword1 t1=new thiskeyword1();
		t1.empdetails(56,45000,"priya");
		
	}

}
