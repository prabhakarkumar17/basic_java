package binary;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) 
	{
		
		      int a;
		      float b;
		      String s;
		     
		      Scanner in = new Scanner(System.in);  //Scanner is the class under java.util.Scanner package and System.in is themethod which will access the input device
		     
		      System.out.println("Enter an integer");
		      a = in.nextInt();	// nextInt()-> INTEGER			
		      System.out.println("You entered integer " + a);
		     
		      System.out.println("Enter a float");
		      b = in.nextFloat(); // nextFloat()-> FLOAT
		      System.out.println("You entered float " + b);  
		   
		      System.out.println("Enter a string");
		      s = in.nextLine(); //nextLine()-> STRING
		      System.out.println("You entered string " + s);
		   			

	}

}
