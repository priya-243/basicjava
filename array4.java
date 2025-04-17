package practiceProgram;
// WAP to copy one array into another array
import java.util.Arrays;
import java.util.Scanner;

public class array4 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of array");
		boolean [] answer=new boolean[s1.nextInt()]; // to print array size during runtime
	
		for(int i=0;i<=answer.length-1;i++)
		{
			System.out.println("Enter index position:"+i);
	answer[i]=s1.nextBoolean();  // to print index value at run time
		}
		System.out.println("the i/p array is:"+Arrays.toString(answer));
		s1.close();
		
		boolean [] answer1=new boolean[answer.length];  // copied array
		for(int j=0;j<=answer1.length-1;j++)
		{
			answer1[j]=answer[j];
		}
		
		/*answer1[0]=answer[0];
		answer1[1]=answer[1];
		answer1[2]=answer[2]; */
	System.out.println("The copied array is:"+Arrays.toString(answer1));
	
	s1.close();
	}

}
