package practiceProgram;
import java.util.Arrays;
public class anagram1 
{
public static void main(String[] args) 
{
	String a="stop";
	String b="spot";

	if(a.length()!=b.length())
	{
		System.out.println("they are not anagram");
	}
	else
	{
		System.out.println("length of 2 string is not equal");
	char [] c1=a.toCharArray();
	char [] c2=b.toCharArray();
	System.out.println("before sorting:"+Arrays.toString(c1));
	System.out.println("before sorting:"+Arrays.toString(c2));
	Arrays.sort(c1);
	Arrays.sort(c2);
	System.out.println("after sorting:"+Arrays.toString(c1));
	System.out.println("after sorting:"+Arrays.toString(c2));
	boolean b1=Arrays.equals(c1,c2);
	if(b1==true)
	{
		System.out.println("They are anagram");
	}
	else
	{
		System.out.println("They are not anagram");
	}
}
}
}

