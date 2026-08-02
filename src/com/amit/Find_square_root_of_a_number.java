package com.amit;
import java.util.*;
public class Find_square_root_of_a_number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = sc.nextInt();

        System.out.println("The Ans is : " + ans(n , 3));
    }
    public static double ans(int n , int p)
    {
        int start=0;
        int end=n;
        int root=-1;
        while(start <= end)
        {
            int mid = start +(end-start)/2;

            if((long)(mid * mid) == n)
            {
                return mid;
            }

            else if((long)(mid * mid) < n)
            {
                root = mid;
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }

        double ans = root;
        double incr = 0.1;

        for(int i=0;i<p;i++)
        {
            while(ans * ans <= n)
            {
                ans += incr;
            }
            ans -= incr;
            incr = incr/10;

        }

        return ans;
    }

}
