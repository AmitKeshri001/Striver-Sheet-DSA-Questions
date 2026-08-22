package com.amit;
import java.util.*;
public class Infix_to_Prefix_Conversion
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();

        String rev = Reverse(s);
        String con = Convert(rev);
        String res = Reverse(con);

        System.out.println(res);

    }

    private static String Convert(String s)
    {
        Stack<Character> stack = new Stack<>();
        String ans ="";

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch))
            {
                ans += ch;
            }
            else if(ch == '(')
            {
                stack.push(ch);
            }
            else if(ch == ')')
            {
                while(!stack.isEmpty() && stack.peek() != '(')
                {
                    ans += stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() == '(')
                {
                    stack.pop();
                }
            }

            else
            {
                while(!stack.isEmpty() &&
                        prec(stack.peek()) > prec(ch))
                {
                    ans += stack.pop();
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty())
        {
            ans += stack.pop();
        }

        return ans;
    }

    private static int prec(char ch)
    {
        if(ch == '^') return 3;
        else if(ch == '*' || ch == '/') return 2;
        else if(ch == '+' || ch == '-') return 1;
        else return -1;
    }

    private static String Reverse(String s)
    {
        String rev = "";

        for(int i=s.length()-1;i>=0;i--)
        {
            char ch = s.charAt(i);

            if(ch == '(')
            {
                rev += ')';
            }

            else if(ch == ')')
            {
                rev += '(';
            }
            else
            {
                rev += ch ;
            }
        }

        return rev;
    }
}
