package com.amit;

import java.util.*;

public class Print_the_matrix_in_spiral_manner
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix : ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        System.out.println("Enter the elements of the matrix : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        helper(mat , list);
        System.out.println("Your Spiral Traverse LIst is : " + list);
    }

    private static void helper(int[][] mat, ArrayList<Integer> list)
    {
        int top=0;
        int left=0;
        int right=mat[0].length-1;
        int bottom = mat.length-1;

        while(top < bottom && left < right)
        {
            for(int i=left;i<=right;i++)
            {
                list.add(mat[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++)
            {
                list.add(mat[i][right]);
            }
            right--;

            if(top <= bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }

            if(left <= right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    list.add(mat[i][left]);
                }
                left++;
            }
        }

        return;
    }
}
