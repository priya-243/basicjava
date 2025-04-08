package inheritance;
interface abc
{
	void login1();
	void login2();
}
interface bcd extends abc
{
	void login3();
	void login4();
}
public class multiplelevel1 implements abc,bcd
{
	public static void main(String[] args)
	{
		multiplelevel1 m1=new multiplelevel1();
		m1.login1();
		m1.login2();
		m1.login3();
		m1.login4();
	}

	@Override
	public void login1() {
		// TODO Auto-generated method stub
		System.out.println("Testcase 1");
	}

	@Override
	public void login2() {
		// TODO Auto-generated method stub
		System.out.println("Testcase 2");
	}

	@Override
	public void login3() {
		// TODO Auto-generated method stub
		System.out.println("Testcase 3");
	}

	@Override
	public void login4() {
		// TODO Auto-generated method stub
		System.out.println("Testcase 4");
	}

}
