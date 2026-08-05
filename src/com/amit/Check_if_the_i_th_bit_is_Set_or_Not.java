package com.amit;
import java.util.*;
public class Check_if_the_i_th_bit_is_Set_or_Not
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of i : " );
        int i = sc.nextInt();

        boolean ans = ((n & (1 << i))) != 0;
        System.out.println("Your ith bit is : " + ans);
    }
}
