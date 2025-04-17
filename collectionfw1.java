package practiceProgram;

import java.util.ArrayList;
import java.util.Collection;

public class collectionfw1
{
	public static void main(String[] args) {
		
Collection c1=new ArrayList(); // upcasting used to access parent class property only.
// converting child class object into superclass type
c1.add("priya");
c1.add(3.14);
c1.add(true);
c1.add(500);
System.out.println(c1);


	}

}
