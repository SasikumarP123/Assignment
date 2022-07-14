package Assignment;

import java.util.Scanner;

public class Given_array 
{
void array()
{
	   int cnt=0;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the number");
       
       int k = in.nextInt();
       
       int a[] = {1,2,3,4,5,6};  
       
      
       
       for(int i=0; i < a.length-1; i++)
       {
         for(int j=i+1; j< a.length; j++)
         {
          if( (a[i]+a[j])%k==0)
          {
        	cnt++;
            System.out.print("["+a[i]+" "+a[j]+"]");
          }
              
       } 
       }
       System.out.println("\n\nTotal Pairs : "+cnt);
	
}
	public static void main(String[] args) 
	{
		Given_array g=new Given_array();
		g.array();

	}

}
