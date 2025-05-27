import java.util.*;
import java.io.*;
import java.awt.*;
/**
 * Write a description of class ReservationSystem here.
 *
 * @author Hannah Macartney
 * @version 21/03/25
 */
public class ReservationSystem
{
    private ArrayList<Vehicle> vehicleList;
    private ArrayList<Customer> customerList;
    private Random randomGenerator;
    private ArrayList<VehicleReservation> vehicleReservationMap;

    /**
     * Constructor for objects of class ReservationSystem
     */
    public ReservationSystem()
    {
        vehicleList = new ArrayList<Vehicle>();
        customerList = new ArrayList<Customer>();
        vehicleReservationMap = new ArrayList<VehicleReservation>();
    }

    /**
     * Takes a vehicle object and adds it to the array
     */
    public void storeVehicle(Vehicle vehicle)
    {
        vehicleList.add(vehicle);
    }
    
    /**
     * Prints the details of all the vehicles in the array to the terminal.
     */
    public void printAllVehicles()
    {
      int listPosition = 0;
      while( listPosition<vehicleList.size() )
      {
         Vehicle vehicle = vehicleList.get(listPosition);
         vehicle.printDetails();
         listPosition++;
      }
    }
    
    /**
     * Reads a text file and adds the vehicles to the array.
     */
    public void readVehicleData()
    {
        String typeOfData = "";
        Frame frame = null;
        FileDialog fileBox = new FileDialog(frame, "Open", FileDialog.LOAD);
        fileBox.setVisible(true);
        try
        {
            String fileName = fileBox.getFile();
            File dataFile = new File(fileName);
            Scanner scanner = new Scanner(dataFile);
            scanner.useDelimiter("/n");
            while(scanner.hasNextLine())
            {
                String lineOfText = scanner.nextLine();
                if(lineOfText.startsWith("["))
                {
                    typeOfData = lineOfText;
                }
                if(!lineOfText.isEmpty() && !lineOfText.startsWith("//"))
                {
                    Scanner lineScanner = new Scanner(lineOfText);
                    lineScanner.useDelimiter(",");
                    if(typeOfData.equals("[Car data]"))
                    {
                        Car car = new Car();
                        car.readData(lineScanner);
                        this.storeVehicle(car);
                    }
                    if(typeOfData.equals("[Van data]"))
                    {
                        Van van = new Van();
                        van.readData(lineScanner);
                        this.storeVehicle(van);
                    }
                    if(typeOfData.equals("[Truck data]"))
                    {
                        Truck truck = new Truck();
                        truck.readData(lineScanner);
                        this.storeVehicle(truck);
                    }
                    else{
                        Vehicle newvehicle = new Vehicle();
                        newvehicle.readData(lineScanner);
                        storeVehicle(newvehicle);
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
    
    /**
     * Takes a customer object and adds it to the array
     */
    public void storeCustomer(Customer customer)
    {
        if(customer.getCustomerID().equals("unkown"))
        {
            String newID = generateCustomerID("AB",6);
            customer.setCustomerID(newID);
        }
        customerList.add(customer);
    }
    
    /**
     * Prints the details of all the customers in the array to the terminal.
     */
    public void printAllCustomers()
    {
      int listPosition = 0;
      while(listPosition<customerList.size() )
      {
         Customer customer = customerList.get(listPosition);
         customer.printDetails();
         listPosition++;
      }
    }
    
    /**
     * Reads a text file and adds the customers to the array.
     */
    public void readCustomerData()
    {
        Frame frame = null;
        FileDialog fileBox = new FileDialog(frame, "Open", FileDialog.LOAD);
        fileBox.setVisible(true);
        try
        {
            String fileName = fileBox.getFile();
            File dataFile = new File(fileName);
            Scanner scanner = new Scanner(dataFile);
            while( scanner.hasNextLine())
            {
                String lineOfText = scanner.nextLine();
                if(!lineOfText.isEmpty() && !lineOfText.startsWith("//"))
                {
                    Scanner lineScanner = new Scanner(lineOfText);
                    lineScanner.useDelimiter(",");
                    Customer newcustomer = new Customer();
                    newcustomer.readData(lineScanner);
                    storeCustomer(newcustomer);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
    
    /**
    * Writes Customers data to a file
    */
    public void writeCustomerData()
    {
      Frame frame = null;
      FileDialog fileBox = new FileDialog(frame, "Open", FileDialog.LOAD);
      fileBox.setVisible(true);
      try
        {
          String fileName = fileBox.getFile();
          File dataFile = new File(fileName);
          PrintWriter pWriter = new PrintWriter(fileName);
          for(Customer customer: customerList)
          {
             String lineOfOutput = customer.getCustomerID() + ", " + customer.getSurname() 
             + ", " + customer.getFirstName() + ", " + customer.getOtherInitials() + ", " + customer.getTitle();
             pWriter.println(lineOfOutput);
          }
          pWriter.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
    
    /**
    * generates a random customer ID
    */
    public String generateCustomerID(String prefix, int digits)
    {
      Random randomGenerator = new Random();
      String ID = "";
      while(digits > 0)
      {
          int number = randomGenerator.nextInt(9);
          String numberToString = Integer.toString(number);
          ID += numberToString;
          digits--;
      }
      String randomID = prefix + ID;
      return randomID;
    }
    
    /**
     * Takes a vehicle Reservation object and adds it to the array
     */
    public void storeVehicleReservation(VehicleReservation vehicleReservation)
    {
        vehicleReservationMap.add(vehicleReservation);
    }
    
    /**
    * generates a random reservation number
    */
    public String generateReservationNo()
    {
      Random randomGenerator = new Random();
      String generateReservation = "";
      for(int i=0; i<6; i++)
      {
          int number = randomGenerator.nextInt(9);
          String numberToString = Integer.toString(number);
          generateReservation += numberToString;
      }
      return generateReservation;
    }
    
    /**
     * @returns Vehicle Reservation
     */
    public void getVehicleReservation()
    {
      
    }
    
    /**
     * Makes a new Vehicle reservation
     */
    public void makeVehicleReservation(String customerID, String vehID, String startDate, int noOfDays)
    {
        String ReservationNo = generateReservationNo();
        //VehicleReservation vehicleRes = new VehicleReservation(customerID, vehID, startDate, noOfDays);
    }
    
    /**
     * Prints the details of all the Vehicle reservations in the array to the terminal.
     */
    public void printAllVehicleReservations()
    {
      int listPosition = 0;
      while(listPosition<vehicleReservationMap.size() )
      {
         VehicleReservation vehicleReservation = vehicleReservationMap.get(listPosition);
         vehicleReservation.printDetails();
         listPosition++;
      }
    }
}
