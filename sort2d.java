// Sort the 2D array completely

import java.util.Scanner;
class Sort2D
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
    
    void display2D(int ar[][], int m, int n)
    {
        int i, j;
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }

    void convertDimension(int ar[][], int arr[], int m, int n, boolean to1D)
    {
        int i, j, count = 0;
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
            {
                if(to1D)
                arr[count++] = ar[i][j]; // 2D to 1D if to1D is true
                else
                ar[i][j] = arr[count++]; // 1D to 2D if to1D is false
            }
        }
    }
    public static void main(String args[])
    {
        int i, j, m, n, l;
        Scanner sc = new Scanner(System.in); // Defining of Scanner object

        // Input size of array
        System.out.println("Enter m and n");
        m = sc.nextInt();
        n = sc.nextInt();

        // Declaration of original array
        int ar[][] = new int[m][n];
        // Declaration of 1D array
        l = m * n;
        int arr[] = new int[l];

        Sort2D ob = new Sort2D();

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
        ob.display2D(ar, m, n);

        // convert the 2D array to 1D array
        ob.convertDimension(ar, arr, m, n, true);
        
        ob.sort(arr); // pass 1D array to sort

        // convert the 1D array to 2D array
        ob.convertDimension(ar, arr, m, n, false);

        // Displaying sorted 2D array
        System.out.println("Sorted 2D Array: ");
        ob.display2D(ar, m, n);
    }
}