package practiceProgram;
import java.util.Arrays;
// WAP to pass anything at Runtime using args variable in the main method
import java.util.Scanner;
public class array3 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("please enter the size of array");
	int rollno[]=new int[s1.nextInt()];  // size of array at run time 
	for(int i=0;i<=rollno.length-1;i++)
	{
		System.out.println("enter the value of index position:"+i);
		rollno[i]=s1.nextInt();  // array value at run time
	}
	
	System.out.println(Arrays.toString(rollno));
	s1.close();
}
}
