package jiyazzzzz;

public class methodoverloading2 {
	public void display (String a )
	
	{
		System.out.println("the string is ::" +a);
		
	}
	public void display( String a , String b)
	{
		System.out.println(" the strings are::" +a +b);
		
	}
public static void main (String[]args)
{
	methodoverloading2 m2 = new methodoverloading2();
	m2.display("heyy");
	m2.display("hello"," everyone");
	
}
}
