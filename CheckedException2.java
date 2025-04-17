package practiceProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class CheckedException2 {
	public static void main(String[] args)  throws InterruptedException, MalformedURLException, FileNotFoundException
	{
		for(int i=10;i<10;i++)
{
	System.out.println(i);
	Thread.sleep(1000);   //InterruptedException
	
	URL url=new URL("http://www.google.com");  // MalformedURLException
	
	FileInputStream f1=new FileInputStream("C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\automationtesting");
}
	}

}
