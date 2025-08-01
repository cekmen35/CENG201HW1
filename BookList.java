package gorev1;

public class BookList {
    private Book head;

    public BookList() {
        head = null;
    }

    public void addBook(Book book) {
        if (head == null) {
            head = book;
            return;
        }

        Book position = head;

        while (position.getNext() != null) {
            position = position.getNext();
        }

        position.setNext(book);
    }

    public void removeBook(int id) {
        if (head == null) {
            return;
        }

        if (head.getId() == id) {
            this.head = head.getNext();
            return;
        }

        Book position = head;

        while ((position.getNext() != null) && (position.getNext().getId() != id)) {
            position = position.getNext();
        }

        if (position.getNext() == null) {
            return;
        }

        position.setNext(position.getNext().getNext());
    }

    public Book findBook(int id) {
        if (head == null) {
            return null;
        }
        
        Book position = head;

        while (position.getId() != id && position.getNext() != null) {
            position = position.getNext();
        }

        if (position.getId() == id) {
            return position;
        }

        return null;
    }

    public void printList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        Book position = head;

        while (position != null) {
            System.out.println(position.getId() + " " + position.getTitle() + " " + position.getAuthor());
            position = position.getNext();
        }

        System.out.print("\n");
    }

    public static void main(String[] args) {
        BookList myList = new BookList();


        Book bookToBeAdded = new Book(1, "1984", "George Orwell");
        myList.addBook(bookToBeAdded);

        bookToBeAdded = new Book(2, "Değirmen", "Sabahattin Ali");
        myList.addBook(bookToBeAdded);

        bookToBeAdded = new Book(3, "Kuyucaklı Yusuf", "Sabahattin Ali");
        myList.addBook(bookToBeAdded);

        bookToBeAdded = new Book(4, "Suç ve Ceza", "Dostoyevski");
        myList.addBook(bookToBeAdded);

        bookToBeAdded = new Book(5, "İnsan Ne İle Yaşar", "Tolstoy");
        myList.addBook(bookToBeAdded);


        myList.removeBook(3);


        Book foundBook = myList.findBook(4);
        System.out.println("Found book: " + foundBook.getId() + " " + foundBook.getTitle() + " " + foundBook.getAuthor());


        myList.printList();
    }
}
