package binary;

import java.util.Scanner;

public class Perfect_no {

	public static void main(String[] args) 
	{
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the no ");
		n=sc.nextInt();
		for(int i=1;i<=n/2;i++)
		{
			if((n%i)==0)
				sum=sum+i;
		}
		if(sum==n)
			System.out.printf("\n %d is perfect no.",n );
		else
			System.out.println("better luck next time");

	}

}
