//Created by Erik Stilwell

public class Book extends Publication{
    private String ISBN;
    private String Author;

    //Setters

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    //Getters

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return Author;
    }

    //Constructors
    //Default
    public Book()
    {
        super();
        ISBN = "9780192728029";
        Author = "L. Frank Baum";
    }

    //Non-Default
    public Book(String ISBN, String Author, String Title, double Price)
    {
        super(Title, Price);
        this.ISBN = ISBN;
        this.Author = Author;
    }

    //to String
    public String toString() {
        return super.toString() + ". The ISBN is: " + ISBN + " and the Author is: " + Author;
    }
}
