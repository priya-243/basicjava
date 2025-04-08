package inheritance;
class googleauth
{
	googleauth()
	{
		System.out.println("I am constructtor 2");
	}
}

public class scsnonpara extends googleauth
{
	scsnonpara()
	{
		super();
		System.out.println("I am constructtor 1");
	}
public static void main(String[] args)
{
	new scsnonpara();
	
}
}
