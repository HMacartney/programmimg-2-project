import java.util.*;
import java.io.*;
import java.awt.*;
/**
 * Write a description of class Van here.
 *
 * @author Hannah Macartney
 * @version 21/03/25
 */
public class Van extends Commercial
{
    private int loadVolume;
    private boolean slidingSideDoor;

    /**
     * Constructor for objects of class Van
     */
    public Van()
    {
    
    }

    /**
     * prints the details for a van
     */
    public void printDetails()
    {
        super.printDetails();
        System.out.println("Load Volume: " + loadVolume);
        System.out.println("Sliding Side Door: " + slidingSideDoor);
    }
    
    /**
     * reads the van data
     */
    public void readData(Scanner lineScanner)
    {
        super.readData(lineScanner);
        loadVolume = Integer.parseInt(lineScanner.next().trim());
        slidingSideDoor = Boolean.parseBoolean(lineScanner.next().trim());
    }
}
