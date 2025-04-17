//WAP to check if 2 arrays are equals to each other at run time
package practiceProgram;
import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Arrays;
import java.util.Scanner;
public class arrayequal
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of array1");
		int [] array1=new int [s1.nextInt()];
		System.out.println("Enter the size of array2");
		int [] array2=new int [s1.nextInt()];
		for(int i=0;i<=array1.length-1;i++)
		{
			System.out.println("the value of array1 index position:"+i);
			array1[i]=s1.nextInt();
			System.out.println("the value of array2 index position:"+i);
			array2[i]=s1.nextInt();
		}
		System.out.println("the value of array1 is"+Arrays.toString(array1));
		System.out.println("the value of array1 is"+Arrays.toString(array2));
	
		boolean b1=Arrays.equals(array1, array2);
		if(b1==true)
		{
			System.out.println("both array are equal");
		}
		else
		{
			System.out.println("both array are not equal");
		}
	}

}
