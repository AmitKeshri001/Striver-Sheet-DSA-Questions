package com.amit;

import java.util.*;

public class Single_Number_III
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

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i], 1);
            }
            else
            {
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
        }

        for(int i=0;i<n;i++)
        {
            if(map.get(arr[i]) == 1)
            {
                System.out.print(arr[i] + " ");
            }
        }

        return;
    }
}
