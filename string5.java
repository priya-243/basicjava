package practiceProgram;

public class string5 
{
public static void main(String[] args)
{
	//remove numeric value to nothing /with name
	String input="K V no 2";
	String output=input.replaceAll("[0-9]", "priya");
	System.out.println(output);
	
	String output1=input.replaceAll("[0-9]", "");
	System.out.println(output1);
	
	//remove lowercase
	String input1="Priya Rajendran";
	String output2=input1.replaceAll("[a-z]", "");
	System.out.println(output2);
	
	
	//remove uppercase
	String output3=input1.replaceAll("[A-Z]", "");
	System.out.println(output3);
	
}
}
