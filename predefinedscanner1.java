package BasicJavaProgram;
import java.util.Scanner;
public class predefinedscanner1 {
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		String name=s1.next(); // accepts string and char values. scanner class does not have return type of char
		int a=s1.nextInt();
		byte b=s1.nextByte();
		
		boolean d=s1.nextBoolean();
		double e=s1.nextDouble();
		long f=s1.nextLong();
		short g=s1.nextShort();
		float c=s1.nextFloat();
		
		
	}

}
