import java.util.Scanner;
import java.util.InputMismatchException;
public class TransposeOfMatrix{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter no.of rows : ");
			int rows = sc.nextInt();

			System.out.print("\nEnter no.of columns : ");
			int cols = sc.nextInt();

			int arr[][] = new int[rows][cols];

			System.out.println("\nEnter the elements : ");
			takeInput(arr,rows,cols,sc);

			System.out.println("\nBefore Transposing");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

			printArrayInMatrixForm(arr,rows,cols);

			int transposeMatrix[][] = transposeMatrix(arr,rows,cols);

			System.out.println("\nAfter Transposing");
			System.out.println("~~~~~~~~~~~~~~~~~~~~");
			printArrayInMatrixForm(transposeMatrix,cols,rows);


		}catch (InputMismatchException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void takeInput(int arr[][] , int rows,int cols,Scanner sc){

		for (int i = 0 ; i < rows; ++i) {

		    for (int j = 0 ; j < cols ; ++j) {
		    		
		    		arr[i][j] = sc.nextInt();
		    	}	
		}
	}
	public static void printArrayInMatrixForm(int arr[][],int rows,int cols){

		for (int i = 0 ; i < rows ; ++i) {
			
			for (int j = 0 ; j < cols ; ++j) {
				
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static int[][] transposeMatrix(int arr[][],int rows,int cols){

		int transposeMatrix[][] = new int[cols][rows];

		for (int i = 0; i < cols ; ++i) {
			
			for (int j = 0; j < rows ; ++j) {
				
				transposeMatrix[i][j] = arr[j][i];
			}
		}

		return transposeMatrix;
	}
}