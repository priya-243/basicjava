package inheritance;
abstract class googleauth3
{
	abstract void a();
	abstract void b();
}
abstract class googleauth2 extends googleauth3
{
	abstract void c();
	abstract void d();
}


public class abstract2 extends googleauth2
{
	
public static void main(String[] args)
{
	abstract2 a1=new abstract2();
	a1.a();
	a1.b();
	a1.c();
	a1.d();
}

@Override
void c() {
	// TODO Auto-generated method stub
	System.out.println("Testcase 3");
}

@Override
void d() {
	// TODO Auto-generated method stub
	System.out.println("Testcase 4");
}

@Override
void a() {
	// TODO Auto-generated method stub
	System.out.println("Testcase 1");
}

@Override
void b() {
	// TODO Auto-generated method stub
	System.out.println("Testcase 2");
}
}
