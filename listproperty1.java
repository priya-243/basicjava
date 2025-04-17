package practiceProgram;
import java.util.ArrayList;
import java.util.List;
public class listproperty1 
{
public static void main(String[] args) 
{
	List<String> l1=new ArrayList<String>();
	l1.add("priya"); l1.add("jashu"); // add(object)
	l1.add(0, "sam");  // add(index,object)
	System.out.println(l1);
	List<String> l2=new ArrayList<String>();
	l2.add("srisai"); l2.add("viji");
	l2.addAll(l1);  //addall
	System.out.println(l2);
	l2.addAll(2,l1);
 l2.remove("viji");  //remove(Object)
 System.out.println(l2);
 l2.remove(0);  //remove(collection)
 System.out.println(l2);
 l2.removeAll(l1); //removeall
 System.out.println(l2);
 
}
}
