package practiceProgram;
import java.util.Enumeration;
import java.util.Vector;

public class enumeration1 
{
public static void main(String[] args)
{
	Vector v1=new Vector();
	v1.add("monitor");
	v1.add("keyboard");
	v1.add("printer");
	v1.add("cpu");
	System.out.println(v1);
	Enumeration e=v1.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	
	
	
}
}
