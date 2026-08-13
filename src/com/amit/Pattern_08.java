package com.amit;
import java.util.*;
public class Pattern_08
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the col : ");
        int c = sc.nextInt();

        for(int i=r;i>=0;i--)
        {
            for(int k=0;k<r-i;k++) {
                System.out.print(" ");
            }
            for(int j=2*i;j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
