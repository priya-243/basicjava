package practiceProgram;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listusingiterator1 
{
public static void main(String[] args) {
	List<String> l1=new ArrayList<String>();
	l1.add("ball");
	l1.add("bat");
	l1.add("toy");
	System.out.println(l1);
	Iterator<String> i1=l1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
}
}
