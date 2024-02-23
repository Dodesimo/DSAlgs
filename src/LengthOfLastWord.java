import java.sql.Array;
import java.util.ArrayList;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        String[] subwords;
        subwords = s.split("");

        return subwords[subwords.length-1].length();

    }

}
