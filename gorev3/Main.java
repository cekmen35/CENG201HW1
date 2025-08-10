public class Main {
    public static void main(String[] args) {
        ReturnStack returnStack = new ReturnStack();

        
        System.out.println("Adding 5 return requests...");
        for (int i = 1; i <= 5; i++) {
            returnStack.push(new ReturnRequest(i, System.currentTimeMillis()));
        }
        returnStack.printStack();

        
        System.out.println("\nProcessing 2 return requests...");
        System.out.println("Popped: " + returnStack.pop());
        System.out.println("Popped: " + returnStack.pop());

        
        System.out.println("\nRemaining stack:");
        returnStack.printStack();
    }
}