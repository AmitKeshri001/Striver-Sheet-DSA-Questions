package com.amit;
import java.util.*;
public class Check_if_a_Number_is_Power_of_2_or_Not
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        boolean ans = ((n & (n-1)) == 0);

        System.out.println("Your ans is : " + ans);
    }
}
