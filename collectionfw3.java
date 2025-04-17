package practiceProgram;
import java.util.Collection;
import java.util.ArrayList;
public class collectionfw3 
{
public static void main(String[] args) 
{
	Collection<Integer> c1=new ArrayList<Integer>(); //upcasting to acesss parent class property.
	c1.add(10); c1.add(20);  //add method       //convert childclass object to superclass type is called upcatinf
	Collection<String> c2=new ArrayList<String>();
	c2.add("priya"); c2.add("Jashu");
	Collection<Integer> c3=new ArrayList<Integer>();
	c3.add(40); c3.add(50);
System.out.println(c1);
c3.addAll(c1); //addall method
System.out.println(c3);
c3.remove(20); //remove method
System.out.println("after removing->"+c3);
c3.removeAll(c1); //removeall method
System.out.println("after removing c1->"+c3);

	boolean b1=c2.contains("priya");
	System.out.println(b1); //contains method
	boolean b2=c1.containsAll(c3);
	System.out.println(b2); //containsall method
	c2.clear();  //clear method
	System.out.println(c2);
	
	boolean b3=c2.isEmpty(); //isempty method
	System.out.println(b3);
	
	
	
	
}

}
