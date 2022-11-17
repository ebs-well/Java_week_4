public class Main{
    public static void main(String[] args) {
        
        // Test Area to ensure the Publication works
        Publication pubTest = new Publication();
        Publication pubTest2 = new Publication("The Lion, the Witch and the Wardrobe", 8.99);
        System.out.println(pubTest);
        System.out.println(pubTest2);

        // Test Area to ensure Book works
        Book bookTest = new Book();
        Book bookTest2 = new Book("C.S. Lewis", "9780006716631", "The Lion, the Witch and the Wardrobe", 8.99);
        System.out.println(bookTest);
        System.out.println(bookTest2);

        // Initialize Library
        Library libTest = new Library();

        //Below is a for loop to print out the contents of Library using the name of the library.libSize(built in Library.java) to set a dynamic length
        //This allows for reusability if a new library is created with a new size, just change the "libTest" to the new library name
        for(int i = 0; i<libTest.libSize; i++)
        {
        System.out.println(libTest.get(i));
        }
    }
}