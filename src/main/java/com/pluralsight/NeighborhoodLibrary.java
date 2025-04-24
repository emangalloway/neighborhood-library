package com.pluralsight;

import java.util.Scanner;

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

        //Create a scanner
        Scanner myscanner = new Scanner(System.in);

        //Create a while loop for the menu
        while (true){
            System.out.println("Welcome to the Library");
            System.out.println("1 - Library Home Screen");
            System.out.println("2 - Show available books");
            System.out.println("3 - Show checked out books");
            System.out.println("4 - Check in a book");
            System.out.println("5 - Quit");
            System.out.println("Enter option: ");
            int enterOption = myscanner.nextInt();
            


        }




    }
}
