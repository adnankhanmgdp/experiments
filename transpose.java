// Java program to find the transpose of a 2D array

import java.util.Scanner;
class Transpose
{
    public static void main(String args[])
    {
        // Declaration of variables
        int i, j, m, n;
        Scanner sc = new Scanner(System.in); // Defining of Scanner object

        // Input size of array
        System.out.println("Enter m and n");
        m = sc.nextInt();
        n = sc.nextInt();

        // Declaration of original and transpose array
        int ar[][] = new int[m][n];
        int tp[][] = new int[n][m];

        // Input elements in array.
        System.out.println("Enter elements in array");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
            {
                System.out.print("Enter element: ");
                ar[i][j] = sc.nextInt();
            }
        }

        // Displaying original array
        System.out.println("Original Array: ");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

        // Find Transpose of the array
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
            {
                tp[j][i] = ar[i][j];
            }
        }

        // Displaying transpose array
        System.out.println("Transpose Array: ");
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < m; j++)
            {
                System.out.print(tp[i][j]+" ");
            }
            System.out.println();
        }
    }
}