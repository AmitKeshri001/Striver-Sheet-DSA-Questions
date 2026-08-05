package com.amit;
import java.util.*;
public class Set_Matrix_Zeroes
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of matrix : ");
        int n = sc.nextInt();
        System.out.println("Enter the columns of the matrix : ");
        int m = sc.nextInt();
        int[][] mat = new int[n][m];

        System.out.println("Enter the elements of the matrix : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your converted matrix is : ");

        helper(mat);

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void helper(int[][] mat)
    {
        int n = mat.length;
        int m = mat[0].length;
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j] == 0)
                {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(row[i] || col[j])
                {
                    mat[i][j] = 0;
                }
            }
        }

    }
}
