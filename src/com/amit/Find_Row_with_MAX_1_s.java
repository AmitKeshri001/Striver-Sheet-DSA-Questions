package com.amit;

import java.util.Scanner;
import java.util.*;
public class Find_Row_with_MAX_1_s
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows :");
        int r = sc.nextInt();
        System.out.println("Enter the no. of Col : ");
        int c = sc.nextInt();

        int[][] mat = new int[r][c];
        System.out.println("enter the elements of the matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Row with Max No. of 1's is : " + ans(mat) + "st");
    }

    private static int ans(int[][] mat)
    {
        int ans=-1;

        int max=0;

        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j] == 1)
                {
                    count++;
                }
            }
            if(count > max)
            {
                max = count;
                ans = i+1;
            }
            else if(count == max)
            {
                continue;
            }
        }

        return ans;
    }
}
