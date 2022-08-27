public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Инферно.", new Author("Дэн", "Браун."), 2013);
        Book book2 = new Book("Сияние.", new Author("Стивен", "Кинг."), 2017);
        Book book3 = new Book("Хроники Сиалы.", new Author("Алексей", "Пехов."), 2005);
        book3.setYearPublishing(2009);
        Book[] books = new Book[5];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        addNewBook(new Book("Идиот.", new Author("Федор", "Достоевский."), 1869), books);
        printAllBooks(books);

    }
    public static void addNewBook(Book book, Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }

    public static void printAllBooks(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.printBook());
            }

        }
    }
}