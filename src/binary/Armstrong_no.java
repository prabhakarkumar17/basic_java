package binary;

import java.util.Scanner;

public class Armstrong_no {

	public static void main(String[] args) 
	{
		int n,a,sum=0,x;
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the no");
		n=sc.nextInt();
		x=n;
			
		while(n!=0)
			{
				a=n%10;
				sum=sum+(a*a*a);
				n=n/10;
			}
			
		if(sum==x)
			System.out.printf("\n %d no is armstrong no",x);
		else
			System.out.printf("\n %d in not a armstrong no.",x);
		
	
		
		sc.close();
		

	}

}
