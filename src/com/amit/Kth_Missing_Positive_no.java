package com.amit;
import java.util.*;
public class Kth_Missing_Positive_no
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K : ");
        int k = sc.nextInt();

        HashSet<Integer> set= new HashSet<>();
        for(int num : arr)
        {
            set.add(num);
        }

        int i=1;
        int count=0;
        while(count < k)
        {
            if(!set.contains(i))
            {
                count++;


                if(count == k)
                {
                    System.out.println("Your kth missing positive number is : " + i);
                }
            }
           i++;
        }
        System.out.println("End !");
    }
}
