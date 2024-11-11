class DiagonalSum
{
    public static void main(String args[])
    {
        int m, i, sum;
        int ar[][] = {
            {2, 1, 9},
            {8, 5, 3},
            {7, 6, 4}
        };
        m = ar.length;
        for(i = 0; i < m; i++)
        {
            sum = ar[i][i] + ar[i][m-i-1];
            System.out.println(sum);
        }
    }
}