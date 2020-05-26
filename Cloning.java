//Program to demonstrate the Object Cloning

class Cloning implements Cloneable
{  
	int empid;  
	String name;  

	Cloning(int empid,String name)
	{  
		this.empid=empid;  
		this.name=name;  
	}  

	public Object clone()throws CloneNotSupportedException
	{  
		return super.clone();  
	}  

	public static void main(String args[])
	{  
		try
		{  
			Cloning e1=new Cloning(101,"Riya");  

			Cloning e2=(Cloning)e1.clone();  

			System.out.println(e1.empid+" "+e1.name);  
			System.out.println(e2.empid+" "+e2.name);  

		}
		catch(CloneNotSupportedException c){}  

	}  
} 

