package binary;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		int n,rev=0,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter no which is to be checked");
		n=sc.nextInt();
		int a=n;
		while(n!=0)
		{
			j=n%10;
			rev=rev*10+j;
			n=n/10;
		}
		if(a==rev)
			System.out.printf("%d is  palindrome",a);
		else
			System.out.printf("\n %d is not pallindrome",a);
		sc.close();
	}

}
