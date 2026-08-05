package com.amit;

import java.util.*;

public class Count_Subarray_sum_Equals_K
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
        System.out.println("Enter the value of sum i.e K ");
        int k = sc.nextInt();

        System.out.println("The count of subarray with sum K is : " + Count(arr , k));
    }

    private static int Count(int[] arr, int k)
    {
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];

            if(map.containsKey(sum-k))
            {
                count += map.get(sum-k);
            }
            if(!map.containsKey(sum))
            {
                map.put(sum , 1);
            }
            else
            {
                map.put(sum , map.get(sum) + 1);
            }
        }

        return count;
    }
}
