package com.amit;
import java.util.*;
public class Pattern_12
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Rows : ");
        int r = sc.nextInt();

        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int k=1;k<= 2 * (r-i);k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }

            System.out.println();
        }


    }
}
