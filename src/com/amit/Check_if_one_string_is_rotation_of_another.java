package com.amit;
import java.util.*;
public class Check_if_one_string_is_rotation_of_another
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String :");
        String s1 = sc.nextLine();

        System.out.println("Enter the Second String :");
        String s2 = sc.nextLine();

        String s3 = s1 + s1;

        if(s3.contains(s2))
        {
            System.out.println("Yes It si possible : Yee");
            return;
        }
        else {
            System.out.println("No it's Not Possible  : Naa");
        }
    }
}
