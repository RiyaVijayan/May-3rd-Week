//Program to demonstrate the addition of two matrices in java  
class Array4
{  
	public static void main(String args[])
	{  

		int a[][]={{1,2,3},{3,4,5}};  
		int b[][]={{5,4,3},{3,2,1}};  

		int c[][]=new int[2][3];  


		for(int i=0;i<a.length;i++)
		{  
			for(int j=0;j<a[i].length;j++)
			{  
				c[i][j]=a[i][j]+b[i][j];  
				System.out.print(c[i][j]+" ");  
			}  
			System.out.println();  
		}  

	}
}

