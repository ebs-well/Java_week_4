//Created by Erik Stilwell
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        
        // Test Area to ensure the Publication works
        System.out.println("Below is the initial Publication Class Test for Constructors:");
        Publication pubTest = new Publication(); //First print line for default constructor
        Publication pubTest2 = new Publication("The Lion, the Witch and the Wardrobe", 8.99); //Custome
        System.out.println(pubTest);
        System.out.println(pubTest2);

        // Test Area to ensure Book works
        System.out.println("\nBelow is the initial Book Class Test for Constructors:");
        Book bookTest = new Book(); //First print line for default constructor
        Book bookTest2 = new Book("C.S. Lewis", "9780006716631", "The Lion, the Witch and the Wardrobe", 8.99); //Custome to include info from Publication
        System.out.println(bookTest);
        System.out.println(bookTest2);

        // Initialize Library
        Library libTest = new Library();

        //Below is a for loop to print out the contents of Library using the name of the library.libSize(built in Library.java) to set a dynamic length
        //This allows for reusability if a new library is created with a new size, just change the "libTest" to the new library name
        System.out.println("\nBelow is the initial Library Class Test for Constructor:");
        for(int i = 0; i<libTest.libSize; i++)
        {
        System.out.println(libTest.get(i));
        }

        // I create the above code prior to understanding ArrayList capability, while it works the ArrayList method below is vastly superior as it allows for items to be added easily and is more readable. 

        System.out.println("\nBelow is the Array Library Class Test:");
        ArrayList<Book> libTest2 = new ArrayList<Book>();
        libTest2.add(new Book( "123123123","Erik Stilwell", "My first book", 9.99));
        libTest2.add(new Book( "234234234", "Angela Ding","The Moon and the Lake", 13.55));
        libTest2.add(new Book("345345345", "Jessica Roth", "The farm's happy family", 7.22));
        libTest2.add(new Book("456456456", "Alyssa Malinoff","How networks function", 19.99));
        libTest2.add(new Book("567567567","Seth Gates", "Powerlifting for dummies", 3.33));

        for(Book i: libTest2)
        {
            System.out.println(i);
        }
    }

    
}