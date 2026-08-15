package com.amit;
import java.util.*;
public class Pattern_16
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int r = sc.nextInt();

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<i;j++)
            {
                char ch = (char)(j + 'A');
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
