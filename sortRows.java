// Java program to sort each row of the 2D array
import java.util.Scanner;
class SortRows
{
    void sort(int a[])
    {
        int i, j, tmp, l;
        l = a.length;
        for(i = 0; i < l-1; i++)
        {
            for(j = 0; j < l-i-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int i, j, m, n;
        Scanner sc = new Scanner(System.in); // Defining of Scanner object

        // Input size of array
        System.out.println("Enter m and n");
        m = sc.nextInt();
        n = sc.nextInt();

        // Declaration of original and transpose array
        int ar[][] = new int[m][n];

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

        SortRows ob = new SortRows();

        // Sorting the rows
        for(i = 0; i < m; i++)
        {
            ob.sort(ar[i]);
        }

        // Display the sorted array
        System.out.println("\nSorted rows");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
            {
                System.out.print(ar[i][j]+ " ");
            }
            System.out.println();
        }
    }
}