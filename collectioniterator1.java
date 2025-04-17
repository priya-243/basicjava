package practiceProgram;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class collectioniterator1 
{
	public static void main(String[] args)
	{
		Collection<String> c1=new ArrayList<String>();
		c1.add("priya");
		c1.add("Jashwanth");
		c1.add("thoddu");
		System.out.println(c1);
		Iterator<String> i1=c1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
