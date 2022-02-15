package jiyazzzzz;

public class methodoverloading1 {
	


 public int sum (  int x , int y)
	{
		 return( x + y);
		 
	}
	
 public int sum (int x , int y ,int l)
 {
	 return(x+y+l);
	 
 }
	public static void main (String[]args)	
	{
		methodoverloading1 ml = new methodoverloading1();
		
		System.out.println (ml.sum(6, 78));
		System.out.println(ml.sum(89, 90,80));
		
	}
		
		
	}

	


