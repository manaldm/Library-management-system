package com.company;

/**
 * A class that contains information about a library.
 */

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libraryCatalogue;
    private String libraryName;
    private String libraryLoction;
    private String phoneNumber;
    private String openingTimes;

    /**
     * Constructor for objects of class Library.
     */
    public Library ()
    {
        libraryCatalogue = new ArrayList<>();
        libraryName = "Strathclyde library.";
        libraryLoction = "Glasgow city centre.";
        phoneNumber = "0141 779 4142";
        openingTimes = "Mon-Sat. 9am - 6pm.";
    }

    /**
     * Get the library's catalogue.
     */
    public ArrayList<Book> getlibraryCatalogue()
    {
        return libraryCatalogue;
    }

    /**
     * Get the library's name.
     */
    public String getlibraryName()
    {
        return libraryName;
    }
    /**
     * Set the library's name
     */
    public void setlibraryName(String libName)
    {
        libraryName = libName;
    }

    /**
     * Get the library's location.
     */
    public String getlibraryLoction()
    {
        return libraryLoction;
    }
    /**
     * Set the library's location.
     */
    public void setlibraryLoction(String libLocation)
    {
        libraryLoction = libLocation;
    }

    /**
     * Get the library's phone number.
     */
    public String getphoneNumber()
    {
        return phoneNumber;
    }
    /**
     * Sets the library's phone number.
     */
    public void setphoneNumber(String libPhoneNum)
    {
        phoneNumber = libPhoneNum;
    }

    /**
     * Get the library's opening times.
     */
    public String getOpeningTimes()
    {
        return openingTimes;
    }
    /**
     * Sets the library's phone number.
     */
    public void setopeningTimes(String opTimes)
    {
        phoneNumber = opTimes;
    }

    /**
     * Print all the details of the library.
     */
    public void printLibraryDetails()
    {
        System.out.println("Library name: " + libraryName);
        System.out.println("Library location: " + libraryLoction);
        System.out.println("Library phone number: " + phoneNumber);
        System.out.println("Opening times: " + openingTimes);
        //System.out.println("catalogue: " + libraryCatalogue.getlibraryCatalogue());
    }

    /**
     * Adds books to the library catalogue.
     */
    public void addToCatalogue(Book book)
    {   if(libraryCatalogue.contains(book))
    {   System.out.println("This book is already in the library catalogue");}
    else{
        libraryCatalogue.add(book);
    }
    }

    /**
     * Check if the catalogue contains a resource.
     */
    public boolean catalogueContainsBook(Book book)
    {
        if(libraryCatalogue.contains(book)){
            return true;}
        else {
            return false;}
    }

    /**
     * Edit the title of a book.
     */
    public void editTitle(Book bookToEdit, String newTitle)
    {
        if(libraryCatalogue.contains(bookToEdit)){
            bookToEdit.setTitle(newTitle);}
        else {
            System.out.println("Sorry, this book doesn't exist in the catalogue");
        }
    }

    /**
     * Searches the library catalogue by book.
     */
    public String searchCatalogueByBook(Book book)
    {
        if (libraryCatalogue.contains(book)){
            return book.getTitle();
        }
        else {
            return null;
        }
    }

    /**
     * Searches the library catalogue by ISBN.
     */
    public void searchCatalogueByIsbn(String isbn)
    {
        for (Book book: libraryCatalogue){
            //if (book.getIsbn() == isbn){
            book.printDetails();
            // }
        }
    }

    /**
     * Search the library catalogue by author name.
     */
    public void searchAuthorName(String name)
    {
        for (Book book :libraryCatalogue){
            if (book.getauthor() == name){
                book.printDetails();
            }
        }
    }

    /**
     * Removes a book from the library catalogue.
     */
    public void remove(Book book)
    {
        if (libraryCatalogue.contains(book)){
            libraryCatalogue.remove(book);}
        else {
            System.out.println("This book is not in the catalogue");
        }
    }

    /**
     * Removes a book from a particular position in the library catalogue catalogue.
     */
    public void removeFromPosition(int index)
    {
        if (index < 0 || index > libraryCatalogue.size()){
            System.out.println("Invalid index! Please enter a number between 0 and " + libraryCatalogue.size());
        }
        else {
            libraryCatalogue.remove(index);
        }
    }

    /**
     * Print all available books.
     */
    public void printAvailableBooks()
    {
        for (Book book: libraryCatalogue){
            if (book instanceof Ebook){
                book.printDetails(); }
            else if(book instanceof PhysicalBook);{
                //if (book.getmember() == null || book.getebookResource() != null)
                book.printDetails();
            }
        }
    }

    /**
     * Return the number of resources in the library catalogue.
     */

    public int numberOfResources()
    {
        return libraryCatalogue.size();
    }

    /**
     * Lend a book to a library member.
     */
    public void lendBook(Member libmember, PhysicalBook bookToLend)
    {
        if (catalogueContainsBook(bookToLend) == false){
            System.out.println("Sorry, this book is not in the catalogue");}
        else if(bookToLend.getmember() != null){
            System.out.println("Sorry, this books isn't currently available");}
        else if (libmember.getbooksBorrowed().size() > 5){
            System.out.println("Sorry, you can't borrow more that 5 books");}

        else{
            bookToLend.setmember(libmember);
            libmember.borrow(bookToLend);}
    }

    /**
     * Accept a book return.
     */
    public void acceptReturn(PhysicalBook bookToReturn, boolean isDamaged, String damageDescription)
    {
        if(catalogueContainsBook(bookToReturn) == false){
            System.out.println("Sorry, this book is not in the catalogue");}

        else{
            //bookToReturn.removeBook();
            bookToReturn.setmember(null);
            if(isDamaged == true){
                bookToReturn.setdamages(damageDescription);
            }
        }
    }

    /**
     * send messages to library members.
     */
    public void sendMessages(String message)
    {
        //message.setmessages();
    }

    /**
     * Print the details of all physical books in the library catalogue
     */
    public void printAllphysicalBooks()
    {
        for (Book book : libraryCatalogue)
        {if (book instanceof PhysicalBook)
            book.printDetails();
        }
    }

    /**
     * Print all the details of all ebooks in the library catalogue.
     */
    public void printEbooks()
    {
        for (Book book : libraryCatalogue){
            if (book instanceof Ebook){
                book.printDetails();}
        }
    }
}
