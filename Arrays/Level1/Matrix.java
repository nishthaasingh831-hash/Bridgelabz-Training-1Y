import java.util.Scanner;
class Matrix 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] flatArray = new int[rows * cols];

        int index = 0; 
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < cols; j++) { 
                flatArray[index] = matrix[i][j]; 
                index++; 
            }
        }

        System.out.println("\nThe elements in the 1D array are:");
        for (int element : flatArray) {
            System.out.print(element + " ");
        }
    }
}