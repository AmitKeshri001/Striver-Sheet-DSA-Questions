package com.amit;
import java.util.*;
public class Pattern_18
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int r = sc.nextInt();

        for(int i=1;i<=r;i++) {
            for(int j=1;j<=r;j++)
            {
                if(i==1 || i==r || j==1 || j==r)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
