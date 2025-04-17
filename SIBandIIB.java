package practiceProgram;
public class SIBandIIB{
public static void main(String[] args){
	System.out.println("main method");
	new SIBandIIB(); //object creation to call constructor and IIB
}
SIBandIIB(){
	System.out.println("construcor");
}
{
	System.out.println("IIB");
}
static{
	System.out.println("SIB");
}

}
