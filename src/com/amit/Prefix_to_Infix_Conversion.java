package com.amit;
import java.util.*;
public class Prefix_to_Infix_Conversion
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();

        Stack<String> stack = new Stack<>();
        int i=s.length()-1;
        while (i>=0)
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

                String res = "(" + t1 + ch + t2 + ")";
                stack.push(res);
            }
            i--;
        }

        System.out.println(stack.pop());
    }
}
