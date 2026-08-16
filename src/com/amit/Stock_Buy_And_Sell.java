package com.amit;
import java.util.*;
public class Stock_Buy_And_Sell
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element of the array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int maxprofit = -1;
        int mincost = Integer.MAX_VALUE;
        int profit=0;

        for(int i=0;i<n;i++)
        {
            mincost = Math.min(mincost , arr[i]);
            profit = arr[i] - mincost;
            maxprofit = Math.max(maxprofit , profit);
        }

        System.out.println("this is your MaxProfit : " + maxprofit);
    }
}
