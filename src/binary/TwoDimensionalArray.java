package binary;

public class TwoDimensionalArray {

	public static void main(String[] args) 
	{
		int a[][] = new int[5][4];
		System.out.println(" 2d array is:");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				a[i][j]=i+j+2;
			}
		}
		for(int k[] : a)
		{
			for(int l : k)
			{
				System.out.print(l);
			}
			System.out.println();
		}
				

	}

}
