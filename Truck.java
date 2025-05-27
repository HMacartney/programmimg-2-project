import java.util.*;
import java.io.*;
import java.awt.*;
/**
 * Write a description of class Truck here.
 *
 * @author Hannah Macartney
 * @version 21/03/25
 */
public class Truck extends Commercial
{
    private ArrayList<String> attributes;

    /**
     * Constructor for objects of class Truck
     */
    public Truck()
    {
        attributes = new ArrayList<String>();
    }

    /**
     * prints the details for a truck
     */
    public void printDetails()
    {
      super.printDetails();
      System.out.println("Attributes: " + attributes.toString());
    }
    
    /**
     * reads the truck data
     */
    public void readData(Scanner lineScanner)
    {
        super.readData(lineScanner);
        while(lineScanner.hasNext())
        {
            this.attributes.add(lineScanner.next().trim());
        }
    }
}
