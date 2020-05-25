//Java Program to demonstrate passing an array to method.  
public class Array2
{  
	static void min(int arr[])
	{  
		int min=arr[0];  
		for(int i=1;i<arr.length;i++)  
			if(min>arr[i])  
				min=arr[i];  

		System.out.println(min);  
	}  

	public static void main(String args[])
	{  
		int a[]={1,3,4,5};  
		min(a);//passing array to method  
	}
}  
