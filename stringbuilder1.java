package practiceProgram;
// WAP on String Builder using Append, insert, delete, substring, reverse, Capacity, replace
public class stringbuilder1 
{
public static void main(String[] args) 
{
	StringBuilder s1=new StringBuilder("College");
	System.out.println(s1.capacity()); // capacity
	System.out.println(s1.append("is S.K.R "));  //append;
System.out.println(s1.insert(7, "name")); //insert
System.out.println(s1.delete(7, 10));  //delete
System.out.println(s1.substring(11)); //substring
System.out.println(s1.substring(0, 7)); //substring
StringBuilder s2=new StringBuilder("Jashu");
System.out.println(s2.reverse()); //reverse
System.out.println(s2.replace(0, 3, "t")); //replace
}
}
