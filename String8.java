package practiceProgram;
//"WAP on string functions using replace, replaceAll, substring, matches, repeat"
public class String8 
{public static void main(String[] args) 
	{
	String input="priya";
		boolean b1=input.matches("....."); // whether string contains 5 character
		System.out.println(b1);
		boolean b2=input.matches("(.*)t"); //check whether name ends with a or not
		System.out.println(b2);
		boolean b3=input.matches("p(.*)"); //string starts with p
		System.out.println(b3);
		String input1="badman";  // check whether the string contains man in it
		boolean b4=input1.matches("(.*)man(.*)");
		System.out.println(b4); 
		
		String input2="post";
		String output2=input2.replace('p', 'h'); // replace single char
		System.out.println(output2);
		
		String input3="priya rajendran";
		String output3=input3.replace("rajendran", "thoddu"); // replace char sequence
		System.out.println(output3);
		
		String input4="TPJ tpj 03";
		String output4=input4.replaceAll("[0-9]", ""); // remove numeric
		System.out.println(output4);
		String output5=input4.replaceAll("[a-z]", ""); // remove small letters
		System.out.println(output5); 
		String output6=input4.replaceAll("[A-Z]", "");  //remove capital letters
		System.out.println(output6); 
		
		String input7="jashwanth T";
		String output7=input7.substring(7);  //substring single index
		System.out.println(output7);
		
		String input8="jashwanth Thoddu";
		String output8=input8.substring(0, 5);   //substring double index
		System.out.println(output8);
				
	}

}
