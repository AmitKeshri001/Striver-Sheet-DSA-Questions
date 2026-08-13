package com.amit;
import java.util.*;
public class Pattern_06
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the cols : ");
        int c = sc.nextInt();

        for(int i=r;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
