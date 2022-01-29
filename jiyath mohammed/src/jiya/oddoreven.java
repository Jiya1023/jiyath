package jiya;
import java.util.Scanner;

public class oddoreven {
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int num;
		num= scan.nextInt();
		if(num % 2==0)
			System.out.println(num+ "is a even number");
		else
			System.out.println(  num+"is a odd number");
	}

}
