package com.amit;
import java.util.*;
public class Next_Smaller_Element
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
        System.out.println(Arrays.toString(arr));
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            list.add(-1);
        }

        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && stack.peek() >= arr[i])
            {
                stack.pop();
            }

            if(!stack.isEmpty())
            {
                list.set(i , stack.peek());
            }

            stack.push(arr[i]);
        }

        System.out.println(list);
    }
}
