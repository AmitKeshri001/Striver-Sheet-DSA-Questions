package com.amit;
import java.util.*;
public class Set_the_rightmost_unset_bit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int ans = (n | (n+1));

        System.out.println("Your ans is  : " + ans);
    }
}
