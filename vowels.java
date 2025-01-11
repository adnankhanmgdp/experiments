// A, E, I, O, U

import java.util.Scanner;
class Encode
{
    String word, new_word;
    int length;
    Encode()
    {
        word = "";
        new_word = "";
        length = 0;
    }
    void acceptWord()
    {
        // Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        word = sc.next().toUpperCase();
        length = word.length();
    }
    void nextVowel()
    {
        int i;
        char c;
        for(i = 0; i < length; i++)
        {
            c = word.charAt(i);
            if(c == 'A')
            {
                new_word = new_word + 'E';
            }
            else if(c == 'E')
            {
                new_word += 'I';
            }
            else if(c == 'I')
            {
                new_word += 'O';
            }
            else if(c == 'O')
            {
                new_word += 'U';
            }
            else if(c == 'U')
            {
                new_word += 'A';
            }
            else
            {
                new_word += c;
            }
        }
    }
    void display()
    {
        System.out.println("Original Word: "+word);
        System.out.println("New Word: "+new_word);
    }
    public static void main(String args[])
    {
        Encode ob = new Encode();
        ob.acceptWord();
        ob.nextVowel();
        ob.display();
    }
}