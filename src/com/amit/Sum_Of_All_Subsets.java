package com.amit;
import java.util.*;
public class Sum_Of_All_Subsets
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


        ArrayList<ArrayList<Integer>> result = helper(arr , new ArrayList<>() , 0);
        for (int i=0;i<result.size();i++)
        {
            System.out.println(result.get(i) + " ");
        }

        for(int i=result.size()-1;i>=0;i--)
        {
            ArrayList<Integer> list = result.get(i);
            System.out.print(Sum(list) + " ");
        }
    }

    public static int Sum(ArrayList<Integer> list)
    {
        int sum = 0;
        for(int i=0;i<list.size();i++)
        {
            sum += list.get(i);
        }

        return sum;
    }

    public static ArrayList<ArrayList<Integer>> helper(int[] arr , ArrayList<Integer> p , int index)
    {
        if(index == arr.length)
        {
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(p));
            return ans;
        }

        p.add(arr[index]);

        ArrayList<ArrayList<Integer>> left = helper(arr , p , index+1);

        p.remove(p.size()-1);

        ArrayList<ArrayList<Integer>> right = helper(arr , p , index+1);

        left.addAll(right);

        return left;
    }
}
