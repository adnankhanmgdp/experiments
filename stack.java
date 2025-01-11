import java.util.Scanner;
class StackDemo
{
    int Stack[];
    int sp;
    int size;
    StackDemo(int n)
    {
        size = n;
        Stack = new int[size];
        sp = -1;
    }




    void push(int value) throws Exception
    {
        if(sp < size-1)
        {
            sp = sp + 1;
            Stack[sp] = value;
        }
        else
        {
            throw new Exception("Stack Overflow");
        }
    }


    int pop() throws Exception
    {
        if(sp == -1)
        {
            throw new Exception("Stack Underflow");
        }
        int val = Stack[sp];
        sp = sp - 1;
        return val;
    }

 
    void peep() throws Exception
    {
        if(sp == -1)
        {
            throw new Exception("Stack underflow");
        }
        System.out.println(Stack[sp]);
    }















    public static void main(String[] args) {
        StackDemo ob = new StackDemo(10);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter value to push: ");
            int a = sc.nextInt();
            try {
                ob.push(a);
                System.out.println(a+" pushed into the stack. Stack pointer: "+ob.sp);
            } catch (Exception error) {
                // TODO: handle exception
                System.out.println(error);
            }
        }
    }
}