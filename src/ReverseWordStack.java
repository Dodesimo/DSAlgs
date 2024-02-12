import java.util.Stack;

public class ReverseWordStack {

    public static void main(String args[]) {

        String s = "Devam Mondal";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            stack.push(s.charAt(i));

        }

        String r = "";

        for (int j = 0; j < s.length(); j++) {

            r = r + stack.pop();

        }

        System.out.println(r);


    }

}
