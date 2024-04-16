package LeetCode;

public class xorInAString {

    public static void main (String args[]) {

        String s = "loveleetcode";

        int i = 0;
        int j = 1;

        while (j < s.length()) {

            if (s.charAt(i) == s.charAt(j)) break;
            i++;
            j++;

        }

        System.out.println(i-1);

    }

}
