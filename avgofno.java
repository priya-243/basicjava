package practiceProgram;
//Find out the average of all the numbers presnet in your array
import java.util.Arrays;
import java.util.Scanner;
public class avgofno
{ public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int sum=0; 
		System.out.println("Enter the size of array");
		int [] array=new int[s1.nextInt()];
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter the index position"+i);
			array[i]=s1.nextInt();
			sum=sum+array[i];
		}
System.out.println("The sum of array is:"+sum);
double average=sum/array.length;
System.out.println("The avaerage  of array is:"+average);
	}


}
