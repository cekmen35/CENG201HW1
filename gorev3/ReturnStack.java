import java.util.LinkedList;

public class ReturnStack {
    private LinkedList<ReturnRequest> stack;

    public ReturnStack() {
        this.stack = new LinkedList<>();
    }

    
    public void push(ReturnRequest request) {
        stack.addFirst(request); 
    }

    
    public ReturnRequest pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return stack.removeFirst(); 
    }

    
    public ReturnRequest peek() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return stack.getFirst(); 
    }

   
    public void printStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("--- Return Stack (LIFO) ---");
        for (ReturnRequest request : stack) {
            System.out.println(request);
        }
    }

    
    public int size() {
        return stack.size();
    }
}