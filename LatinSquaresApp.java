import java.io.IOException;

public class LatinSquaresApp 
{
	public static void main(String[] args) throws IOException
	{
		// The files that we will check are Latin squares
		String[] files = {"Test1.txt", "Test2.txt", "Test3.txt", "Test4.txt"};
		
		for (String file : files)
		{
			// Create a magic square
			LatinSquare ms = new LatinSquare(file);
			
			// Print out the matrix
			System.out.print(ms.toString());
			
			// Tell the user if is a magic square or not
			System.out.println(ms.isLatin());
			System.out.println("");
		}
	}
}
