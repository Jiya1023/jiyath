package jiya;
import java.util.Random;

public class random {
	public static void main(String[]args)
	{
		Random  ra = new Random();
		for(int i =1; i<= 10; i++)
	
	{
		System.out.println(ra.nextInt(100));
	}

}
}