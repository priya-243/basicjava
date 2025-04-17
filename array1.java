package practiceProgram;
//WAP on basic concepts of Array
public class array1 {
public static void main(String[] args) 
	{
		int [] rollno=new int[3];
		rollno[0]=10;
		rollno[1]=20;
		rollno[2]=30;
		try {
		rollno[3]=30;
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			
		}
		
		
  /*   	String [] name=new String[4];
		name[0]="priya";
		name[1]="jashu";
		name[2]="samy";
	    System.out.println(name[0] +  " roll no is: "+rollno[0]);
		System.out.println(name[1] +  " roll no is: "+rollno[1]);
		System.out.println(name[2] +  " roll no is: "+rollno[2]); 
	*/	
	
		
	}

}
