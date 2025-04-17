package practiceProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class CheckedException1 
{
public static void main(String[] args) throws MalformedURLException, InterruptedException, FileNotFoundException 
{
	for(int i=0;i<10;i++)
	{
		Thread.sleep(2000);
		System.out.println(i);
		
		URL u1=new URL("https://www.google.com");
	
		FileInputStream f1=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\automationtesting\\excelsheet\\priya.xlsx");
		
	}
}
}
