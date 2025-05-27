import java.util.*;
import java.io.*;
import java.awt.*;
/**
 * Write a description of class Commercial here.
 *
 * @author Hannah Macartney
 * @version 21/03/25
 */
public class Commercial extends Vehicle
{
    private int payload;

    /**
     * Constructor for objects of class Commercial
     */
    public Commercial()
    {

    }

    /**
     * prints the details of a commercial vehicle
     */
    public void printDetails()
    {
        super.printDetails();
        System.out.println("Pay Load: " + payload);
    }
    
    /**
     * reads the commercial data
     */
    public void readData(Scanner lineScanner)
    {
        super.readData(lineScanner);
        payload = Integer.parseInt(lineScanner.next().trim());
    }
}
