package Assignment;

import java.util.Scanner;

public class FibonnaciPrime 
{

	public static void main(String[] args) 
	{
		 FibonnaciPrime fp=new  FibonnaciPrime();
		 fp.fibonacci();

	}

	private void fibonacci() 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		int a=0,b=1,c=0,k=0;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			
			if(c>n)
			{
				break;
			}
			else
			{
				for(int j=1;j<=c;j++)
				{
					if(c%j==0)
					{
						k++;
					}
				}
				if(k==2)
				{
					System.out.print(c+" ");
				}
				a=b;
				b=c;
				k=0;
				
				
			}
			
			
			
		}


}
}
//fib num=0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//prime num= 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.



