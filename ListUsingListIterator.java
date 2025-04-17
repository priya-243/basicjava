package practiceProgram;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListUsingListIterator 
{
	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("laptop");
		l1.add("monitor");
		l1.add("keyboard");
		System.out.println(l1);
		ListIterator<String> lit=l1.listIterator();
		System.out.println("Forward Iterator");
		while(lit.hasNext())
		{System.out.println(lit.next());
		}
		while(lit.hasPrevious())
		{System.out.println("Backward Iterator->"+lit.previous());
		}
	}

}
