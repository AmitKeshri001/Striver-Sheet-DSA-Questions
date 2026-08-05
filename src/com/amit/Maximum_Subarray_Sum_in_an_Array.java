package com.amit;

import java.util.*;

public class Maximum_Subarray_Sum_in_an_Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] arr = new int[n];


        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("The max sum of subarray is : " );

        int sum = 0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            sum += arr[i];

            if(sum > max)
            {
                max = sum;
            }
            if(sum < 0)
            {
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
