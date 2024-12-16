package com.company;

/**
 * A class that contains information about a physical book in a library.
 * This class is a subclass of the Book super class.
 */

public class PhysicalBook extends Book {

    private Member member;
    private String isbn;
    private String location;
    private String damages;
    private int pages;
    private Ebook ebookResource;

    /**
     * Constructor for objects of class PhysicalBook.
     */
    public PhysicalBook (Member libMember,String bookisbn,String bookLocation, String bookDamages,
                         int bookPages, Ebook resource, String bookTitle,
                         String bookAuthor, String datePublished,String bookLanguage)
    {
        super(bookTitle, bookAuthor, datePublished, bookLanguage);
        member = libMember;
        isbn = bookisbn;
        location = bookLocation;
        damages = bookDamages;
        pages = bookPages;
        ebookResource = resource;
    }

    /**
     * Get the library member currently borrowing the book.
     */

    public Member getmember()
    {
        return member;
    }
    /**
     * Set the library member currently borrowing the book.
     */
    public void setmember(Member libMember)
    {
        member = libMember;

    }

    /**
     * Get the isbn of a physical book.
     */

    public String getIsbn()
    {

        return isbn;
    }
    /**
     * Set the isbn of a physical book.
     */
    public void setIsbn(String bookIsbn)
    {

        isbn = bookIsbn;
    }

    /**
     * Get the location of a physical book.
     */

    public String getLocation()
    {

        return location;
    }
    /**
     * Set the location of a physical book.
     */
    public void setLocation(String bookLocation)
    {

        location = bookLocation;
    }

    /**
     * Get damages on a physical book.
     */
    public String getdamages()
    {

        return damages;
    }
    /**
     * Set the damages on a physical book.
     */
    public void setdamages(String bookDamages)
    {
        damages = bookDamages;
    }

    /**
     * Get number of pages on a physical book.
     */
    public int getpages()
    {

        return pages;
    }
    /**
     * Set number of pages on a physical book.
     */
    public void setPages(int bookPages)
    {
        pages = bookPages;
    }


    /**
     * Get the Ebook resource for a physical book.
     */
    public Ebook getebookResource()
    {
        return ebookResource;
    }

    /**
     * Set the Ebook resource for a physical book.
     */
    public void setebookResource(Ebook ebook)
    {
        ebookResource = ebook;
    }

    /**
     * Check if a book is available.
     */
    public boolean checkIfAvailable()
    { if(member == null)
        return true;
    else
        return false;

    }

    /**
     * Print all the details of a physical book.
     */
    @Override
    public void printDetails()
    {
        super.printDetails();
        if(member == null){
            System.out.println("this book is currently available.");}
        else if(ebookResource != null){
            System.out.println("this book is currently available as an ebook only.");}
        else {System.out.println("This book is currently held by: " + member);} //printing memory location only
        System.out.println("ISBN: " + isbn);
        System.out.println("Location: " + location);
        System.out.println("Damages: " + damages);
        System.out.println("Ebook resource: " + ebookResource); //printing memory location
        System.out.println("\n");
    }
}
