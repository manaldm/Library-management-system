package com.company;

/**
 * A class that contains information about a members of a library.
 */

import java.util.ArrayList;

public class Member {

    private String name;
    private int age;
    private String occupation;
    private String messages;
    private int totalFees;
    private String membershipDate;
    private ArrayList<PhysicalBook> booksBorrowed;

    /**
     * Constructor for objects of class Member.
     */
    public Member (String memberName, int memberAge,String libmessages, String memOccupation,
                   int totalFeesIncurred, String memberSince)
    {
        name = memberName;
        age = memberAge;
        messages = libmessages;
        totalFees = totalFeesIncurred;
        membershipDate = memberSince;
        booksBorrowed = new ArrayList<>();
        occupation = memOccupation;
    }

    /**
     * Get member's name.
     */
    public String getname ()
    {
        return name;
    }
    /**
     * Set member's name.
     */
    public void setname(String memberName)
    {
        name = memberName;
    }

    /**
     * Get member's age.
     */
    public int getage()
    {
        return age;
    }
    /**
     * Set member's age
     */
    public void setage(int memberAge)
    {
        age = memberAge;
    }

    /**
     * Get member's occupation.
     */
    public String getOccupation()
    {
        return occupation;
    }
    /**
     * Set member's occupation.
     */
    public void setOccupation(String memOccupation)
    {
        occupation = memOccupation;
    }

    /**
     * Get messages received by a member.
     */
    public String getmessages()
    {
        return messages;
    }
    /**
     * Set messages received by a member.
     */
    public void setmessages(String msg)
    {
        if (messages != null) {
            messages = messages +  ("\n") + msg;}
    }

    /**
     * Get the totalFees incurred by a member.
     */
    public int gettotalFees()
    {
        return totalFees;

    }
    /**
     * Set the total fees incurred by a member.
     */
    public void settotalFees (int fees)
    {
        totalFees = fees;
    }

    /**
     * Get the membership date of the member.
     */
    public String getmembershipDate()
    {
        return membershipDate;
    }
    /**
     * Set the membership date of the member.
     */
    public void setmembershipDate (String memberSince)
    {
        membershipDate = memberSince;
    }

    /**
     * Get a list of book borrowed by the member.
     */
    public ArrayList<PhysicalBook> getbooksBorrowed()
    {
        return booksBorrowed;
    }

    /**
     * Print all the details of a library member.
     */
    public void PrintMemberDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old.");
        System.out.println("Messages: " + messages);
        System.out.println("Occupation: " + occupation);
        if (totalFees == 0){
            System.out.println("Fees: No fees.");}
        else{
            System.out.println("fees incurred: £" + totalFees);}
        System.out.println("Member since : " + membershipDate);
        System.out.println("Books currently borrowed: " + booksBorrowed);
    }

    /**
     * Print messages received by a member.
     */
    public void printMessages()
    {
        System.out.print("Messages: " + "\n" + messages );
    }

    /**
     * Append a book object to the list of books borrowed.
     */
    public void borrow(PhysicalBook book)
    {
        booksBorrowed.add(book);
    }

    /**
     * Remove a book from the list borrowed books.
     */
    public void removeBook(PhysicalBook book)
    {
        booksBorrowed.remove(book);
    }

    /**
     * Print all the details of all the books currently borrowed by a member.
     */
    public void printAllBooksBorrowed()
    {
        for(PhysicalBook books : booksBorrowed){
            books.printDetails();
        }
    }

    /**
     * Return the number of books borrowed by a member.
     */
    public int returnNoBorrowed()
    {
        return booksBorrowed.size();
    }
}
