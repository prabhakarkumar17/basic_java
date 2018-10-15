package binary;

//IMPLEMENTATION OF VARARGS 

public class VarArgs 
{
   
	public static void main(String[] args)
	{
		Display obj = new Display(); // Object of Display class
		obj.show(5,6,7);			 // Passing values to the display class's method as VARARGS 
	}
}

    class Display
	{
		public void show(int ... a)	// With the ...(3 dots) varargs can be implemented
		{
			for(int i:a)
				System.out.println(i);
		}
		public void show(int a)
		{
		   System.out.println(a+ " in show a");
		}
	}

/* NOTE:- as while using varargs first of all control i.e. where the value is passing will search for original signature
 *  	  original function if the passed argument will match with the any argument in functio then it will execute 
 *        otherwise control will search for varargs
 */