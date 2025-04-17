package practiceProgram;
class logicclass
{
	private String un="priya@gmail.com";
	private int age=26;
	private double salary=45000;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getUn()
	{
		return un;
	}
	public void setUn(String un)
	{
		this.un=un;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
}
public class encapsulation
{
public static void main(String[] args)
{
logicclass l1=new logicclass();
l1.setUn("raje92@gmail.com");
System.out.println(l1.getUn());
l1.setAge(25);
System.out.println(l1.getAge());
	l1.setSalary(50000.26);
	System.out.println(l1.getSalary());
}
}
