// WAP to count the number of alpahebets, numeric letters,spaces and special characters used in the given String
package practiceProgram;
import java.util.Arrays;
public class count 
{
	static int  noofalpha=0;
	static int noofnumeric=0;
	static  int noofspaces=0;
	static int noofspecialchar=0;
public static void main(String[] args) 
{
	String input="K V no 2@@";
	char []array=input.toCharArray();
	System.out.println("input array is:"+Arrays.toString(array));
	
	for(int i=0;i<array.length-1;i++)
	{
		boolean b1=Character.isAlphabetic(array[i]);
		if(b1==true)
		{
			noofalpha++;
		}
		boolean b2=Character.isDigit(array[i]);
				if(b2==true)
				{
					noofnumeric++;
				}
	boolean b3=Character.isWhitespace(array[i]);
		if(b3==true)
		{
			noofspaces++;
		}
	}
		 noofspecialchar=input.length()-(noofalpha+noofnumeric+noofspaces);
	
		System.out.println("no of alphabets:"+noofalpha);
		System.out.println("no of spaces:"+noofspaces); 
		System.out.println("number of numeric:"+noofnumeric);
		System.out.println("noofspecial char:"+noofspecialchar);

	}
	
}


