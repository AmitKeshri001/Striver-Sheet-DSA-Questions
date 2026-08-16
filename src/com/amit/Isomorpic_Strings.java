package com.amit;
import java.util.*;
public class Isomorpic_Strings
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter you first String : ");
        String s1 = sc.nextLine();
        System.out.println("Enter your second String : ");
        String s2 = sc.nextLine();


        if(s1.length() != s2.length())
        {
            System.out.println("Not an Isomorphic String : ");
            return;
        }

        int n = s1.length();
        HashMap<Character , Character> map1 = new HashMap<>();
        HashMap<Character , Character> map2 = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if(map1.containsKey(a) && map1.get(a) != b)
            {
                System.out.println("Not an Isomorphic string !");
                return;
            }

            if(map2.containsKey(b) && map2.get(b) != a)
            {
                System.out.println("Not an Isomorphic string !");
                return;
            }

            map1.put(a,b);
            map2.put(b,a);
        }

        System.out.println("Enterd Strings are Isomorphic String : ");
        return;
    }
}
