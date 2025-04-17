package practiceProgram;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// "store account number,accountholder name inside Map by passing the values at runtime for both account number, account holder
public class mapinterface5 
{
	public static void main(String[] args) 
{
		Scanner s1=new Scanner(System.in);
		Map<Integer,String> m1=new HashMap<Integer,String>();
		 System.out.print("Enter the number of accounts to add: ");
		 int n = s1.nextInt();

for(int i=0;i<n;i++)
{
	System.out.println("Enter account number: ");
	int accountno=s1.nextInt();
	
	System.out.print("Enter account holder name: ");
    String holderName = s1.next();
	
}

		
	}

}
