package com.amit;
import java.util.*;
public class Pattern_11
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows : ");
        int r = sc.nextInt();

        int a;
        boolean rev = false;
        for(int i=1;i<=r;i++)
        {
            if(!rev)
            {
                a=1;
                for(int j=1;j<=i;j++)
                {
                    System.out.print(a + " ");
                    a=1-a;
                }

            }
            else
            {
                a=0;
                for(int j=1;j<=i;j++)
                {
                    System.out.print(a + " ");
                    a=1-a;
                }

            }
            rev = !rev;
            System.out.println();

        }
    }
}
