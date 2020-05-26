//Java Program demonstrating ArrayList - Integer type

import java.util.ArrayList;

public class ArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		Numbers.add(10);
		Numbers.add(15);
		Numbers.add(20);
		Numbers.add(25);

		for (int i : Numbers) 
		{
			System.out.println(i);
		}
	}
}

