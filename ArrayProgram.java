package practiceProgram;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ArrayProgram 
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of array");
try {
int [] rollno=new int[s.nextInt()];
	rollno[0]=10;
	rollno[1]=20;
	rollno[2]=30;
}
catch(NegativeArraySizeException c1)
{
	System.out.println("Size cannot be negative");
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the size of array and it must be positive");
	int [] rollno=new int[s1.nextInt()];
	rollno[0]=10;
	rollno[1]=20;
	rollno[2]=30;
}
catch(InputMismatchException c1)
{
	System.out.println("Size should be only number");
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the size of array and it must be positive");
	int [] rollno=new int[s1.nextInt()];
	rollno[0]=10;
	rollno[1]=20;
	rollno[2]=30;
}




}
}
