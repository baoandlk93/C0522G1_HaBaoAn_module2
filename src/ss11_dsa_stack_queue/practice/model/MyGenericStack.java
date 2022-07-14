package ss11_dsa_stack_queue.practice.model;


import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public LinkedList<T> getStack() {
        return stack;
    }

    public void setStack(LinkedList<T> stack) {
        this.stack = stack;
    }
}
