package com.amit;
import java.util.*;
public class Print_all_Divisors_of_a_given_Number
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("All divisors of this number are : ");
        for(int i=1;i*i<=n;i++)
        {
            if(n%i == 0)
            {
                if(n/i == i)
                {
                    System.out.print(i + " ");
                }
                else
                {
                    System.out.print(i + " ");
                    System.out.print(n/i + " ");
                }
            }

        }
    }
}
