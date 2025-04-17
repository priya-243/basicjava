package practiceProgram;

import java.util.Arrays;
import java.util.Scanner;

public class copypastearrayreverse 
{
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the size of array");
	int [] input=new int[s1.nextInt()];
	/*input[0]=10;
	input[1]=22;
	input[2]=33;*/
	int [] output=new int[input.length];
	for(int i=0,j=input.length-1;i<=input.length-1;i++,j--)
	{
		System.out.println("enter the value of index position:"+i);
		input[i]=s1.nextInt();
		output[j]=input[i];
	}
	
	System.out.println("input array is :"+Arrays.toString(input));
	System.out.println("input array is :"+Arrays.toString(output));
}
}
