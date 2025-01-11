// Spy number
// Eg: 1142
// 1 + 1 + 4 + 2 = 8
// 1 x 1 x 4 x 2 = 8

import java.util.Scanner;
class SpyNumber
{
    boolean checkSpy(int n)
    {
        int sum, prod, d;
        sum = 0; prod = 1;
        while(n > 0)
        {
            d = n % 10;
            sum = sum + d;
            prod = prod * d;
            n = n /10;
        }
        return sum == prod;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        SpyNumber ob = new SpyNumber();
        if(ob.checkSpy(n))
        {
            System.out.println(n+" is Spy number");
        }
        else
        {
            System.out.println(n+" is not Spy number");
        }
    }
}