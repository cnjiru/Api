import java.io.*;
import java.util.*; 
public class MatrixMultiplication{
	public static void main(String [] args){	
		int array[][] = new int[3][3];
     		int array1[][] =new int[3][3];
     		int array2[][] = new int[3][3];
     		Scanner s=new Scanner(System.in);
		System.out.println("Enter values for Matrix 1....");
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				System.out.println("Matrix 1st ["+i+"]["+j+"]:");
				array[i][j]=s.nextInt();
			}	
			//System.out.println(array);
		}
		System.out.println("Matrix1 is "+Arrays.deepToString(array));
		System.out.println("Enter values for Matrix 2.......");
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				System.out.println("Matrix 1st ["+i+"]["+j+"]:");
				array1[i][j]=s.nextInt();
			}	
			//System.out.println(array);
		}
		System.out.println("The matrix is "+Arrays.deepToString(array1));
		System.out.println("Multiplying.......");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				array2[i][j]=array2[i][j]+array[i][j]*array1[i][j];
			}
		}

		System.out.println("Results......."+Arrays.deepToString(array2));
	}
}
