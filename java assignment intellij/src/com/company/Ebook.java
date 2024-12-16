package com.company;
import java.util.ArrayList;

/**
 * A class that contains information about Ebooks in the library.
 * This class is a subclass of the Book super class.
 */

public class Ebook extends Book{

    private ArrayList<EBookReader> ebookReaders;
    private int size;
    private String downloadLink;

    /**
     * Constructor for objects of class Ebook.
     */
    public Ebook (int bookSize, String bookTitle,
                  String bookAuthor, String datePublished,String bookLanguage)
    {
        super(bookTitle, bookAuthor, datePublished, bookLanguage);
        ebookReaders = new ArrayList<>();
        size = bookSize;
        downloadLink = "Download here: ...";
    }

    /**
     * Get a list ebook readers in the library.
     */
    public ArrayList<EBookReader> getEbookReaders()
    {
        return ebookReaders;

    }

    /**
     * Get ebook size in KB.
     */
    public int getsize()
    {
        return size;
    }
    /**
     * Set ebook size in KB.
     */
    public void setsize(int sizeOfBook)
    {
        size = sizeOfBook;
    }

    /**
     * Get the downloadLink for an ebook.
     */
    public String getdownloadLink()
    {
        return downloadLink;
    }
    /**
     * Set the download link for an ebook.
     */
    public void setdownloadLink(String dLink)
    {
        downloadLink = dLink;
    }

    /**
     *Print the details of an ebook.
     */
    @Override
    public void printDetails()
    {
        super.printDetails();
        System.out.println("Ebook readers " + ebookReaders);
        System.out.println("Book size " + size + " KB");
        System.out.println("Download link:  " + downloadLink);
        System.out.println("\n");
    }

    /**
     * Add an ebook reader to the end of the ebookReaders list.
     */
    public void addDevice(EBookReader eDevice)
    {
        ebookReaders.add(eDevice);
    }
}
