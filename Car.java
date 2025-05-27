import java.util.*;
import java.io.*;
import java.awt.*;
/**
 * Write a description of class Car here.
 *
 * @author Hannah Macartney
 * @version 21/03/25
 */
public class Car extends Vehicle
{
    private String bodyType;
    private int noOfDoors;
    private int noOfSeats;

    /**
     * Constructor for objects of class Car
     */
    public Car()
    {
        
    }

    /**
     * prints the details of a car object
     */
    public void printDetails()
    {
        super.printDetails();
        System.out.println("Body Type: " + bodyType);
        System.out.println("Number of Doors: " + noOfDoors);
        System.out.println("Number of Seats: " + noOfSeats);
    }
    
    /**
     * reads the car data
     */
    public void readData(Scanner lineScanner)
    {
        super.readData(lineScanner);
        bodyType = lineScanner.next().trim();
        noOfDoors = Integer.parseInt(lineScanner.next().trim());
        noOfSeats = Integer.parseInt(lineScanner.next().trim());
    }
}
