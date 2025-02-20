
import java.util.Scanner;
public class sumOfArray {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         // Get matrix dimensions
         System.out.print("Enter number of rows: ");
         int rows = scanner.nextInt();
         System.out.print("Enter number of columns: ");
         int cols = scanner.nextInt();
         // Declare a 2D array
         int[][] array = new int[rows][cols];
         System.out.println("Enter the elements of the array:");
         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < cols; j++) {
  System.out.printf("Element [%d][%d]: ", i, j);
 array[i][j] = scanner.nextInt();
 }
   }
int sum = 0;
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 sum += array[i][j];
 }
 }
  System.out.println("Sum of all elements in the 2D array: " + sum); 
scanner.close();
     }
 }


