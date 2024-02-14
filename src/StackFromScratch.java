
public class StackFromScratch {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackFromScratch(int s) {

        maxSize = s;
        stackArray = new int[s];
        top = 0;

    }

    public void push(int j) {

        stackArray[top] = j;
        top++;

    }

    public int pop() {

        int target = stackArray[top];
        stackArray[top] = 0;
        top--;

        return target;


    }

    public int peek() {

        return stackArray[top];

    }

    public boolean empty() {

        return top == 0;

    }

    public boolean isFull() {

        return top == maxSize;

    }

}
