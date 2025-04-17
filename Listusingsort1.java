package practiceProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listusingsort1 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(40);
		l1.add(40);
		l1.add(15);
		l1.add(20);
		System.out.println("Before sort:"+l1);
		Collections.sort(l1);
		System.out.println("after sort:"+l1);
	}

}
