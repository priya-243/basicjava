package practiceProgram;
// WAP to reverse a string
public class reversestring1 
{
	public static void main(String[] args)
	{
		String input="mouse";
		String output="";
		for(int i=input.length()-1;i>=0;i--)   
		{
			char a=input.charAt(i);
			output=output+a;
			// System.out.println(output); //print on 5 lines	
		}
		System.out.println("the output of the reverse string is:"+output); // print single line
	}

}
