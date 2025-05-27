import java.util.*;
import java.io.*;
import java.awt.*;
/**
 * Write a description of class Vehicle here.
 *
 * @author Hannah Macartney
 * @version 21/03/25
 */
public class Vehicle
{
    private String group;
    private String vehID;
    private String regNo;
    private String make;
    private String model;
    private boolean airCon;
    private double engineSize;
    private String fuelType;
    private String gearbox;
    private String transmission;
    private int mileage;
    private String dateFirstRegistered;
    
    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle()
    {
        
    }

    /**
     * @returns group
     */
    public String getGroup()
    {
        return group;
    }
    
    /**
     * @returns vehID
     */
    public String getVehID()
    {
        return vehID;
    }
    
    /**
     * @returns regNo
     */
    public String getRegNo()
    {
        return regNo;
    }
    
    /**
     * @returns make
     */
    public String getMake()
    {
        return make;
    }
    
    /**
     * @returns model
     */
    public String getModel()
    {
        return model;
    }
    
    /**
     * @returns airCon
     */
    public boolean getAirCon()
    {
        return airCon;
    }
    
    /**
     * @returns engineSize
     */
    public double getEngineSize()
    {
        return engineSize;
    }
    
    /**
     * @returns fuelType
     */
    public String getFuelType()
    {
        return fuelType;
    }
    
    /**
     * @returns gearbox
     */
    public String getGearbox()
    {
        return gearbox;
    }
    
    /**
     * @returns transmission
     */
    public String getTransmission()
    {
        return transmission;
    }
    
    /**
     * @returns mileage
     */
    public int getMileage()
    {
        return mileage;
    }
    
    /**
     * @returns dateFirstRegistered
     */
    public String getDateFirstRegistered()
    {
        return dateFirstRegistered;
    }
    
    /**
     * prints vehicle details to the terminal
     */
    public void printDetails()
    {
        System.out.println("Group: " + group + " Vehicle ID: " + vehID + " Reg No: " + regNo + " Make: " + make);
        System.out.println("Air Conditioning/Climate Control: " + airCon);
        System.out.println("Engine Size: " + engineSize + " Fuel: " + fuelType);
        System.out.println("Gearbox: " + gearbox + " transmission: " + transmission);
        System.out.println("Mileage: " + mileage + " Date First Registered: " + dateFirstRegistered);
    }
    
    /**
     * Reads the vehicle data
     */
    public void readData(Scanner lineScanner)
    {
        group = lineScanner.next().trim();
        vehID = lineScanner.next().trim();
        regNo = lineScanner.next().trim();
        make = lineScanner.next().trim();
        model = lineScanner.next().trim();
        airCon = Boolean.parseBoolean(lineScanner.next().trim());
        engineSize = Double.parseDouble(lineScanner.next().trim());
        fuelType = lineScanner.next().trim();
        gearbox = lineScanner.next().trim();
        transmission = lineScanner.next().trim();
        mileage = Integer.parseInt(lineScanner.next().trim());
        dateFirstRegistered = lineScanner.next().trim();
        //lineScanner.close();
    }
}
