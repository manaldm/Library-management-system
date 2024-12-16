package com.company;
/**
 * A class that contains information about ebook reader devices in the library.
 */
public class EBookReader {

    private String serialNumber;
    private String location;
    private boolean availability;

    /**
     * Constructor for objects of class EBookReader.
     */
    public EBookReader (String serialNum, String deviceLocation, boolean deviceAvailability)
    {

        serialNumber = serialNum;
        location = deviceLocation;
        availability = deviceAvailability;
    }

    /**
     * Get the serialNumber of an ebook reader.
     */
    public String getserialNumber ()
    {
        return serialNumber;

    }
    /**
     * Set the serialNumber of an ebook reader.
     */

    public void setserialNumber (String serialNum)
    {
        serialNumber = serialNum;

    }

    /**
     * Get the location of an ebook reader.
     */
    public String getlocation ()
    {
        return location;

    }
    /**
     * Set the location of an ebook reader.
     */
    public void setlocation (String deviceLocation)
    {
        location = deviceLocation;

    }

    /**
     * Get the availability of an ebook reader.
     */
    public boolean getavailability ()
    {
        return availability;

    }
    /**
     * Set the availability of an ebook reader.
     */
    public void setavailability (boolean isAvailable)
    {
        availability = isAvailable;

    }

    /**
     * Print the details of an ebook reader.
     */
    public void printDeviceDetails()
    {
        System.out.println("Serial number: " + serialNumber);
        System.out.println("Device location: " + location);
        if (availability == true)
            System.out.println("This device is currently available");
        else {
            System.out.println("This device is not currently available");
        }
    }

    /**
     * Check the availability of an ebook reader.
     */
    public void checkAvailability(){

        if (availability == true)
            System.out.println("This device is currently available");
        else {
            System.out.println("This device is not currently available");
        }
    }
}
