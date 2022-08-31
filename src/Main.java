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
    }

}