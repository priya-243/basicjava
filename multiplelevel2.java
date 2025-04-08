package inheritance;
interface product1
{
	void a();
	void b();
}
interface product2
{
	void c();
	void d();
	
}

public class multiplelevel2 implements product2,product1
{
public static void main(String[] args)
{
	multiplelevel2 m1=new multiplelevel2();
	m1.a();
	m1.b();
	m1.c();
	m1.d();
}

@Override
public void a() {
	// TODO Auto-generated method stub
	System.out.println("1");
}

@Override
public void b() {
	// TODO Auto-generated method stub
	System.out.println("2");
}

@Override
public void c() {
	// TODO Auto-generated method stub
	System.out.println("3");
}

@Override
public void d() {
	// TODO Auto-generated method stub
	System.out.println("4");
}
}
