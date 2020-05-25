//Static methods in Intefaces

interface Tree
{  
	void Tree();  
	static void fruit()
	{
		System.out.println("static method");
	}  
}

class Mango implements Tree
{

	public void Tree()
	{
		System.out.println("Tree full of leaves");
	}  
}

class Interface5
{

	public static void main(String args[])
	{  
		Tree t=new Mango();  
		t.Tree();  
		Tree.fruit();  
	}
}
 
