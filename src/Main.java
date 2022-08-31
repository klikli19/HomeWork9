public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Инферно.", new Author("Дэн", "Браун."), 2013);
        Book book2 = new Book("Сияние.", new Author("Стивен", "Кинг."), 2017);
        Book book3 = new Book("Хроники Сиалы.", new Author("Алексей", "Пехов."), 2005);
        book3.setYearPublishing(2009);
        Book book4 = new Book("Точка обмана", new Author("Дэн", "Браун."), 2001);


        Library citiLib = new Library(5);
        citiLib.addNewBook(new Book("Идиот", new Author("Федор", "Достоевский."), 1869));
        citiLib.addNewBook(new Book("Обломов", new Author("Иван", "Гончаров."), 1859));
        citiLib.addNewBook(new Book("Капитанская дочка", new Author("Александр", "Пушкин."), 1838));
        citiLib.addNewBook(new Book("Мцыри", new Author("Михаил", "Лермонтов."), 1840));
        citiLib.addNewBook(new Book("Горе от ума", new Author("Александр", "Грибоедов."), 1825));
        citiLib.addNewBook(new Book("Мертвые души", new Author("Николай", "Гоголь."), 1842));
        citiLib.addNewBook(new Book("Мастер и Маргарита", new Author("Михаил", "Булгаков."), 1967));

        citiLib.printAllBooks();


        System.out.println();
        System.out.println(book1.equals(book2));
        System.out.println(book1.getAuthor().equals(book4.getAuthor()));
        System.out.println(book1.hashCode());
        System.out.println(book3.getAuthor().hashCode());
        System.out.println(citiLib.equals(book4));
        System.out.println(citiLib.hashCode());


    }

}