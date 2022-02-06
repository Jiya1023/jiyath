
public class DefaultMethods { 
	public static void main(String[]args)
	{
		
	//strings
	
	String str ="animals";
	String st = "birds";
	System.out.println(str.compareTo(st));
	System.out.println(str.concat(st));
	System.out.println(str.indexOf("m"));
	System.out.println(st.lastIndexOf("r"));
	
	
	
	//Ascii value
	char ch= 'y';
char ch2='k';
	int num1 = ch;
	int num2 = ch2;
	System.out.println(num1 + ""+ num2);
	
	
	
	// integers
	int n1 = 456;
	int n2= 467;
	System.out.println(Math.max(n1, n2));
System.out.println(Math.min(n1, n2));
System.out.println(Math.decrementExact(n2));

}
}