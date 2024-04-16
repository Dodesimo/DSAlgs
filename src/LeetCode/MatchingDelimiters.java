package LeetCode;

import java.util.Stack;

public class MatchingDelimiters {

    public static void main(String[] args) {

        Stack<Character> s = new Stack<>();
        String delimited = "a{b{c[d]e)f}";

        for (int i = 0; i < delimited.length(); i++) {

            char ch = delimited.charAt(i);

            switch (ch) {
                case '{':
                case '(':
                case '[':
                    s.push(ch);
                    break;

                case '}':
                case ')':
                case ']':
                    char beg = s.pop();
                    if ((beg == '(' && ch == ')' ) || (beg == '{' && ch == '}' ) || (beg == '[' && ch == ']' )) {
                        System.out.println("All good!");
                    } else {

                        System.out.println("error");

                    }
            }
        }


    }

}
