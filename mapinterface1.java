package practiceProgram;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class mapinterface1 
{
public static void main(String[] args) {
	Map<String,Integer> m1=new HashMap<String,Integer> (); //upcasting
	m1.put("mouse", 10);  //put method
	m1.put("keyboard",20);
	m1.put("monitor", 30);
	m1.put("cpu",40);
	m1.put("printer", 10);
	System.out.println("value of m1:"+m1);
	Map<String,Integer> m2=new HashMap<String,Integer>();
	m2.put("Headphones", 50);
	m2.put("screenguard", 30);
	System.out.println("value of m2:"+m2);
	m2.putAll(m1);  //putall
	System.out.println(m2);	
	boolean b1=m2.isEmpty();  //isempty
	System.out.println(b1);
	m2.putIfAbsent("speaker", 10); //putifabscent
	System.out.println(m2);
	
	m2.remove("keyboard"); //remove(object)
	System.out.println(m2);
	m2.remove("mouse", 10); //remove(key,value)
	System.out.println(m2);	
m2.replace("Headphones", 10); //replace
System.out.println(m2); 
m2.replace("Headphones", 10, 20); //replace
System.out.println(m2);
m2.clear();  //clear
System.out.println(m2);

}
}

