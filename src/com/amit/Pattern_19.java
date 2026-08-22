package com.amit;
import java.util.*;
public class Pattern_19
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows : ");
        int n = sc.nextInt();

        for(int i=1;i<=n/2;i++)
        {
            for(int j=i;j<n/2;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            for(int j=1;j<=(2*(n/2-i)+1);j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--)
        {
            for(int j=i;j<n-1;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
