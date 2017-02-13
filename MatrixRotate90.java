/*
 * Program to rotate given square matrix
 * 90, 180, and 270 degree. 
 */
import java.io.PrintStream;
import java.util.Scanner;

public class MatrixRotate90 {
	
	
	
	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		int val1,val2;
	
		System.out.println("Enetr number of rows and coulmns ");
		val1 = s.nextInt();

		
		int[][] inmat = new int[val1][val1];
		
		System.out.println("Enetr values for matrix");
		
		for (int i =0; i < val1; i++)
		{
			for (int j =0; j < val1; j++)
			{
				inmat[i][j] = s.nextInt();
				
			}
			
		}
		
		System.out.println("Input matrix");
		for (int i =0; i < val1; i++)
		{
			for (int j =0; j < val1; j++)
			{
				System.out.print("\t"+inmat[i][j] );
			}
			System.out.print("\n");
			
		}
		
		System.out.println("After Rotating 90 \u00b0");
		for (int i =0; i < val1; i++)
		{
			for (int j =val1-1; j >-1; j--)
			{
				System.out.print("\t"+inmat[j][i] );
			}
			System.out.print("\n");
			
		}
		
		System.out.println("After Rotating 180 \u00b0");
		for (int i =val1-1; i >-1; i--)
		{
			for (int j =val1-1; j >-1; j--)
			{
				System.out.print("\t"+inmat[i][j] );
			}
			System.out.print("\n");
			
		}
		
		System.out.println("After Rotating 270 \u00b0");
		for (int i =val1-1; i >-1; i--)
		{
			for (int j =0; j <val1; j++)
			{
				System.out.print("\t"+inmat[j][i] );
			}
			System.out.print("\n");
			
		}
	}

}
