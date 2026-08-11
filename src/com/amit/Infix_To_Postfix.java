package com.amit;

import java.util.*;

public class Infix_To_Postfix
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter that string : ");
        String s = sc.nextLine();

        System.out.println("Your conversion from infix to postfix is : ");
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(ch == ' ')
            {
                continue;
            }

            if(Character.isLetterOrDigit(ch))
            {
                ans.append(ch);
            }
            else if(ch == '(')
            {
                stack.push(ch);
            }
            else if(ch == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                {
                    ans.append(stack.pop());
                }
                if(!stack.isEmpty() && stack.peek() == '(')
                {
                    stack.pop();
                }
            }
            else
            {
                while(!stack.isEmpty() &&
                        (pre(ch) < pre(stack.peek()) ||
                        (pre(ch) == pre(stack.peek()) && ch != '^')))
                {
                    ans.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty())
        {
            ans.append(stack.pop());
        }

        System.out.println(ans);
    }

    private static int pre(char ch)
    {
        if(ch == '^') return 3;
        else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }

        else
        {
            return 0;
        }
    }
}
