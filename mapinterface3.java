package practiceProgram;
import java.util.HashMap;
import java.util.Map;

//"WAP on MAP using methods like get(), containsKey(), containsValue(), putIfAbsent(), equals()"
public class mapinterface3 
{
public static void main(String[] args) {
	Map<String,Integer> m1=new HashMap<String,Integer>();
	m1.put("mouse", 20);
	m1.put("keyboard", 30);
	m1.put("printer", 10);
	System.out.println(m1);
	System.out.println(m1.get("mouse"));   //get()
	boolean a=m1.containsKey("mouse");  // containsKey()
	System.out.println(a);
	boolean b= m1.containsValue(30);  // containsValue()
	System.out.println(b);
	m1.putIfAbsent("headphones", 10); // putIfAbsent()
	System.out.println(m1);
	Map<String,Integer> m2=new HashMap<String,Integer>();
	m2.put("mouse", 20);
	boolean c=m2.equals(m1);  //equals()
	System.out.println(c);
	
}
}
