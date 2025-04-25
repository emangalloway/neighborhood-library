package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class NeighborhoodLibrary {
    //Initialize an array of Book objects with a max capacity of 20
    public static Book[] book = new Book[20];

    // The number of books that are currently in the library
    public static int numOfBook = 5;

    //Main method where the program will run
    public static void main(String[] args) {

        //Create and add books to array
        book[0] = new Book(1234, "1a2b3c", "Heidi", false, "");
        book[1] = new Book(3367, "2b3c4d", "The Lion, the Witch, and the Wardrobe", false, "");
        book[2] = new Book(2988, "3c4d5e", "Harry Potter, and the Chamber of Secrets", false, "");
        book[3] = new Book(1244, "4d5e6f", "The Hobbit", false, "");
        book[4] = new Book(5674, "5e7f8g", "A Tale of Two Cities", false, "");

        //Create a scanner
        Scanner myscanner = new Scanner(System.in);

        //Create a while loop for the menu
        while (true) {
            System.out.println("Welcome to the Library");
            System.out.println("Library Home Screen");
            System.out.println(" ");
            System.out.println("1 - Show available books");
            System.out.println("2 - Show checked out books");
            System.out.println("3 - Quit");
            System.out.println(" ");
            System.out.println("Enter option: ");
            int enterOption = myscanner.nextInt();
            myscanner.nextLine();

            //Creating switch case in place for if statement
            switch (enterOption) {
                case 1:
                    listBooksCheckedIn(myscanner);
                    break;
                case 2:
                    listBooksCheckedOut(myscanner);
                    break;
                case 3:
                    System.out.println("Thanks for visiting the Library come back soon!");
                    return;
            }
        }

    }// This method displays available books menu page
    public static void listBooksCheckedIn(Scanner scanner) {
        System.out.println("Available Books");
        // Create a for loop to iterate books in array
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null && !book[i].isCheckedOut()) {
                System.out.println("ID: " + book[i].getId() + ", Title: " + book[i].getTitle());
            }
        }// Ask user to make a choice and create scanner
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("If you would like to check out a book, Enter ID: ");
        System.out.println("Press 0 to go back to Home");
        int option = scanner1.nextInt();
        scanner1.nextLine();

        //If statement to return to home screen
        if (option == 0) {
            return;
        }
        //for loop to find and checkout book
        for (Book bok : book) {
            //If statement that take the users input to start check out process
            if (bok != null && bok.getId() == option) {
                System.out.println("Enter your full name: ");
                String fullName = scanner.nextLine();
                //Set the book is checked out status
                bok.setCheckedOut(true);
                bok.setIsCheckedOutTo(fullName);
                bok.checkOut(fullName);
                return;
            }
        }

        // This method is for the Show checked out books menu page
    }
    public static void listBooksCheckedOut(Scanner scanner) {
        System.out.println("Books checked out");
        //create a loop that iterates books checked out
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null && book[i].isCheckedOut()) {
                System.out.println("ID: " + book[i].getId() + ", Title: " + book[i].getTitle()+", Is checked out to: "+book[i].getIsCheckedOutTo());
            }// ask user to make a choice
            System.out.println("Press C to check a book in: ");
            System.out.println("Press X If you would like to return to home page: ");
            String option = scanner.nextLine();

            //if statement to return to home page or continue to check in portion
            if (option.equalsIgnoreCase("x")) {
                return;
            }//for loop to find and check in book
                for (Book book1 : book) {
                    if (book1 != null && book1.isCheckedOut()) {
                        System.out.println("Enter You full name to return book: ");
                        String fullName = scanner.nextLine();
                        //Set book has returned status
                        book1.checkIn();
                        book1.setCheckedOut(false);
                        book1.setIsCheckedOutTo(" ");
                        System.out.println(fullName+ ", You have successfully returned: "+book1.getTitle());
                        return;
                    }
                }
            }
    }
}

