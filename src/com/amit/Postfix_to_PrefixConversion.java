package com.amit;

import java.util.Scanner;
import java.util.Stack;

public class Postfix_to_PrefixConversion
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();

        Stack<String> stack = new Stack<>();
        int i=0;
        while (i<s.length())
        {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                stack.push(ch+"");
            }
            else
            {
                String t1 = stack.pop();
                String t2 = stack.pop();

                String res = ch + t2 + t1 ;
                stack.push(res);
            }
            i++;
        }

        System.out.println(stack.pop());
    }
}
