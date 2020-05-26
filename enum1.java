//Java Program to show the enum inside a class

public class enum1
{
	enum Level 
	{
		LOW,
		MEDIUM,
		HIGH
	}

	public static void main(String[] args) 
	{
		Level var = Level.MEDIUM; 
		System.out.println(var);
	}
}

