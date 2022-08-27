public class Book {
    final private String name;
    final private Author author;
    private int yearPublishing;

    public Book (String name, Author author, int yearPublishing){
        this.name = name;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }
    public Book (String name, String firstName, String lastName){
        this.name = name;
        this.author = new Author(firstName,lastName);
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
    public String printBook() {
        return this.author.getFirstName() + " " + this.author.getLastName() + " " + this.name + " " + this.yearPublishing;

    }
}
