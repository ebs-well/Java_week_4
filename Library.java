public class Library{
    private Book[] Books = new Book[5];
    public int libSize = Books.length;

    // Method
    // Return the information from the constructor Library Index
    public Book get(int index)
    {
        return Books[index];
    }

    //Setter
    public void setBooks(Book[] books) {
        Books = books;
    }

    //Getter
    public Book[] getBooks() {
        return Books;
    }

    // Constructor
    //Default
    public Library()
    {
        Books[0] = new Book("978-0-937986-50-9", "Stephen King", "Dark Tower I: The Gunslinger", 8.99);
        Books[1] = new Book("978-0-937986-90-5","Stephen King","Dark Tower II: The Drawing of the Three",9.99);
        Books[2] = new Book("978-0-937986-17-2","Stephen King","Dark Tower III: The Waste Lands",10.99);
        Books[3] = new Book("978-1-880418-38-3","Stephen King","Dark Tower IV: Wizard and Glass",11.99);
        Books[4] = new Book("978-1-880418-56-7","Stephen King","Dark Tower V: Wolves of the Calla",12.99);
    }

}
