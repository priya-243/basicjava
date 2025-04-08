package BasicJavaProgram;

public class globalvariable2 
{
	int noofdays=365;
	static int earningperday=200;
	
	public static void main(String[] args)
	{
		earningperday=210; //update static variable
		
		globalvariable2 g1=new globalvariable2(); // creating object to call nonstatic varibable in main method
		
	//	g1.noofdays=366;  //update nonstatic variable in static method using object
		
		int totalearning=earningperday*g1.noofdays;  //with reference of object g1 calling nonstatic varaiable 
		
		System.out.println(totalearning);
	
		
	}

}
