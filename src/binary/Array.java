package binary;

import java.util.Scanner;

public class Array {

	public static void main(String[] args)
	{
		int a[] = new int[5];	// Defining array
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the array");
		for(int i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
