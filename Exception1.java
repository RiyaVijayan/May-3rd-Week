//Java Program Illustrating divide by zero exception
public class Exception1
{  
	public static void main(String args[])
	{  
		try
		{  
			//code that may raise exception  
			int data=100/0;  
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}  

	}  
}  
