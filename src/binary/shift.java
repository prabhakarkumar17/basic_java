package binary;

//LEFT SHIFT << and RIGHT SHIFT >> OPERATOR

public class shift {

	public static void main(String[] args) 
	{
		int a=8;	//25 -> 11001
		int b=a<<2;	/* left shift it will APPEND two zeros at the end
					i.e. a<<2 -> 1100100 */
		
		System.out.print("\n left shift = "+b);
		
		int c=a>>2;	/* right shift it will remove two bytes from last
					i.e. a>>2 -> 110 */
		
		System.out.print("\n right shift = "+c);

	}

}
