package com.pluralsight;

public class NeighborhoodLibrary {
    //Initialize an array of Book objects with a max capacity of 20
    private static Book[] books = new Book[20];

    // The number of books that are currently in the library
    private static int numOfBooks = 5;

    //Main method where the program will run
    public static void main(String[] args) {

        //Create and add books to array
        books[0] = new Book(1234, "1a2b3c", "Heidi", false, "");
        books[1] = new Book(3367, "2b3c4d", "The Lion, the Witch, and the Wardrobe", false, "");
        books[2] = new Book(2988, "3c4d5e", "Harry Potter, and the Chamber of Secrets", false, "");
        books[3] = new Book(1244, "4d5e6f", "The Hobbit", false, "");
        books[4] = new Book(5674, "5e7f8g", "A Tale of Two Cities", false, "");




    }
}
