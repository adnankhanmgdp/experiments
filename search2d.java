// Java program to search for a value in 2D array.
import java.util.Scanner;
class ArraySearch
{
    public static void main(String args[])
    {
        int i, j=0, m, n, ele, flag = 0;
        Scanner sc = new Scanner(System.in); // Defining of Scanner object

        // Input size of array
        System.out.println("Enter m and n");
        m = sc.nextInt();
        n = sc.nextInt();

        // Declaration of original array
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

        System.out.print("Enter element to search in 2D array: ");
        ele = sc.nextInt();

        // search
        outer: for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
            {
                if(ele == ar[i][j])
                {
                    flag = 1;
                    break outer;
                }
            }
        }

        if(flag == 1)
        {
            System.out.println("Element found at ("+i+","+j+")"); // Element found at (1,2)
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}