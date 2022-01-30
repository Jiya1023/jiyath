package jiya;
import java.util.Scanner;

public class eligibilitytovote {
	public static void main(String[]args)
	{
		Scanner vote = new Scanner(System.in);
		int num;
		System.out.println("enter the age::");
		num= vote.nextInt();
		if(num<=99)
		System.out.println("is eligible");
		else
			System.out.println("is not eligible");
		
		
}
}
