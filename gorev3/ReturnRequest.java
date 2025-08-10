public class ReturnRequest {
    private int bookId;
    private long returnTime;

    public ReturnRequest(int bookId, long returnTime) {
        this.bookId = bookId;
        this.returnTime = returnTime;
    }

    
    public int getBookId() {
        return bookId;
    }

    public long getReturnTime() {
        return returnTime;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + " | Return Time: " + returnTime;
    }
}