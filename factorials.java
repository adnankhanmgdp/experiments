// WAP in java to calculate the factorial of a number using recursion
import java.util.Scanner;
class Fun
{
    int factorial(int n) // recursive function to calculate factorial
    {
        if(n <= 1)
        return 1;
        else
        return n * factorial(n-1);
    }
    public static void main(String args[])
    {
        int n, f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        Fun ob = new Fun();
        f = ob.factorial(n);
        System.out.println("Factorial of "+n+" = "+f);
    }
}