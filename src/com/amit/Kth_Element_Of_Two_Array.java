package com.amit;

import java.util.Scanner;
import java.util.*;
public class Kth_Element_Of_Two_Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of first array :");
        int n = sc.nextInt();
        System.out.println("Enter the size of sec array :");
        int m = sc.nextInt();

        System.out.println("Enter the elements of the sorted array 1 :");
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of the sorted array 2 :");
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K :");
        int k = sc.nextInt();
        if(k > n+m)
        {
            System.out.println("Wrong value of K !");
            return;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i : arr1)
        {
            list.add(i);
        }
        for(int i : arr2)
        {
            list.add(i);
        }

        Collections.sort(list);

        System.out.println("Your ans is : " + list.get((k-1)));
        return;
    }
}
