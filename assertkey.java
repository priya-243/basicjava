package BasicJavaProgram;

public class assertkey {
	public static void main(String[] args) {
		int age = 10;
		assert age >= 18 : "sorry your age is less";		
		// System.out.println("I can vote"); condition not matching, it will terminate
		// the program
		System.out.println("Age limit is less");
	}
}
