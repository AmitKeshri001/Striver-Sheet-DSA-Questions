package com.amit;

import java.util.*;
public class Roman_to_Integer
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Roman number :");
        String r = sc.nextLine();

        System.out.println("Your Integer value of this roman no. is :" + ANS(r));
    }

    private static int ANS(String s)
    {
        HashMap<Character , Integer> map = new HashMap<>();

        map.put('M' , 1000);
        map.put('D' , 500);
        map.put('C' , 100);
        map.put('L' , 50);
        map.put('X' , 10);
        map.put('V' , 5);
        map.put('I' , 1);

        int ans=0;

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            int curr = map.get(ch);

            if(i<s.length()-1)
            {
                int next = map.get(s.charAt(i+1));

                if(curr < next)
                {
                    ans -= curr;
                }
                else {
                    ans += curr;
                }
            }
            else {
                ans += curr;
            }
        }

        return ans;
    }

}
