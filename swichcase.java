package BasicJavaProgram;
import java.util.Scanner;
public class swichcase {
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int input=s1.nextInt();
		switch(input)
		{
		case 1:
			System.out.println("chrome browser automation");
			break;
		case 2:
			System.out.println("chrome browser automation");
			break;
		case 3:
			System.out.println("mozilla browser automation");
			break;
		default:
			System.out.println("wrong selection");
			
		}
		
	}

}
