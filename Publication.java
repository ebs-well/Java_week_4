public class Publication {
    private String Title;
    private double Price;


    // Setters
    public void setTitle(String title) {
        Title = title;
    }

    public void setPrice(double price) {
        Price = price;
    }

    // Getters

    public String getTitle() {
        return Title;
    }

    public double getPrice() {
        return Price;
    }

    // Constructors

    // Default 
    public Publication()
    {
        Title = "The Wonderful Wizard of Oz";
        Price = 5.99;
    }

    // Non-Default
    public Publication(String Title, double Price)
    {
        this.Title = Title;
        this.Price = Price;
    }

    // To String
    public String toString() {
        return "Book Title: " + Title + " and its Price is: " + Price;
    }
}
