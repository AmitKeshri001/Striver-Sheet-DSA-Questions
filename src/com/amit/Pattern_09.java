package com.amit;
import java.util.*;
public class Pattern_09
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the col : ");
        int c = sc.nextInt();

        for(int i=1;i<=r;i++)
        {
            for(int k=0;k<=r-i;k++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=r-1;i>=1;i--)
        {
            for(int k=0;k<=r-i;k++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
