package com.amit;

import java.util.Scanner;
import java.util.*;

public class Reverse_Words_in_a_String
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        System.out.println("Your Reversed String is  : " + rev(s));
    }

    private static String rev(String s)
    {
        s = s.trim();
        String[] str = s.split(" ");
        ArrayList<String> list = new ArrayList<>();

        for(int i=str.length-1;i>=0;i--)
        {
            if(!str[i].equals(""))
            {
                list.add(str[i]);
            }
        }
        StringBuilder sc = new StringBuilder();
        for(int i=0;i<list.size();i++)
        {
            sc.append(list.get(i));

            if(i < list.size()-1)
            {
                sc.append(" ");
            }
        }

        return sc.toString();


    }


}
