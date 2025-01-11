// WAP in java to calculate the sum of digits of a number given by user.
import java.util.Scanner;
class Number
{
    int sumDigit(int n)
    {
        if(n == 0)
        return 0;
        else
        return (n % 10) + sumDigit(n / 10);
    }
    public static void main(String args[])
    {
        int n, s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        Number ob = new Number();
        s = ob.sumDigit(n);
        System.out.println("Sum of digits of "+n+" = "+s);
    }
}
