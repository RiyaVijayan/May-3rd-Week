//interface extends another interface

interface Print
{  
	void print();  
}  
interface Show extends Print
{  
	void show();  
}  

class Interface3 implements Show
{  
	public void print()
	{
		System.out.println("Hello");
	}  
	public void show()
	{
		System.out.println("Welcome");
	}


	public static void main(String args[])
	{  
		Interface3 obj = new Interface3();  

		obj.print();  
		obj.show();  

	}  
}
