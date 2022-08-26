public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Инферно. ", new Author("Дэн", "Браун. "), 2013);
        Book book2 = new Book("Сияние. ", new Author("Стивен", "Кинг. "), 2017);
        Book book3 = new Book("Хроники Сиалы. ", new Author("Алексей", "Пехов. "), 2005);
        book3.setYearPublishing(2009);
        System.out.println("Название книги: " + book3.getName() + "Автор: " + book3.getAuthor().getFirstName() + " " + book3.getAuthor().getLastName() + "Год издания: " + book3.getYearPublishing());
    }
}