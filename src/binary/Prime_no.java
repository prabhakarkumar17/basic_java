package binary;

import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) 
	{
		int n,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter the no to be checked");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println("no is prime no");
		else
			System.out.println(" no is not a prime no");
	}

}
