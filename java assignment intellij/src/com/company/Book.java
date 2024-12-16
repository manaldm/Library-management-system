package com.company;

/**
 * A class that contains information about a physical book in a library.
 * This is a super class containing all shared data fields and methods of
 * the sub classes PhysicalBook and Ebook.
 */

public class Book {




        private String title;
        private String author;
        private String publishDate;
        private String language;


        /**
         * Constructor for objects of class Book.
         */
        public Book ( String bookTitle,
                      String bookAuthor, String datePublished,String bookLanguage)
        {
            title = bookTitle;
            author = bookAuthor;
            publishDate = datePublished;
            language = bookLanguage;
        }

        /**
         * Get the title of a book.
         */

        public String getTitle()
        {

            return title;
        }
        /**
         * Set the title of a book.
         */

        public void setTitle(String bookTitle)
        {
            title = bookTitle;
        }

        /**
         * Get the author of a book.
         */
        public String getauthor()
        {

            return author;
        }
        /**
         * Set the author of a book.
         */
        public void setauthor(String bookAuthor)
        {
            author = bookAuthor;
        }

        /**
         * Get the publish date of a book.
         */
        public String getpublishDate()
        {

            return publishDate;
        }
        /**
         * Set the publish date of a book.
         */
        public void setpublishDate(String date)
        {
            publishDate = date;
        }

        /**
         * Get the language of a book.
         */
        public String getlanguage()
        {

            return language;
        }
        /**
         * Set the language of a book.
         */
        public void setlanguage(String bookLanguage)
        {
            language = bookLanguage;
        }

        /**
         * Print all the details of a book.
         */
        public void printDetails()
        {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Date published: " + publishDate);
            System.out.println("Language: " + language);

        }






}
