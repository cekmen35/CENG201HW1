package gorev1;

public class Book {
    private int id;
    private String title;
    private String author;
    private Book next;

    public Book() {
        id = -1;
        title = "";
        author = "";
        next = null;
    }

    public Book(int newId, String newTitle, String newAuthor) {
        id = newId;
        title = newTitle;
        author = newAuthor;
        next = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book getNext() {
        return next;
    }

    public void setNext(Book next) {
        this.next = next;
    }
}
