package practiceProgram;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetusingIterator {
	public static void main(String[] args) {
		Set s1=new HashSet();
		s1.add("priya");
		s1.add(90);
		s1.add(20.19);
		System.out.println(s1);
		Iterator i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
