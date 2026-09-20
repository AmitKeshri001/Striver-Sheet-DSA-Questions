package com.amit;
import java.util.*;
public class Pattern_14
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No. of rows : ");
        int r = sc.nextInt();

        for(int i=0;i<=r;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }

            for(int k=0;k<2*(r-i);k++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=r-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=2*(r-i);k++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
