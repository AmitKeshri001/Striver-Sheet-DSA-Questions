package com.amit;
import java.util.*;
public class Duplicate_the_array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(helper(arr)));

    }
    public static int[] helper(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int[2*n];

        int i=0;
        int j=n+i;

        while(i<n)
        {
            temp[i] = arr[i];
            temp[j] = arr[i];
            i++;
            j=n+i;
        }

        return temp;
    }
}
