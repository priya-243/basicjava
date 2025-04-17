package practiceProgram;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class mapinterface2
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
	System.out.println("value of m1:"+m2);
	
	System.out.println("Fetch the keys");
	// Set<String> s1=m1.keySet();
	for( String s1 :m1.keySet())
	System.out.println(s1);
	
	System.out.println("Fetch the keys");
	//Collection<Integer> i1=m1.values();
	for( Integer i1 :m1.values())
	System.out.println(i1);

	System.out.println("Fetch both keys and values");
	// Set<Entry<String,Integer>> s3=m1.entrySet();
	for(Entry<String,Integer> s3 :m1.entrySet())

	System.out.println(s3);
	
}

}
