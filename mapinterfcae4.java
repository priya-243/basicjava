package practiceProgram;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
// "WAP to iterate a MAP using Iterator"
public class mapinterfcae4 
{
public static void main(String[] args) {
	Map<String,Integer> m1=new HashMap<String,Integer>();
	m1.put("monitor", 10);
	m1.put("headset", 20);
	m1.put("printer", 20);
	System.out.println(m1);
	Set<Map.Entry<String, Integer>> s2 = m1.entrySet();
	System.out.println(s2);
	System.out.println("iterating");
	 Iterator<Map.Entry<String, Integer>> s3 = s2.iterator();
	while(s3.hasNext())
	{
		System.out.println(s3.next());
	}
	

	
	
	
}
}
