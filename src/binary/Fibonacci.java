package binary;

public class Fibonacci
{

	public static void main(String[] args) 
	{
		int a=0,b=1,c;
		System.out.println("Welcome to the Fibonacci Series world");
		System.out.print(a+" " +b+" ");
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}