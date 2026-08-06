package com.amit;
import java.util.*;
public class XOR_of_numbers_in_a_given_range
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower bound : ");
        int n = sc.nextInt();
        System.out.println("Enter the Upper bound : ");
        int m = sc.nextInt();

        int ans = XOR(m) ^ XOR(n-1);

        System.out.println("Your ans is : " + ans);
    }

    public static int XOR(int n)
    {
        if(n % 4 == 0)
        {
            return n;
        }
        else if(n % 4 == 1)
        {
            return 1;
        }
        else if(n%4 == 2)
        {
            return n+1;
        }
        else
        {
            return 0;
        }
    }
}
