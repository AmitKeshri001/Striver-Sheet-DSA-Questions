package com.amit;
import java.util.*;
public class Rotate_Image_by_90_degree
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of matrix : ");
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

        System.out.println("Your rotated matrix is : " );

        helper(mat);

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void helper(int[][] mat)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for(int j=0;j<mat[0].length;j++)
        {
            for(int i=mat.length-1;i>=0;i--)
            {
                list.add(mat[i][j]);
            }
        }

        int k=0;
        for(int i=0;i<mat.length;i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = list.get(k);
                k++;
            }
        }
    }
}
