package practiceProgram;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class eg2
{public static void main(String[] args) {
	

	Set s1=new HashSet();
	s1.add(100); 
	s1.add(200); 
	s1.add(100);
	s1.add(null);
	s1.add(true);
	System.out.println(s1);
	Iterator  i1=s1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}

	Set s2=new LinkedHashSet();
	s2.add(10);
	s2.add(true);
	System.out.println(s2);
	Iterator i2=s1.iterator();
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	
	

}



}
