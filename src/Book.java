public class Book {
    final private String name;
    final private Author author;
    private int yearPublishing;

    public Book (String name, Author author, int yearPublishing){
        this.name = name;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }
    public void setYearPublishing (int yearPublishing){
        this.yearPublishing = yearPublishing;
    }
}
