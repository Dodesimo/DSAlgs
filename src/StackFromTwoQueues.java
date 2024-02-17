import java.util.LinkedList;
import java.util.Queue;

public class StackFromTwoQueues {

    Queue<Integer> s1 = new LinkedList<>();
    Queue<Integer> s2 = new LinkedList<>();

    public void push(int x) {

        s1.add(x);

    }

    public int pop() {

        s2.clear();
        Object[] list = s1.toArray();

        for (int i = list.length; i > 0; i--){
            s2.add((Integer) list[i-1]);
        }

        int x = s2.remove();

        list = s2.toArray();
        s1.clear();

        for (int i = list.length; i > 0; i--) {
            s1.add((Integer) list[i-1]);
        }

        return x;

    }

    public int top() {

        s2.clear();

        Object[] list = s1.toArray();

        for (int i = list.length; i > 0; i--){
            s2.add((Integer) list[i-1]);
        }

        return s2.peek();

    }

    public boolean empty() {

        return s2.isEmpty();

    }

    public String toString(){

        String allElements = "";

        for (int i = 0; i < s1.size(); i++) {

            allElements = allElements + s1.remove();
        }

        return allElements;

    }

    public static void main (String[] args) {

        StackFromTwoQueues s = new StackFromTwoQueues();
        s.push(1);
        s.pop();
        System.out.println(s.toString());


    }

}
