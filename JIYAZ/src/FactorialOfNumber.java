import java.util.Scanner;
public class FactorialOfNumber {
	public static void main(String[]args)
	{
int num;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any number::");
		
		int i ,fact =1;
	num = scan.nextInt();
		for(i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		System.out.println("factorial of" +num+ "is"   +fact);
	}
		
}
		
	

