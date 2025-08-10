import java.util.LinkedList;

public class BorrowQueue {
    private LinkedList<BorrowRequest> queue;

    public BorrowQueue() {
        queue = new LinkedList<>();
    }

  
    public void enqueue(BorrowRequest request) {
        queue.addLast(request);
    }

    
    public BorrowRequest dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        return queue.removeFirst();
    }

  
    public int size() {
        return queue.size();
    }

    
    public void printQueue() {
        for (BorrowRequest request : queue) {
            System.out.println(request);
        }
    }
}
