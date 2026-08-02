package com.amit;
import java.util.*;

public class Search_in_a_sorted_2D_matrix
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
        System.out.println("Enter the Key :");
        int key = sc.nextInt();

        System.out.println("Your ans is :" + ans(mat , key));
    }

    private static boolean ans(int[][] mat , int key)
    {
        int a = 0;
        int b = mat[0].length-1;

        while(a < mat.length && b >= 0)
        {
            if(mat[a][b] == key)
            {
                return true;
            }
            else if(mat[a][b] > key)
            {
                b--;
            }
            else
            {
                a++;
            }
        }
        return false;
    }
}
