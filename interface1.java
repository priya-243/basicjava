package inheritance;
interface one
{
	void login1();
	void login2();
}

public class interface1 implements one
{
	public static void main(String[] args)
	{
		interface1 i1=new interface1();
		i1.login1();
		i1.login2();
		
	}

	@Override
	public void login1() {
		// TODO Auto-generated method stub
		System.out.println("Testcase1");
	}

	@Override
	public void login2() {
		// TODO Auto-generated method stub
		System.out.println("Testcase2");
	}

}
