package com.amit;

import java.util.*;

public class Check_if_two_Strings_are_anagrams_of_each_other
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String :");
        String s1 = sc.nextLine();

        System.out.println("Enter the Sec String :");
        String s2 = sc.nextLine();

        System.out.println(IsAnagram(s1 , s2));
    }

    private static boolean IsAnagram(String s1, String s2)
    {
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        int[] freq = new int[26];


        if(s1.length() != s2.length())
        {
            return false;
        }
        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            freq[ch - 'A']++;
        }

        for(int j=0;j<s2.length();j++)
        {
            char ch = s2.charAt(j);
            freq[ch - 'A']--;
        }

        for(int i=0;i<freq.length;i++)
        {
            if(freq[i] != 0)
            {
                return false;
            }
        }

        return true;
    }

}
