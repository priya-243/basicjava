package practiceProgram;
// WAP on String Buffer using Append, insert, delete, substring, reverse, Capacity, replace
public class stringbuffer1 
{
public static void main(String[] args) {
	StringBuffer s1=new StringBuffer("School");
	System.out.println(s1.length()); //length
	System.out.println(s1.capacity()); //capcity  default16+6
	System.out.println(s1);
	s1.append(" name is Nav Bharath"); // append
    System.out.println(s1);
	s1.delete(0, 6);              // delete
	System.out.println(s1);
	s1.insert(0, "school");    //insert
	System.out.println(s1);
	String s2=s1.substring(6); // substring single index
	System.out.println(s2);
	String s3=s1.substring(0, 7); // substring double index
	System.out.println(s3);
	StringBuffer s4=new StringBuffer("Priya");
	System.out.println(s4.reverse()); // reverse
	StringBuffer s5=s4.replace(0, 5, "jashu");
	System.out.println(s5); //replace */
	
	
}
}