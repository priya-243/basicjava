package practiceProgram;
import java.util.HashSet;
import java.util.Set;
public class Setmethods1 {
	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(100); s1.add(200); System.out.println(s1); //add
		Set<Integer> s2=new HashSet<Integer>();
		s2.add(45); s2.addAll(s1); System.out.println(s2); //addall
		
		s2.remove(200); System.out.println(s2);  //remove
		s2.removeAll(s1); System.out.println(s2); //removeall
		boolean b1=s2.contains(45); System.out.println(b1); //contains
		boolean b2=s2.containsAll(s1); System.out.println(b2); //containsall
		
		
		
		
	}

}
