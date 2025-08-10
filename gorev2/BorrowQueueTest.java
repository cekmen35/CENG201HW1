public class BorrowQueueTest {
    public static void main(String[] args) {
        BorrowQueue borrowQueue = new BorrowQueue();

        
        for (int i = 1; i <= 10; i++) {
            borrowQueue.enqueue(new BorrowRequest(i, 100 + i));
        }

        System.out.println("Initial Queue:");
        borrowQueue.printQueue();

        
        System.out.println("\nProcessing 3 requests...");
        for (int i = 0; i < 3; i++) {
            borrowQueue.dequeue();
        }

        
        System.out.println("\nRemaining Queue:");
        borrowQueue.printQueue();
    }
}
