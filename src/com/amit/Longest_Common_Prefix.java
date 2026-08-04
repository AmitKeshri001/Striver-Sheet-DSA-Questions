package com.amit;
import java.util.*;
public class Longest_Common_Prefix
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the String array : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the strings in the array : ");
        String[] str  = new String[n];

        for(int i=0;i<n;i++)
        {
            str[i] = sc.nextLine();
        }

        System.out.println("The longest common prefix of this is  : " + Pre(str));
    }

    private static String Pre(String[] str)
    {
        int n = str.length;

        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[n-1];

        int i=0;
        int j=0;
        StringBuilder sc = new StringBuilder();
        while(i<s1.length() && j<s2.length())
        {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(j);
            if(ch1 == ch2)
            {
                sc.append(ch1);
                i++;
                j++;
            }
            else
            {
                break;
            }
        }

        return sc.toString();

    }

}
