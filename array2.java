package practiceProgram;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
// WAP on basic concepts of Array
public class array2
{
public static void main(String[] args) 
{
int rollno []=new int[3];

Scanner s1=new Scanner(System.in);

for(int i=0;i<=rollno.length-1;i++)
{
	System.out.println("Enter the index position of array:"+i);
	rollno[i]=s1.nextInt();
}
	System.out.println("The value of array is:"+Arrays.toString(rollno));
	
}
}
