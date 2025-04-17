package practiceProgram;
// Wap on String Function using toupperCase,toLowerCase,length,charAt,trim concepts
public class string1
{	public static void main(String[] args)
	{
	String input="Priya R";
	int size=input.length(); // find out length
	System.out.println("size of the string:"+size);
	System.out.println(input.toLowerCase());  // to lowercase
	System.out.println(input.toUpperCase());  // to uppercase
 
	char a=input.charAt(3); //charAt
	System.out.println(a);
	
	String input1="  I am going to park  ";  //trim function
	System.out.println(input1);
	String output1=input1.trim();
	System.out.println(output1);
		
	}

	


}
