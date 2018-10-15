package binary;

//IMPLEMENTATION OF RANDOM CLASS

import java.util.Random;	//Pcakage of random class

public class RandomValue 
{

	public static void main(String[] args) 
	{
		int a[] = new int[20];	//Defined Array
		Random r = new Random();// Creating object of Random class
		
		for(int i=0;i<20;i++)
		{
			a[i]=r.nextInt(50);	//With the help of nextInt() value can be assigned within the range of 50
		}
		
		for(int j:a)
		{
			System.out.println(j);	//Displaying of the array
		}

	}

}
