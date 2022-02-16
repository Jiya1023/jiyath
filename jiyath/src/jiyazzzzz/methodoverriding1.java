package jiyazzzzz;

public class methodoverriding1 {
	class bike{
		
	
	
	void run()
	{
		System.out.println("bike runs.......");
		
	}
	class bus extends bike
	{
		void run()
		{
			System.out.println("bus runs.....");
			
		}
		class aeroplane extends bike
		{
			void run()
			{
				System.out.println("aeroplane flies.......");
				
			}
		
	


public  void main(String[]args)
{
 bike b = new bike();
 b.run();
}
}
	}
	}
}