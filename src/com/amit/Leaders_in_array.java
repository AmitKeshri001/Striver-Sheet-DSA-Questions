package com.amit;
import java.util.*;
public class Leaders_in_array
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

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(helper(arr , list));
    }

    private static ArrayList<Integer> helper(int[] arr, ArrayList<Integer> list)
    {
        int leader = arr[arr.length-1];
        list.addFirst(leader);

        for(int i=arr.length-2;i>=0;i--)
        {
            int a = arr[i];
            if(a>leader)
            {
                leader = a;
                list.addFirst(leader);
            }
        }

        return list;
    }


}
