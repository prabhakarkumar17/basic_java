package binary;

import java.util.Scanner;

public class User_entry 
{

	public static void main(String[] args) 
	{
		int a=0,b=1,n,c=0;
		System.out.print(a+ " " +b);
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter value of n ");
		n=sc.nextInt();
		while(c<=n)
		{
			c=a+b;
			System.out.print(c);
			a=b;
			b=c;
		}
		sc.close();
	}
	

}
