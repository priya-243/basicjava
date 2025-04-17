package practiceProgram;
// WAP to check if the given string is a Palindrome?
import java.util.Scanner;
public class palindrome2
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in); // user input
	String input=s1.next();
	String output="";
	
	for(int i=input.length()-1;i>=0;i--)
	{
		char a=input.charAt(i);
		output=output+a;
	}
	System.out.println("The reverse string is:"+output);
	if(input.equals(output))
	{
		System.out.println("The string is palindrome");
	}
	else
	{
		System.out.println("the string is not palindrome");
	}
}
}
