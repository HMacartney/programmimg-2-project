import java.util.*;
import java.io.*;
import java.awt.*;
/**
 * Write a description of class Customer here.
 *
 * @author Hannah Macartney
 * @version 21/03/25
 */
public class Customer
{
    private String customerID;
    private String surname;
    private String firstName;
    private String otherInitials;
    private String title;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String enterSurname, String enterFirstName, String enterOtherInitials, String enterTitle)
    {
        customerID = "unknown";
        surname = enterSurname;
        firstName = enterFirstName;
        otherInitials = enterOtherInitials;
        title = enterTitle;
    }
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        
    }
    
    /**
     * @returns customerID
     */
    public String getCustomerID()
    {
        return customerID;
    }
    
    /**
     * @sets a new customerID
     */
    public void setCustomerID(String newCustomerID)
    {
        customerID = newCustomerID;
    }
    
    /**
     * @returns surname
     */
    public String getSurname()
    {
        return surname;
    }
    
    /**
     * @returns firstName
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * @returns otherInitials
     */
    public String getOtherInitials()
    {
        return otherInitials;
    }
    
    /**
     * @returns title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * printsthe customer details
     */
    public void printDetails()
    {
        System.out.println("CustomerID: " + customerID + " Surname: " + surname + " First Name: " + firstName);
        System.out.println("Other Initials: " + otherInitials + " Title: " + title);
    }
    
    /**
     * reads the customer data
     */
    public void readData(Scanner lineScanner)
    {
        customerID = lineScanner.next().trim();
        surname = lineScanner.next().trim();
        firstName = lineScanner.next().trim();
        otherInitials = lineScanner.next().trim();
        title = lineScanner.next().trim();
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    public void writeData()
    {
        
    }
}
