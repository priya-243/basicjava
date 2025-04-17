package practiceProgram;

import java.util.ArrayList;
import java.util.Collection;

public class collectionfw2
{
public static void main(String[] args) {
	Collection c1=new ArrayList(); //upcasting
	c1.add("priya");
	c1.add(true);
	c1.add(5000000);
	System.out.println(c1);
	
	Collection c2=new ArrayList();
	c2.addAll(c1);
	c2.add("jashu");
	System.out.println(c2);
}
}
