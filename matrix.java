// Take the input of matrix
// Display the original matrix
// Check whether the matrix is symmetric or not
// Print the sum of elements of left and right diagonals.

import java.util.Scanner;
class Matrix
{
    int mat[][], M;
    Matrix(int size)
    {
        M = size;
        mat = new int[M][M];
    }
    // Take the input of matrix
    void inputMatrix()
    {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in Matrix:");
        for(i = 0; i < M; i++)
        {
            for(j = 0; j < M; j++)
            {
                System.out.print("Enter element: ");
                mat[i][j] = sc.nextInt();
            }
        }
    }
    // Display the original matrix
    void display()
    {
        int i, j;
        for(i = 0; i < M; i++)
        {
            for(j = 0; j < M; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    // Check whether the matrix is symmetric or not
    void checkSymmetric()
    {
        int i, j;
        int flag = 0;
        int trans[][] = new int[M][M];
        for(i = 0; i < M; i++)
        {
            for(j = 0; j < M; j++)
            {
                trans[j][i] = mat[i][j];
            }
        }

        // check  if original matrix is equal to transpose
        outer: for(i = 0; i < M; i++)
        {
            for(j = 0; j < M; j++)
            {
                if(trans[i][j] != mat[i][j])
                {
                    flag = 1;
                    break outer;
                }
            }
        }

        if(flag == 0)
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Non-symmetric Matrix");
    }

    // Print the sum of elements of left and right diagonals.
    void sumDiagonals()
    {
        int sumL, sumR, i;
        sumL = 0; sumR = 0;
        for(i = 0; i < M; i++)
        {
            sumL = sumL + mat[i][i];
            sumR = sumR + mat[i][M-i-1];
        }
        System.out.println("Sum of elements of left diagonal="+sumL);
        System.out.println("Sum of elements of right diagonal="+sumR);
    }
    // Main function
    public static void main(String args[])
    {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size for square matrix: ");
        m = sc.nextInt();
        if(m > 2 && m < 10)
        {
            Matrix ob = new Matrix(m);
            ob.inputMatrix();
            ob.display();
            ob.checkSymmetric();
            ob.sumDiagonals();
        }
        else
        {
            System.out.println("Invalid size for matrix");
        }
    }
}