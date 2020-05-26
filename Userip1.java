//Java program to illustrate  the User Input

import java.util.Scanner; // import the Scanner class 

class Userip1 
{
	public static void main(String[] args) 
	{
		Scanner Obj = new Scanner(System.in);
		String userName;

		// Enter username and press Enter
		System.out.println("Enter username"); 
		userName = Obj.nextLine();   

		System.out.println("Username is: " + userName);        
	}
}


