package com.amit;
import java.util.*;
public class Count_primes_in_range_L_to_R
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower bound : ");
        int n = sc.nextInt();
        System.out.println("Enter the upper bound : ");
        int m = sc.nextInt();

        int count=0;
        for(int i=n;i<=m;i++)
        {
            if(isPrime(i))
            {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isPrime(int n)
    {

        if(n==0 || n == 1 || n== 2)
        {
            return true;
        }

        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }

        return true;
    }
}
