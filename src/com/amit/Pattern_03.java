package com.amit;
import java.util.*;
public class Pattern_03
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the no. of cols : ");
        int c = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}
