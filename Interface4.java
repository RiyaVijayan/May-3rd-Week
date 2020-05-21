//Default methods in Intefaces

interface Tree
{  
	void leaf();  
	default void fruit()
	{
		System.out.println("default method");
	}  
}

class Mango implements Tree
{

	public void leaf()
	{
		System.out.println("Tree full of leaves");
	}  
}

class Interface4
{

	public static void main(String args[])
	{  
		Tree t=new Mango();  
		t.leaf();  
		t.fruit();  
	}
}
 
