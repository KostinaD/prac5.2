package prac52;

import java.util.Scanner;

public class Main
{
    public static String recursion(int a, int b)
    {
        if (a > b)
        {
            if (a == b)
            {
                return Integer.toString(a);
            }
            return a + " " + recursion(a - 1, b);
        }
        else
        {
            if (a == b)
            {
                return Integer.toString(a);
            }
            return a + " " + recursion(a + 1, b);
        }
    }
    public static void main(String[] args)
    {
        System.out.println(recursion(25, 10));
        System.out.println(recursion(10, 25));
    }
}
