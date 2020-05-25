/* Java class which is a fully encapsulated class  
   It has a private data member and getter and setter methods
 */

package mypack;

class Student
{  
	private String name;  
	public String getName()
	{  
		return name;  
	}  
	public void setName(String name)
	{  
		this.name=name;  
	}  
}
class Encapsulation
{  
	public static void main(String[] args)
	{  

		Student s=new Student();  

		s.setName("LGSI");  

		System.out.println(s.getName());  
	}  
}
  
